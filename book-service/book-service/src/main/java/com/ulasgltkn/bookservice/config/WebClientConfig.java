package com.ulasgltkn.bookservice.config;

import com.ulasgltkn.bookservice.client.CustomerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientConfig {
   @Autowired
    private LoadBalancedExchangeFilterFunction filterFunction;

   @Bean
    public WebClient customerWebClient(){
        return WebClient.builder().baseUrl("http://customer-service").filter(filterFunction).build();
    }
    @Bean
    public CustomerClient customerClient(){
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory.builderFor(WebClientAdapter.create(customerWebClient())).build();
        return httpServiceProxyFactory.createClient(CustomerClient.class);
    }
}
