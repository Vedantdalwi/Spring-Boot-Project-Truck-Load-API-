package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.repository.LoadRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class LoadServiceImpl implements LoadService {

	@Autowired
	private LoadRepository loadRepository;
	
	public LoadServiceImpl(LoadRepository loadRepository) {
		this.loadRepository = loadRepository;
	}
	
	@Override
	public List<Load> getAllLoads() {
		return loadRepository.findAll();
	}

	@Override
	public Optional<Load> getLoadByLoadId(UUID loadID) {
		return loadRepository.findById(loadID);
	}

	@Override
	public Optional<List<Load>> getLoadByShipperId(UUID shipperId) {
		return loadRepository.findByShipperId(shipperId);
	}

	@Override
	public void addLoad(Load load) {
		loadRepository.save(load);
	}

	@Override
	public void updateLoad(Load load, UUID loadId) {
		Optional<Load> updatedLoad = loadRepository.findById(loadId);
	    if (updatedLoad.isPresent()) {
	    	Load updatingLoad = updatedLoad.get();
	    	updatingLoad.setLoadingPoint(load.getLoadingPoint());
	    	updatingLoad.setProductType(load.getProductType());
	    	updatingLoad.setTruckType(load.getTruckType());
	    	updatingLoad.setNoOfTrucks(load.getNoOfTrucks());
	    	updatingLoad.setWeight(load.getWeight());
	    	updatingLoad.setComment(load.getComment());
	    	updatingLoad.setShipperId(load.getShipperId());
	    	updatingLoad.setDate(load.getDate());
	    	

	        loadRepository.save(updatingLoad);
	    } else {
	        throw new EntityNotFoundException("Load with ID " + loadId + " not found");
	    }
	}

	@Override
	public void deleteLoad(UUID loadId) {
		loadRepository.deleteById(loadId);
		
	}
	
	

}
