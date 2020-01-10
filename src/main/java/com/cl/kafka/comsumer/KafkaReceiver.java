package com.cl.kafka.comsumer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author chenling
 * @date 2020/1/10 15:16
 * @since V1.0.0
 */
@Slf4j
@Component
public class KafkaReceiver {

        @KafkaListener(topics = {"hello"})
        public void listen(ConsumerRecord<?,?> record){
            Optional<?> kafkaMessage = Optional.ofNullable(record.value());
            if (kafkaMessage.isPresent()) {
                Object message = kafkaMessage.get();
                log.info("消息记录:{}" , record);
                log.info("消息内容:{}" , message);
            }
        }

}
