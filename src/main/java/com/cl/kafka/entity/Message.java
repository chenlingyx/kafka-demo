package com.cl.kafka.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author chenling
 * @date 2020/1/10 15:04
 * @since V1.0.0
 */
@Data
public class Message {

    private  Integer id;


    private  String  msg;


    private Date sendTime;


}
