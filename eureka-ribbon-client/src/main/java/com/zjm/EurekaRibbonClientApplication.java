package com.zjm;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class EurekaRibbonClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonClientApplication.class, args);
	}

	/**
	 * 使用Hystrix Dashboard监控熔断器的状态
	 * @return
	 */
   @Bean
	public ServletRegistrationBean getServlet(){
	   HystrixMetricsStreamServlet streamServlet=new HystrixMetricsStreamServlet();
	   ServletRegistrationBean registrationBean=new ServletRegistrationBean(streamServlet);
	   registrationBean.setLoadOnStartup(1);
	   registrationBean.addUrlMappings("/hystrix.stream");
	   registrationBean.setName("HystrixMetricsStreamServlet");
	   return registrationBean;
   }
}
