package com.wcp.equipment.service.impl;

import com.wcp.equipment.dao.UserMapper;
import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.pojo.User;
import com.wcp.equipment.pojo.UserExample;
import com.wcp.equipment.service.IUser;
import com.wcp.equipment.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserImpl implements IUser {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result<User> register(String username, String password) throws Exception{
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (null!=users && users.size()>0){
            return new Result(1,"该用户名已注册");
        }else {
            String id = UUID.getAccountIdByUUId();
            User user = new User();
            user.setId(id);
            user.setUsername(username);
            user.setPassword(UUID.encoderByMd5(password));
            int i = userMapper.insertSelective(user);
            if (i>0){
                user.setPassword("");
                return new Result<User>(user);
            }else {
                return new Result("注册失败，插入数据库失败");
            }
        }
    }

    @Override
    public Result login(String username, String password) throws  Exception{
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(UUID.encoderByMd5(password));
        List<User> users = userMapper.selectByExample(userExample);
        if (null!=users && users.size()>0){
            users.get(0).setPassword("");
            return new Result<User>(users.get(0));
        }else {
            return new Result("用户名或者密码错误");
        }
    }

    @Override
    public Result<User> selectUser(String userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        return new Result<>(user);
    }
}
