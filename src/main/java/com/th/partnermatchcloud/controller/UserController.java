package com.th.partnermatchcloud.controller;

import com.th.partnermatchcloud.dto.Result;
import com.th.partnermatchcloud.service.IUserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/** @author <no value> */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/list")
    public Result list() {
        return userService.userList();
    }


}
