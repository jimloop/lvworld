package com.zzuli.service.Impl;


import com.zzuli.dao.IUserDao;
import com.zzuli.pojo.User;
import com.zzuli.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lxf on 2019/3/25.
 */
    @Service("userService")
    public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

        @Override
        public User selectUser(long userId) {
            return userDao.selectUser(userId);
        }
    }
