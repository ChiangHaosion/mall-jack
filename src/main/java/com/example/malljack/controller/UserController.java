package com.example.malljack.controller;

import com.example.malljack.common.CodeMsg;
import com.example.malljack.common.CommonResult;
import com.example.malljack.domain.User;
import com.example.malljack.service.IUserService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/27
 * @Version V1.0
 **/
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public CommonResult register(@RequestBody User user){
        if (!StringUtils.hasLength(user.getPassword())){
            return CommonResult.error(CodeMsg.PARAERROR);
        }
        if (!StringUtils.hasLength(user.getUsername())){
            return CommonResult.error(CodeMsg.PARAERROR);
        }
        userService.register(user);
        return CommonResult.success("","注册成功");

    }
}
