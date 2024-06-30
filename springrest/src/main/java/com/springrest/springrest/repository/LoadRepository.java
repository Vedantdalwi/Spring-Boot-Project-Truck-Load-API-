package com.springrest.springrest.repository;

import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Load;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface LoadRepository extends JpaRepository<Load, UUID>{
	 Optional<List<Load>> findByShipperId(UUID shipperId);
}
