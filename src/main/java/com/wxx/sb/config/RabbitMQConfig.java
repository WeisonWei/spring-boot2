package com.wxx.sb.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置
 */
@Configuration
public class RabbitMQConfig {

    //topic
    public static final String TOPIC_QUEUE1 = "wxx.tp.q1";
    public static final String TOPIC_QUEUE2 = "wxx.tp.q2";
    public static final String TOPIC_QUEUE3 = "wxx.tp.q3";

    public static final String TOPIC_EXECHANGE = "wxx.tp.exechange";

    public static final String ROUTING_KEY = "wxx.tp";


    @Bean
    public Queue topicQueue1() {
        return new Queue(TOPIC_QUEUE1);
    }

    @Bean
    public Queue topicQueue2() {
        return new Queue(TOPIC_QUEUE2);
    }

    @Bean
    public Queue topicQueue3() {
        return new Queue(TOPIC_QUEUE3);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(TOPIC_EXECHANGE);
    }


    @Bean
    public Binding topicExchangeBinding() {
        return BindingBuilder.bind(topicQueue1()).to(topicExchange()).with(ROUTING_KEY);
    }
}
