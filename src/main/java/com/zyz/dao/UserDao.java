package com.zyz.dao;

import com.zyz.model.UserDomain;

import java.util.List;

/**
 * Created by yongzhen.zhao on 2018/7/3.
 */
public interface UserDao {

    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}
