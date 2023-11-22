package io.clue2solve.pinecone.springboot.starter.autoconfigure;

import io.clue2solve.pinecone.javaclient.PineconeDBClient;
import io.clue2solve.pinecone.javaclient.PineconeIndexClient;
import io.clue2solve.pinecone.springboot.starter.config.PineconeDBProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(PineconeDBClient.class)
@ConditionalOnProperty(name = {"pinecone.db.environment", "pinecone.db.projectId", "pinecone.db.apiKey"})
@EnableConfigurationProperties(PineconeDBProperties.class)
public class PineconeDBAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public PineconeDBClient pineconeDBClient(PineconeDBProperties properties) {
        return new PineconeDBClient(properties.getEnvironment(), properties.getProjectId(), properties.getApiKey());
    }
    @Bean
    @ConditionalOnMissingBean
    public PineconeIndexClient pineconeIndexClient(PineconeDBProperties properties) {
        return new PineconeIndexClient(properties.getEnvironment(), properties.getApiKey());
    }
}