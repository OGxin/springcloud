package com.ozx.robot.controller;

import com.ozx.robot.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "用户管理接口")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    @ResponseBody
    @ApiOperation("获取所有用户信息")
    public Object getUser(){
        return userMapper.selectByExample(null);
    }
}
