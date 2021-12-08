/*
 * Copyright 2021 by AnhNBT
 */
package vn.aptech.action;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import vn.aptech.model.User;
import vn.aptech.utils.DBConnection;

/**
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
public class Login extends ActionSupport {

    private String username;
    private String password;
    private List<User> users = new ArrayList<>();

    @Override
    public void validate() {
        if (username == null || username.length() == 0) {
            addFieldError("username", "Username is required.");
        }

        if (password == null || password.length() == 0) {
            addFieldError("password", "Password is required.");
        }
    }

    @Override
    public String execute() throws Exception {
        Connection conn = DBConnection.getConnection();
        String queryString = "SELECT * FROM users WHERE username = ? AND password = ?";
        PreparedStatement pstmt = conn.prepareStatement(queryString);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        if (rs.next()) {
            session.setAttribute("username", username);
            queryString = "SELECT * FROM users ORDER BY id DESC";
            PreparedStatement pstmtSelectAll = conn.prepareStatement(queryString);
            ResultSet rsAll = pstmtSelectAll.executeQuery();
            while (rsAll.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                users.add(user);
            }
            return SUCCESS;
        }
        return ERROR;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
