package com.example.rest;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        tags = {
                @Tag(name="widget", description="Widget operations."),
                @Tag(name="gasket", description="Operations related to gaskets")
        },
        info = @Info(
                title="Example API",
                version = "1.0.1",
                contact = @Contact(
                        name = "Example API Support",
                        url = "http://exampleurl.com/contact",
                        email = "techsupport@example.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"))
)
public class QuarkusRestApiDocumentationApplication extends Application {
    // OR instead of this we can use a property approach
    // add the following to the application.properties:
        /*
        quarkus.smallrye-openapi.info-title=Example API
        %dev.quarkus.smallrye-openapi.info-title=Example API (development)
        %test.quarkus.smallrye-openapi.info-title=Example API (test)
        quarkus.smallrye-openapi.info-version=1.0.1
        quarkus.smallrye-openapi.info-description=Just an example service
        quarkus.smallrye-openapi.info-terms-of-service=Your terms here
        quarkus.smallrye-openapi.info-contact-email=techsupport@example.com
        quarkus.smallrye-openapi.info-contact-name=Example API Support
        quarkus.smallrye-openapi.info-contact-url=http://exampleurl.com/contact
        quarkus.smallrye-openapi.info-license-name=Apache 2.0
        quarkus.smallrye-openapi.info-license-url=https://www.apache.org/licenses/LICENSE-2.0.html
        */
}
