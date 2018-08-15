package com.egovja.samples.microservices.mvprofile.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description="An owner of a motor vehicle.")
public class MVOwner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Size(min=2, message="MVOwnerId should have atleast 2 characters")
	private Long id;
	
	private String name;
	
	private int trn;
	
	
	public MVOwner() {	}
	
	public MVOwner(Long id, String name, int trn) {
		this.id = id;
		this.name = name;
		this.trn = trn;
				
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the trn
	 */
	public int getTrn() {
		return trn;
	}

	/**
	 * @param trn the trn to set
	 */
	public void setTrn(int trn) {
		this.trn = trn;
	}

	/**
	 * @return the moterVehicles
	 */
//	public List<MotorVehicle> getMoterVehicles() {
//		return motorVehicles;
//	}

	/**
	 * @param moterVehicles the moterVehicles to set
	 */
//	public void setMoterVehicles(List<MotorVehicle> motorVehicles) {
//		this.motorVehicles = motorVehicles;
//	}

}
