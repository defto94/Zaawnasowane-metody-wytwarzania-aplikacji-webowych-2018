package pl.lodz.project.task1.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import pl.lodz.project.task1.interceptor.AdminInterceptor;
import pl.lodz.project.task1.interceptor.LogInterceptor;
import pl.lodz.project.task1.interceptor.OldLoginInterceptor;


  
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/oldLogin").setViewName("oldLogin");
        registry.addViewController("/admin").setViewName("admin/admin");
    }
    
    @Override
   public void addInterceptors(InterceptorRegistry registry) {
      // LogInterceptor apply to all URLs.
      registry.addInterceptor(new LogInterceptor());
 
      // Old Login url, no longer use.
      // Use OldURLInterceptor to redirect to a new URL.
      registry.addInterceptor(new OldLoginInterceptor())//
            .addPathPatterns("/oldLogin");
 
      // This interceptor apply to URL like /admin/*
      // Exclude /admin/oldLogin
      registry.addInterceptor(new AdminInterceptor())//
            .addPathPatterns("/admin/*");
      
        LocaleChangeInterceptor localeInterceptor = new LocaleChangeInterceptor();
        localeInterceptor.setParamName("lang");
         
         
        registry.addInterceptor(localeInterceptor).addPathPatterns("/*");
   }
   
   
   @Bean(name = "localeResolver")
    public LocaleResolver getLocaleResolver()  {
        CookieLocaleResolver resolver= new CookieLocaleResolver();
        resolver.setCookieDomain("myAppLocaleCookie");
        // 60 minutes 
        resolver.setCookieMaxAge(60*60); 
        return resolver;
    } 
     
    @Bean(name = "messageSource")
    public MessageSource getMessageResource()  {
        ReloadableResourceBundleMessageSource messageResource= new ReloadableResourceBundleMessageSource();
         
        // Read i18n/messages_xxx.properties file.
        // For example: i18n/messages_en.properties
        messageResource.setBasename("classpath:i18n/messages");
        messageResource.setDefaultEncoding("UTF-8");
        return messageResource;
    }

   
}



