package com.shm.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Auther: shm
 * @Date: 2019/5/6
 * @Description: com.shm.order.message
 * @version: 1.0
 */
public interface StreamClient {

    String Input = "myInput";
    String Output = "myOutput";
    @Input(StreamClient.Input)
    SubscribableChannel input();

    @Output(StreamClient.Output)
    MessageChannel output();

}
