package com.demo.work.exceptions;

/**
 * 库存不足异常
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 09:47:24
 */
public class InventoryException extends Exception {

    public InventoryException() {

    }

    public InventoryException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        if(super.getMessage()==null) {
            return "错误: 商品库存不足!";
        }
        return super.getMessage();
    }

}
