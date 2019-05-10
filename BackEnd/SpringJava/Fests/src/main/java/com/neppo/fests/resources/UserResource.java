package com.neppo.fests.resources;

import com.neppo.fests.models.Event;
import com.neppo.fests.repository.UserRepository;
import com.neppo.fests.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.Serializable;

@RestController
@RequestMapping("users")
public class UserResource implements Serializable {

	@Autowired
	private UserRepository userRepo;

	@GetMapping ( produces = "application/json")
	public @ResponseBody Iterable<User> findAll(){
		Iterable<User> listaUser = userRepo.findAll();
		return listaUser;
	}

	@PostMapping
	public User addUser (@RequestBody @Valid User u){
		return userRepo.save(u);
	}

	@DeleteMapping
	public User rmUser ( @RequestBody @Valid User u ){
		userRepo.delete(u);
		return u;

	}
}
