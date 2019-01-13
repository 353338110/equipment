package com.wcp.equipment.controller;

import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.pojo.User;
import com.wcp.equipment.service.IUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@CrossOrigin( maxAge = 3600)
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUser iUser;

    @RequestMapping("/register")
    @ResponseBody
    public Result<User> register(@RequestParam String username, @RequestParam String password) throws  Exception{
        if (null==username || !"".equals(username)){
            if (null==password || !"".equals(password)){
               return iUser.register(username,password);
            }else {
                return new Result(0,"密码不能为空");
            }
        }else {
            return new Result(0,"用户名不能为空");
        }
    }

    @RequestMapping("/login")
    @ResponseBody
    private Result<User> login(@RequestParam String username, @RequestParam String password) throws  Exception{
        if (null==username || !"".equals(username)){
            if (null==password || !"".equals(password)){
                return iUser.login(username,password);
            }else {
                return new Result(0,"密码不能为空");
            }
        }else {
            return new Result(0,"用户名不能为空");
        }
    }
}
