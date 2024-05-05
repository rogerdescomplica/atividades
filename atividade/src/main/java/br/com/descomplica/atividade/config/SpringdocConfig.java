package br.com.descomplica.atividade.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SpringdocConfig {
	@Bean
	  public OpenAPI springShopOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("Atividade - API com Documentação")
	              .description("Exemplo de API utilizando Springdoc para documentação.")
	              .version("1.0.0"));
	  }
}
