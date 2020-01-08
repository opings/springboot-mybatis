package com.zyz.service;

import com.github.pagehelper.PageInfo;
import com.zyz.model.UserDomain;

/**
 * Created by yongzhen.zhao on 2018/7/3.
 */
public interface UserService {
    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
