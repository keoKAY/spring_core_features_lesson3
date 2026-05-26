package co.istad.springcorefeatures;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app-config")
@Setter
@Getter
public class AppProperties {
    private String name;
    private String description;
    private String version;
    private Security security;
    private Kafka kafka;

    @Getter
    @Setter
    public static class Security{
        private String jwtSecret;
        private int expiration;
    }

    @Getter
    @Setter
    public static class Kafka{
        private String topic;
        private int retryCount;
    }
}
