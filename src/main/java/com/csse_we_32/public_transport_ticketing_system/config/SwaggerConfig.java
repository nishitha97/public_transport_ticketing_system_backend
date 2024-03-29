package com.csse_we_32.public_transport_ticketing_system.config;

import com.csse_we_32.public_transport_ticketing_system.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Swagger configuration properties
 *
 * run on http://localhost:8081/swagger-ui.html
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    ApplicationProperties applicationProperties;

    @Bean
    public Docket assignmentApi() {
        //all controllers in the given package will be added to SwaggerUI
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(Constants.BASE_PACKAGE))
                .paths(regex(Constants.SWAGGER_PATH))
                .build()
                .apiInfo(metaData());
    }

    //setting metaData
    private ApiInfo metaData() {

        return new ApiInfoBuilder().title(applicationProperties.getSwagger().getTitle()).description(applicationProperties.getSwagger().getDescription()).version(applicationProperties.getSwagger().getVersion()).build();

    }
}
