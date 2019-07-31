package com.demo.work.exception;

/**
 * @ClassName NotFindCommodityException
 * 没找到商品异常
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月31日  09:39:32
 * @Version 1.0.0
 */

public class NotFindCommodityException extends Exception{

    public NotFindCommodityException(){

    }

    public NotFindCommodityException(String message){
        super(message);

    }
    @Override
    public String getMessage(){

        //判断是否存在错误信息
        if(super.getMessage()==null){
            return "Error：未找到商品！";
        }
        return  super.getMessage();
    }


}
