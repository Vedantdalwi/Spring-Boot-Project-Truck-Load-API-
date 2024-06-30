package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.entities.ShipperResponse;
import com.springrest.springrest.services.LoadService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("")
public class ServerController {

	private LoadService loadService;
	@Autowired
	public ServerController(LoadService loadService) {
		this.loadService = loadService;
	}

    //private List<Load> loads = new ArrayList<>();

    @GetMapping("/loads")
    public List<Load> getAllLoads() {
        return this.loadService.getAllLoads();
    }
    
    @GetMapping("/loads/{loadId}")
    public Optional<Load> getLoadByLoadId(@PathVariable UUID loadId) {
    	return this.loadService.getLoadByLoadId(loadId);
    }
    
    @GetMapping("/loads/shipper/{shipperId}")
    public ShipperResponse getLoadByShipperId(@PathVariable UUID shipperId) {
    	
    	Optional<List<Load>>loads=loadService.getLoadByShipperId(shipperId);
    	String message = "These are the loads of this Shipper";
    	ShipperResponse response = new ShipperResponse(message,loads);
    	return response;
    }
    
    
    @PostMapping("/loads")
    public String addLoad(@Valid @RequestBody Load load) {
    	this.loadService.addLoad(load);
    	String response = "Load details added Successfully!";
    	return response;
    }
    
    @PutMapping("/loads/{loadId}")
    public String updateLoad(@RequestBody Load load, @PathVariable UUID loadId ) {
    	this.loadService.updateLoad(load, loadId);
    	String response = "Load details updated Successfully!";
    	return response;
    }
    
    @DeleteMapping("/loads/{loadId}")
    public ResponseEntity<HttpStatus> deleteLoad(@PathVariable UUID loadId){
    	try {
    		this.loadService.deleteLoad(loadId);
    		return new ResponseEntity<>(HttpStatus.OK);
    	}catch(Exception e) {
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
    


}
