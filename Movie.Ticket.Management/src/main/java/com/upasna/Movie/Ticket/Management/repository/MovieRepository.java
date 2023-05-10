package com.upasna.Movie.Ticket.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upasna.Movie.Ticket.Management.model.MovieManagement;

@Repository
public interface MovieRepository extends JpaRepository<MovieManagement,Long> {

}
