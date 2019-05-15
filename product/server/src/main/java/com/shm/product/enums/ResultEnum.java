package com.shm.product.enums;

import lombok.Getter;

/**
 * @Auther: shm
 * @Date: 2019/5/2
 * @Description: com.shm.product.enums
 * @version: 1.0
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"库存有误"),
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
