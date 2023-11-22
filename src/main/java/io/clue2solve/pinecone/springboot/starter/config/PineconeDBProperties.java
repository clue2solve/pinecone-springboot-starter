package io.clue2solve.pinecone.springboot.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ConfigurationProperties(prefix = "pinecone.db")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PineconeDBProperties {
    private String environment;
    private String projectId;
    private String apiKey;

    // getters and setters...
}
