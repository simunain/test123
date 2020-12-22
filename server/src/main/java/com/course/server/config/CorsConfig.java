/*package com.course.server.config;

 import org.springframework.context.annotation.Configuration;
 import org.springframework.web.cors.CorsConfiguration;
 import org.springframework.web.servlet.config.annotation.CorsRegistry;
 import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

 @Configuration
 public class CorsConfig implements WebMvcConfigurer {

     // 重写WebMvcConfigurer的addCorsMappings方法（全局跨域配置）
     @Override
     public void addCorsMappings(CorsRegistry registry) {
         //添加映射路径，“/**”表示对所有的路径实行全局跨域访问权限的设置
         registry.addMapping("/**")
                 .allowedOrigins("*")//开放哪些ip、端口、域名的访问权限,*表示开放全部端口
                 .allowedHeaders(CorsConfiguration.ALL)////允许HTTP请求中的携带哪些Header信息,CorsConfiguration.ALL表示允许全部
                 .allowedMethods(CorsConfiguration.ALL)//开放哪些Http方法，允许跨域访问,有那么多方法("GET","POST", "PUT", "DELETE"),注意这里的CorsConfiguration.ALL)表示全部方法的意思
                 .allowCredentials(true) //是否允许发送Cookie信息
                 .maxAge(3600);  // 1小时内不需要再预检（发OPTIONS请求）
     }

 }*/
