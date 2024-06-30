package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.springrest.springrest.entities.Load;

public interface LoadService {
	
	List<Load> getAllLoads();
	Optional<Load> getLoadByLoadId(UUID loadID);
	Optional<List<Load>> getLoadByShipperId(UUID shipperId);
	void addLoad(Load load);
	void updateLoad(Load load, UUID loadId);
	void deleteLoad(UUID loadId);

}
