package com.csse_we_32.public_transport_ticketing_system.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

    private final Swagger swagger = new Swagger();

    /**
     * @return swagger from application properties
     */
    public Swagger getSwagger() {
        return swagger;
    }

    public static class Swagger {

        private String title;
        private String description;
        private String version;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }

}
