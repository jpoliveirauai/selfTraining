package com.neppo.fests.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Event implements Serializable {
	@Id
	@Column( name = "EVENT_ID" )
	private long id;

	@Column( name = "EVENT_DATE" )
	private Date date;

	@Column( name = "EVENT_CATEGORY" )
	private String category;

	@Column( name = "EVENT_START_HOUR" )
	private String startHour;

	@Column( name = "EVENT_END_HOUR" )
	private String endHour;

	@Column( name = "EVENT_DESCRIPTION" )
	private String description;

	@Column( name = "EVENT_LINK" )
	private String link;

	@ManyToMany( mappedBy = "incomingEvents" )
	private List<User> participantsList;

	@ManyToMany( mappedBy = "likedEvents")
	private List<User> userLiked;

	public long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getCategory() {
		return category;
	}

	public String getStartHour() {
		return startHour;
	}

	public String getEndHour() {
		return endHour;
	}

	public String getDescription() {
		return description;
	}

	public String getLink() {
		return link;
	}

	public List<User> getParticipantsList() {
		return participantsList;
	}

	public List<User> getUserLiked() {
		return userLiked;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setParticipantsList(List<User> participantsList) {
		this.participantsList = participantsList;
	}

	public void setUserLiked(List<User> userLiked) {
		this.userLiked = userLiked;
	}
}
