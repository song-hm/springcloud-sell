package com.shm.product.enums;

import lombok.Getter;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.product.enums 商品上下架状态
 * @version: 1.0
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架"),
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
