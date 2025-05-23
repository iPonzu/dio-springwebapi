package dio.web.api.doc;

import java.util.HashSet;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato(){
        return new Contact(
            "CharmKMagazine",
            "https://charmkmagazine.com.br",
            "myemail@email.com"
        );
    }
    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("API REST");
        apiInfoBuilder.description("API REST de uso de Springboot REST API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termos de uso: Termos de uso");
        apiInfoBuilder.license("Licença - CharmKMagazine");
        apiInfoBuilder.licenseUrl("https://charmkmagazine.com.br");
        apiInfoBuilder.contact(this.contato());
        return apiInfoBuilder;
    }
    @Bean
    public Docket detalheApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        
        docket
            .select()
            .apis(RequestHandlerSelectors.basePackage("pacote.comseus.controllers"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(this.informacoesApi().build())
            .consumes(new HashSet<String>(Arrays.asList("application/json")))
            .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }
}
