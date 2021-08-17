package com.example.sweater.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Value("${upload.path}")
    private String uploadPath;

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
     //   String filename = Paths.get("/", uploadPath).normalize().toString();
      //  String filename = Path.of(uploadPath).toUri().toString();
        String curuploadPath = "file:/" + uploadPath + "/";

        registry.addResourceHandler("/img/**")
                .addResourceLocations(curuploadPath);

        registry.addResourceHandler("/img/**")
                .addResourceLocations(curuploadPath);
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
}
