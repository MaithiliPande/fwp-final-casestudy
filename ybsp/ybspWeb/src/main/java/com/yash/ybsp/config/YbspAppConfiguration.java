package com.yash.ybsp.config;

import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.yash.ybsp")
@PropertySource({"${app.config}"})
public class YbspAppConfiguration extends SpringBootServletInitializer {

}
