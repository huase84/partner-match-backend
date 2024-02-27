package com.th.partnermatchcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.th.partnermatchcloud.dto.Result;
import com.th.partnermatchcloud.entity.User;

public interface IUserService extends IService<User> {
    public Result userList();

}
