package com.egovja.samples.microservices.mvprofile.swaggerconfig;


import io.swagger.annotations.Contact;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

@SwaggerDefinition(
        info = @Info(
                description = "Awesome Resources",
                version = "V0.0.1",
                title = "TAJ Mobile Services API",
                contact = @Contact(
                   name = "Jon Smith", 
                   email = "api@example.com", 
                   url = "http://www.example.com"
                ),
                license = @License(
                   name = "Apache 2.0", 
                   url = "http://www.apache.org/licenses/LICENSE-2.0"
                )
        ),
        consumes = {"application/json"},
        produces = {"application/json"},
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
        externalDocs = @ExternalDocs(value = "Read This", url = "http://example.com")
)
public interface ApiDocumentationConfig {

}