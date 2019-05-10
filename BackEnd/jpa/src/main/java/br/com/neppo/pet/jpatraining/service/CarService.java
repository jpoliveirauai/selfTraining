package br.com.neppo.pet.jpatraining.service;

import br.com.neppo.pet.jpatraining.model.Car;

import java.util.List;

/**
 * Created by brunoinacio on 26/04/19.
 */
public interface CarService {

    Car findCarById( Long id );

    List<Car> findAllCars();

}
