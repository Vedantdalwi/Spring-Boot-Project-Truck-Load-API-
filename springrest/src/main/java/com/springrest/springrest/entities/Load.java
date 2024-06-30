package com.springrest.springrest.entities;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "loads")
public class Load {
	
	@Id
	@Column(name = "load_id")
	private UUID loadId;
	
	@NotNull(message = "Loading Point cannot be null")
	@Column(name = "loading_point")
	private String loadingPoint;
	
	@NotNull(message = "Unoading Point cannot be null")
	@Column(name = "unloading_point")
	private String unloadingPoint;
	
	@NotNull(message = "productType cannot be null")
	@Column(name = "product_type")
	private String productType;
	
	@NotNull(message = "truckType cannot be null")
	@Column(name = "truck_type")
	private String truckType;
	
	@NotNull(message = "no. of trucks cannot be null")
	@Column(name = "no_of_trucks")
	private int noOfTrucks;
	
	@NotNull(message = "weight cannot be null")
	@Column(name = "weight")
	private double weight;
	
	@Column(name = "comment")
	private String comment; //can be null
	
	@NotNull(message = "shipperId cannot be null")
	@Column(name = "shipper_id")
	private UUID shipperId;
	
	@NotNull(message = "Date cannot be null")
	@Column(name = "date")
	private Date date;
	
	public Load(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks,
			double weight, String comment, UUID shipperId, Date date) {
		super();
		this.loadId = UUID.randomUUID(); // Generate a unique loadId
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}

	 // Default constructor
    public Load() {
        super();
        this.loadId = UUID.randomUUID(); // Generate a unique loadId
    }

    // Getter and Setter methods for loadId
    public UUID getLoadId() {
        return loadId;
    }

    public void setLoadId(UUID loadId) {
        this.loadId = loadId;
    }


	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public UUID getShipperId() {
		return shipperId;
	}

	public void setShipperId(UUID shipperId) {
		this.shipperId = shipperId;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Load [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + ", getLoadingPoint()=" + getLoadingPoint()
				+ ", getUnloadingPoint()=" + getUnloadingPoint() + ", getProductType()=" + getProductType()
				+ ", getTruckType()=" + getTruckType() + ", getNoOfTrucks()=" + getNoOfTrucks() + ", getWeight()="
				+ getWeight() + ", getComment()=" + getComment() + ", getShipperId()=" + getShipperId()
				+ ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
	
	
}
