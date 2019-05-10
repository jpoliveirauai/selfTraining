package com.neppo.fests.repository;

import com.neppo.fests.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository< User , String > {

}
