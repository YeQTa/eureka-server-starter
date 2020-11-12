package com.example.eureka;

/**
 * @author Yekta Anil Aksoy
 * @date 12.11.2020
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SimpleEurekaServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SimpleEurekaServerApplication.class, args);
  }

}
