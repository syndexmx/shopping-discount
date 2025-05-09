package com.github.syndexmx.shopping_discount.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@Data
@ConfigurationProperties(prefix = "spring.kafka")
public class KafkaTopicConfig {
    private List<TopicConfig> topics;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> kafkaAdminConfig = new HashMap<>();
        kafkaAdminConfig.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        kafkaAdminConfig.put("offsets.topic.replication.factor", "1");
        kafkaAdminConfig.put("transaction.state.log.replication.factor", "1");
        kafkaAdminConfig.put("transaction.state.log.min.isr", "1");
        return new KafkaAdmin(kafkaAdminConfig);
    }

    @Bean
    public List<NewTopic> createTopics() {
        return topics.stream()
                .map(topic -> {
                    return new NewTopic(topic.getName(), topic.getPartitions(), topic.getReplicationFactor());
                })
                .toList();
    }

    public static class TopicConfig {

        @Getter
        @Setter
        private String name;

        @Getter
        @Setter
        private int partitions;

        @Getter
        @Setter
        private short replicationFactor;

    }
}
