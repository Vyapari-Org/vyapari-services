package rita.artha.shastra.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info((new Info()
                        .title("Vyapari Services API")
                        .description("API documentation for Vyapari Services")
                        .version("v1.0")));
    }
}
