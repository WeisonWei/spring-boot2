package com.wxx.sb.rabbitmq;

import com.wxx.sb.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * RabbitMQ消费端
 */
@Component
public class TopicConsumerHandler {

    @RabbitListener(queues = RabbitMQConfig.TOPIC_QUEUE1)
    public void consum(Object o) {
        System.out.println("------>" + o.toString());
    }

}
