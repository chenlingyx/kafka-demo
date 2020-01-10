package com.cl.kafka.provider;

import com.alibaba.fastjson.JSONObject;
import com.cl.kafka.entity.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author chenling
 * @date 2020/1/10 15:08
 * @since V1.0.0
 */
@Component
@Slf4j
public class KafkaSender {

    @Autowired
    private KafkaTemplate<String,Object>  kafkaTemplate;

    public  void send(){
        Message message = new Message();
        message.setId(1);
        message.setMsg(" hello world !");
        message.setSendTime(new Date());
        log.info("发送信息：{}",message);
        kafkaTemplate.send("hello", JSONObject.toJSONString(message));
    }
}
