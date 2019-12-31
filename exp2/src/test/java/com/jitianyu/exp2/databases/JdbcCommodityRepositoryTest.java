package com.jitianyu.exp2.databases;

import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

import com.jitianyu.exp2.domain.Commodity;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * JdbcCommodityRepositoryTest
 */
public class JdbcCommodityRepositoryTest {
    private CommodityRepository commodityRepository;

    @BeforeEach
    public void setUp() {
        DataSource dataSource = getHikariDataSource();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        commodityRepository = new JdbcCommodityRepository(jdbcTemplate);
    }

    @Test
    public void testCreatCommdity() {
        Commodity commodity = new Commodity();
        Commodity createdCommodity = commodityRepository.save(commodity);
        // Assertions.assertNotNull(createdCommodity, "got unexpected null");
    }

    private HikariDataSource getHikariDataSource() {
        HikariConfig config = new HikariConfig();

        YamlPropertySourceLoader yamlPropertySourceLoader = new YamlPropertySourceLoader();

        Resource resource = new ClassPathResource("application-unittest.yml");
        List<PropertySource<?>> propertySources = null;

        try {
            propertySources = yamlPropertySourceLoader.load("unit-test", resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jdbcUrl = (String) propertySources.get(0).getProperty("spring.datasource.url");
        config.setJdbcUrl(jdbcUrl);

        String username = (String) propertySources.get(0).getProperty("spring.datasource.username");
        config.setUsername(username);

        String password = (String) propertySources.get(0).getProperty("spring.datasource.password");
        config.setPassword(password);

        Integer connectionTimeout = (Integer) propertySources.get(0)
                .getProperty("spring.datasource.hikari.connection-timeout");
        config.setConnectionTimeout(connectionTimeout);

        Integer idleTimeout = (Integer) propertySources.get(0).getProperty("spring.datasource.hikari.idle-timeout");
        config.setIdleTimeout(idleTimeout);

        Integer maxLifeTime = (Integer) propertySources.get(0).getProperty("spring.datasource.hikari.max-lifetime");
        config.setMaxLifetime(maxLifeTime);

        return new HikariDataSource(config);
    }
}