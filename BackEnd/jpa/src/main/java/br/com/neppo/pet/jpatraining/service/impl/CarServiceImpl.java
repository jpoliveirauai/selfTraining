package br.com.neppo.pet.jpatraining.service.impl;

import br.com.neppo.pet.jpatraining.model.Car;
import br.com.neppo.pet.jpatraining.repository.CarRepository;
import br.com.neppo.pet.jpatraining.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by brunoinacio on 26/04/19.
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car findCarById(Long id) {

        final Optional<Car> car =  carRepository.findOne(id);

        return car.get();

    }

    @Override
    public List<Car> findAllCars() {
        return null;
    }
}
