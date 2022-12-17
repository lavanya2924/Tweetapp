package com.tweetapp.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// The Springfox suite of java libraries generates human readable specifications for JSON APIs
@Configuration  //@Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions
public class SpringfoxConfig {                                    
    @Bean      //classes which encapsulate several objects into a single object //The annotation supports most of the attributes offered by <bean/> , such as:  autowiring, dependency injection, Getter-Setter Methods //  Spring Bean annotation is usually declared in Configuration classes methods. This annotation is also a part of the spring core framework 
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
}