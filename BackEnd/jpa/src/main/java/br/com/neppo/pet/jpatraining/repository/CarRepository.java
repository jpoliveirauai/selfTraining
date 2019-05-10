package br.com.neppo.pet.jpatraining.repository;

import br.com.neppo.pet.jpatraining.model.Car;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * Created by brunoinacio on 26/04/19.
 */
public interface CarRepository extends Repository<Car, Long>, JpaSpecificationExecutor<Car> {

    Optional<Car> findOne(Long id);

}
