package com.wxx.sb.rabbitmq;

import com.wxx.sb.config.RabbitMQConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * RabbitMQ生成端
 */
@Component
public class TopicProducerHandler {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(Object o) {
        amqpTemplate.convertAndSend(RabbitMQConfig.TOPIC_EXECHANGE, RabbitMQConfig.ROUTING_KEY, o);
    }
}
