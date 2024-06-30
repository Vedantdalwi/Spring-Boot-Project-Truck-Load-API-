package com.springrest.springrest.entities;

import java.util.List;
import java.util.Optional;

public class ShipperResponse {
	
	private String message;
    private Optional<List<Load>> loads;

    public ShipperResponse(String message, Optional<List<Load>> loads) {
        this.message = message;
        this.loads = loads;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Optional<List<Load>> getLoads() {
		return loads;
	}

	public void setLoads(Optional<List<Load>> loads) {
		this.loads = loads;
	}

}
