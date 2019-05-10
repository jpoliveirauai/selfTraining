package com.neppo.fests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.Serializable;

@SpringBootApplication
public class FestsApplication implements Serializable {

	public static void main(String[] args) {
		SpringApplication.run(FestsApplication.class, args);
	}

}
