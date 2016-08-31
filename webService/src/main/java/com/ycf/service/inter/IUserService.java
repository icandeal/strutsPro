package com.ycf.service.inter;

import com.ycf.entity.UserInfoEntity;

import java.util.List;

/**
 * Created by sniper on 16-8-16.
 */
public interface IUserService {
    List<UserInfoEntity> getUserById(Integer userId);
}
