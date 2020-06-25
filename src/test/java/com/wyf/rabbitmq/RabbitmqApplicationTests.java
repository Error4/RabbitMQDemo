package com.wyf.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    void send() {
        String context = "OneByOneSender";
        System.out.println("DirectProducer发送消息 : " + context);
        rabbitTemplate.convertAndSend("TestDirectExchange", "TestDirectRouting", context);
    }

}
