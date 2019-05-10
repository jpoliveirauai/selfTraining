package br.com.neppo.pet.jpatraining;

import br.com.neppo.pet.jpatraining.service.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTrainingApplicationTests {

	@Autowired
	private CarService carService;

	@Test
	public void findCarById() {


		Long id = 10l;
		carService.findCarById( id );
	}



}
