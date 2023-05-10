package com.upasna.Movie.Ticket.Management.model;

import jakarta.persistence.*;

@Entity
@Table(name="Movie_mng")
public class MovieManagement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="movie_id")
	private Long id;
	@Column(name="movie_name")
	private String name;
	@Column(name="Movie_hours")
	private float hours;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	public MovieManagement(String name, float hours) {
		super();
		this.name = name;
		this.hours = hours;
	}
	public MovieManagement() {
		
	}

}
