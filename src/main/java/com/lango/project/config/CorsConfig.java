package com.lango.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 全局跨域配置
 *
 * @author lango
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        // 覆盖所有请求
//        registry.addMapping("/**")
//                // 允许发送 Cookie
//                .allowCredentials(true)
//                // 放行哪些域名（必须用 patterns，否则 * 会和 allowCredentials 冲突）
//                .allowedOriginPatterns("*")
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowedHeaders("*")
//                .exposedHeaders("*");

        //设置允许跨域的路径
        registry.addMapping("/**")
                //设置允许跨域请求的域名
                //当**Credentials为true时，**Origin不能为星号，需为具体的ip地址【如果接口不带cookie,ip无需设成具体ip】
                。allowedOrigins("http://localhost:3000","http://localhost:8000","http://127.0.0.1:3000","http://127.0.0.1:8000","http://**.**.**.**:3000","http://www.**.com","http://www.**.com","http://www.**.com")
                //是否允许证书 不再默认开启
                。allowCredentials(true)
                //设置允许的方法
                。allowedMethods("*")
                。allowedHeaders("*")
                .exposedHeaders("*")
                //跨域允许时间
                .maxAge(3600);
    }
}
