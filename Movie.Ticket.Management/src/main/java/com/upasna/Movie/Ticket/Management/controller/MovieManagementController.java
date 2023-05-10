package com.upasna.Movie.Ticket.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upasna.Movie.Ticket.Management.model.MovieManagement;
import com.upasna.Movie.Ticket.Management.repository.MovieRepository;

@RestController
@RequestMapping("/movie")
public class MovieManagementController {
	@Autowired
	MovieRepository mr;
	@PostMapping("/save")
	public void saveMovie(@RequestBody MovieManagement mm) {
		mr.save(mm);
	}
	@RequestMapping("/details")
	public List<MovieManagement>getBooks() {
	return mr.findAll();
	}
	
	@RequestMapping("/update/{id}/{name}")
	public void updateMovie(@PathVariable("id")Long id,@PathVariable("name")String name) {
	MovieManagement mt = mr.findById(id).get();
	mt.setName(name);
	mr.save(mt);
	}
	
	@RequestMapping("/details/{id}")
	public MovieManagement getById(@PathVariable("id")Long id) {
	return mr.findById(id).get();
	}
	
	@RequestMapping("/delete/{id}")
	public void deletemovie(@PathVariable("id")Long id) {
	mr.deleteById(id);
	}
}
