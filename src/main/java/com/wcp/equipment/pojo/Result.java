package com.wcp.equipment.pojo;

import lombok.Data;

@Data
public class Result<T> {
    /**
     * 1  用户名已注册
     */
    private int status;
    private String message;
    private T data;

    public Result(){
        this.status = 200;
        this.message ="success";
    }

    /**
     * 查询成功回调
     * @param data
     */
    public Result(T data){
        this.status = 200;
        this.message = "success";
        this.data = data;
    }

    /**
     * 查询失败回调
     * @param status
     * @param message
     */
    public Result(int status,String message){
        this.status = status;
        this.message = message;
    }

}
