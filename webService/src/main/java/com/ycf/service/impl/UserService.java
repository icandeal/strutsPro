package com.ycf.service.impl;

import com.ycf.dao.inter.IUserDAO;
import com.ycf.entity.UserInfoEntity;
import com.ycf.service.inter.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sniper on 16-8-16.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    IUserDAO  userDAO;

    public List<UserInfoEntity> getUserById(Integer userId) {
        return userDAO.getUserById(userId);
    }
}
