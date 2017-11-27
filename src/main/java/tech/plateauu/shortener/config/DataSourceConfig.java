package tech.plateauu.shortener.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties(prefix="app.datasource")
class DataSourceConfig {

    @Bean
    DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
