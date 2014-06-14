package com.ric.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
// Marks this class as configuration
// Specifies which package to scan
@ComponentScan("com.ric")
// Enables Spring's annotations
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter{

	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();

		resolver.setViewClass(TilesView.class);
		return resolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer
				.setDefinitions(new String[] { "classpath*:tiles/tiles-definitions.xml" });

		return tilesConfigurer;
	}
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
           registry.addResourceHandler("/resources/**").addResourceLocations(
                        "/resources/");
    }

	@Bean
	public ResourceBundleMessageSource messageSource()
	{
		ResourceBundleMessageSource bundleMessageSource=new ResourceBundleMessageSource();
		bundleMessageSource.setBasename("classpath:message");
		return bundleMessageSource;
		
		
	}
}
