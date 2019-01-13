package com.wcp.equipment.service;

import com.wcp.equipment.pojo.Result;
import com.wcp.equipment.pojo.User;

public interface IUser {

    Result register(String username,String password)throws Exception;
    Result login(String username,String password) throws  Exception;
    Result<User> selectUser(String userId);
}
