package com.shm.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @Auther: shm
 * @Date: 2019/5/6
 * @Description: com.shm.order.message
 * @version: 1.0
 */
@Slf4j
@Component
@EnableBinding(StreamClient.class)
public class StreamReceiver {
/*

    @StreamListener(StreamClient.Input)
    @SendTo(StreamClient.Output)
    public Object processInput(Object message){
        return "receiver";
    }

    @StreamListener(StreamClient.Output)
    public void processOutput(Object message){
        log.info("StreamReceiver:{}",message);
    }
*/

}
