package com.hongghe.hiberanteexample;

import com.hongghe.hiberanteexample.config.User;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hibernateexammple")
@Data
public class HibernateExampleExampleConfig {

    private static final Logger logger = LoggerFactory.getLogger(HibernateExampleWebConfig.class);

    private User user = new User();
}
