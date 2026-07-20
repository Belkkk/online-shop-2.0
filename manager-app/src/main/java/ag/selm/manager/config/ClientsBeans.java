package ag.selm.manager.config;

import ag.selm.manager.controller.client.RestClientProductsRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientsBeans {

    @Bean
    public RestClientProductsRestClient productsRestClient(
            @Value("${selmag.service.catalog.uri:http://localhost:8080}") String catalogueBaseUri) {
        return new RestClientProductsRestClient(RestClient.builder()
                .baseUrl(catalogueBaseUri)
                .build());
    }
}
