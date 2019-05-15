package com.shm.product.VO;

import lombok.Data;

/**
 * @Auther: shm
 * @Date: 2019/5/1
 * @Description: com.shm.product.VO http请求返回的最外层对象
 * @version: 1.0
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
