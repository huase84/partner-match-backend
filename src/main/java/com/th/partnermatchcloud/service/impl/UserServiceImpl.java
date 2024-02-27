package com.th.partnermatchcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.th.partnermatchcloud.dto.Result;
import com.th.partnermatchcloud.entity.User;
import com.th.partnermatchcloud.mapper.UserMapper;
import com.th.partnermatchcloud.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/** @author ninelock-ai */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public Result userList() {
        List<User> list = query().list();
        return Result.ok(list);
    }
}
