package com.reborne.light;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableCaching
public class AdvancedGreetingLightRestApp 
{
    public static void main( String[] args ) throws Exception {
        SpringApplication.run(AdvancedGreetingLightRestApp.class, args);
    }
    
    // not for production USE!
    @Bean
    public CacheManager cacheManager() {
    	ConcurrentMapCacheManager cacheManager =
    			new ConcurrentMapCacheManager("greetings");
    	return cacheManager;
    }
}
