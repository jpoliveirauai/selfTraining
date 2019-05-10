package com.neppo.fests.resources;

import com.neppo.fests.models.Event;
import com.neppo.fests.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("events")
public class EventResource {

	@Autowired
	private EventRepository eventRepo;

	public @ResponseBody Iterable<Event> findAll(){
		Iterable<Event> listEvents = eventRepo.findAll();
		return listEvents;
	}

	@PostMapping
	public Event addEvent (@RequestBody @Valid Event v ){
		return eventRepo.save(v);
	}

	@DeleteMapping
	public Event rmEvent (@RequestBody @Valid Event v){
		eventRepo.delete(v);
		return v;
	}



}
