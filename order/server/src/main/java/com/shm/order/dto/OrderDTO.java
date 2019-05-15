package com.shm.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shm.order.dataobject.OrderDetail;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-10 16:42
 */
@Data
public class OrderDTO implements Serializable {

    /** 订单id. */
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家手机号. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信Openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer orderStatus;

    /** 支付状态, 默认为0未支付. */
    private Integer payStatus;

    @JsonIgnore
    private List<OrderDetail> orderDetailList;
}
