package com.lango.langoclientsdk;

import com.lango.langoclientsdk.client.LangoApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lango
 * @version 1.0
 */
@Configuration
@ConfigurationProperties("lango.client")
@Data
@ComponentScan
public class langoClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public LangoApiClient langoApiClient() {
        return new LangoApiClient(accessKey,secretKey);
    }
}
