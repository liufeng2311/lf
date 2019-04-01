package com.lf.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
  @Bean
  public LoginInterceptor getInterceptor() {     //拦截器加载的时间先于SpringContext，导致LoginInterceptor注入bean失败，需要再次实例化
    return new LoginInterceptor();
  }
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(getInterceptor()).addPathPatterns("/**");
  }

}
