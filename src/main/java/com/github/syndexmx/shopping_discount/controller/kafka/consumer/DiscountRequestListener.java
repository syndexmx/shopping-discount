package com.github.syndexmx.shopping_discount.controller.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DiscountRequestListener {

        @KafkaListener(topics = "discount-requests", containerFactory = "kafkaListenerContainerFactory")
        public void consumeDiscountCommand(ConsumerRecord<String, String> record) {

        }
}
