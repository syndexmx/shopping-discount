package com.github.syndexmx.shopping_discount.controller.kafka.consumer;

import com.github.syndexmx.shopping_discount.controller.kafka.enums.DiscountReason;
import com.github.syndexmx.shopping_discount.service.handler.DiscountRequestHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class DiscountRequestListener {

    private final Map<DiscountReason, DiscountRequestHandler> reasonHandlers;

    @KafkaListener(topics = "discount-requests", containerFactory = "kafkaListenerContainerFactory")
    public void consumeDiscountRequest(ConsumerRecord<String, String> record) {
        DiscountReason discountReason = DiscountReason.fromString(record.value());

    }

    private DiscountReason getDiscountReason(ConsumerRecord<String, String> record) {
        var commandHeader = record.headers().lastHeader("reason");
        if (commandHeader != null) {
            return DiscountReason.fromString(new String(commandHeader.value()));
        } else {
            return DiscountReason.UNDEFINED;
        }
    }
}
