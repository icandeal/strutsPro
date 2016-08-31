package com.ycf.controller;

import com.ycf.entity.UserInfoEntity;
import com.ycf.service.inter.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by sniper on 16-8-16.
 */
@Controller
public class UserAction extends BaseAction{
    @Autowired
    private IUserService userService;

    private String userName;

    private List<UserInfoEntity> userList;

    private Integer userId;

    public String execute() throws Exception {
        userList = userService.getUserById(userId);
        getContext().put("userList", userList);
        getContext().put("userName","ycf");

        return SUCCESS;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<UserInfoEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<UserInfoEntity> userList) {
        this.userList = userList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
