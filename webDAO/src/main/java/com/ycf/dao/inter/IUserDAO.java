package com.ycf.dao.inter;

import com.ycf.entity.UserInfoEntity;

import java.util.List;

/**
 * Created by sniper on 16-8-29.
 */
public interface IUserDAO {
    List<UserInfoEntity> getUserById(Integer userId);
}
