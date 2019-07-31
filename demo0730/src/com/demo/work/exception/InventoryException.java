package com.demo.work.exception;

/**
 * @ClassName InventoryException
 * 库存不足
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月31日  09:46:49
 * @Version 1.0.0
 */

public class InventoryException extends  Exception{

    public InventoryException() {
    }

    public InventoryException(String message) {
        super(message);
    }

    public String getMessage(){

        //判断是否存在错误信息
        if(super.getMessage()==null){
            return " Error：商品库存不足！";
        }
        return  super.getMessage();
    }
}
