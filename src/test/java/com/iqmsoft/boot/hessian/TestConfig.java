package com.iqmsoft.boot.hessian;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.iqmsoft.boot.hessian.HessianService;

@Configuration
public class TestConfig {

    @Bean
    public HessianProxyFactoryBean hessianClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8080/HessianService");
        factory.setServiceInterface(HessianService.class);
        return factory;
    }
}
