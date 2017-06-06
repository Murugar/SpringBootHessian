package com.iqmsoft.boot.hessian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

@SpringBootApplication
public class Application {

    @Autowired
    private HessianService hessianService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "/HessianService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(hessianService);
        exporter.setServiceInterface(HessianService.class);
        return exporter;
    }


}
