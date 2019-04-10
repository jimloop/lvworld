package com.zzuli.dao;

import com.zzuli.pojo.User;


/**
 * Created by lxf on 2019/3/25.
 */
public interface IUserDao {
        User selectUser(long id);
    }
