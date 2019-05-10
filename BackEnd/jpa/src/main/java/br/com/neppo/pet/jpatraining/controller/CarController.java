package br.com.neppo.pet.jpatraining.controller;

import br.com.neppo.pet.jpatraining.model.Car;
import br.com.neppo.pet.jpatraining.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;

/**
 * Created by brunoinacio on 26/04/19.
 */
@Controller
public class CarController {

    @Autowired
    private CarService carService;

    public Car findCarById( Long id ){

        Assert.notNull( id, "Id can not be null" );

       return carService.findCarById( id );

    }

}
