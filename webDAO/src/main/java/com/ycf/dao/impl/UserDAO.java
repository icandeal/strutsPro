package com.ycf.dao.impl;

import com.ycf.dao.inter.IUserDAO;
import com.ycf.entity.UserInfoEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sniper on 16-8-29.
 */
@Component
public class UserDAO extends BaseDAO<UserInfoEntity, String> implements IUserDAO{

    public List<UserInfoEntity> getUserById(Integer userId){
        return queryHql("from UserInfoEntity where userId=?", userId);
    }
}
