package com.neppo.fests.models;

import org.hibernate.annotations.BatchSize;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Component
@Entity
public class User implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	@Column( unique = true, length = 30)
	private String email;
	private int age;
	private int events;

	@ManyToMany( fetch = FetchType.LAZY )
	@JoinTable( name = "USER_EVENT_INCOMING",
			joinColumns = @JoinColumn( name = "USER_ID" ),
			inverseJoinColumns = @JoinColumn( name = "EVENT_ID" )
	)
	private List<Event> incomingEvents;

	@ManyToMany( fetch = FetchType.LAZY )
	@BatchSize(size = 1000)
	@JoinTable( name = "USER_EVENT_LIKED",
			joinColumns = @JoinColumn( name = "USER_ID" ),
			inverseJoinColumns = @JoinColumn( name = "EVENT_ID" )
	)
	private List<Event> likedEvents;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public int getEvents() {
		return events;
	}

	public List<Event> getIncomingEvents() {
		return incomingEvents;
	}

	public List<Event> getLikedEvents() {
		return likedEvents;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEvents(int events) {
		this.events = events;
	}

	public void setIncomingEvents(List<Event> incomingEvents) {
		this.incomingEvents = incomingEvents;
	}

	public void setLikedEvents(List<Event> likedEvents) {
		this.likedEvents = likedEvents;
	}
}
