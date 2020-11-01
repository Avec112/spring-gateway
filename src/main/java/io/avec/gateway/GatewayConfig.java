
package io.avec.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // > http :8080/get
                .route(p -> p.path("/get")
                        .uri("http://httpbin.org:80"))
                // > http :8080/users/1 host:www.cnn.com
                .route(p -> p/*.path("/users/**")
                        .and()*/
                        .host("**.cnn.com")
                        .uri("https://jsonplaceholder.typicode.com"))
                // > http :8080/headers
                .route(p -> p.path("/headers")
                        .filters(f -> f.addRequestHeader("myHeader", "myHeaderValue"))
                        .uri("http://httpbin.org:80"))
                .build();
    }
}
