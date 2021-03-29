package br.com.home.prazo.config;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.home.prazo.entities.Tipo;
import br.com.home.prazo.repositories.TiposRepository;

@Configuration
@Profile(value = "dev")
public class DevConfiguration {
	private static final Logger log = LoggerFactory.getLogger(DevConfiguration.class);

	@Autowired
	private TiposRepository tipoRepository;

	public DevConfiguration() {

	}

	@Bean
	public boolean onstart() {

		log.info("starting.....");

		tipoRepository.saveAll(Arrays.asList(new Tipo(1L, "Fundos Aplicados"), new Tipo(2L, "Pensão")));

		log.info("Save.....");
		return true;
	}

}