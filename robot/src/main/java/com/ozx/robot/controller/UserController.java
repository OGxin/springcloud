package com.ozx.robot.controller;

import com.ozx.robot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: UserController
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/10/25 17:34
 * @Version： 1.0
 **/
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    @ResponseBody
    public Object getUser(){
        return userMapper.selectByExample(null);
    }
}
