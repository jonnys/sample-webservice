package com.egovja.samples.microservices.mvprofile.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="A motor Vehicle from AMVS.")
public class MotorVehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(notes="Same as the MVID from AMVS")
	@Size(min=2, message="MVID should have atleast 2 characters")
	private Long id;			//synonymous to MVID	
	
	private String name;
	
	private String type;
	
	private String make;
	

	@ApiModelProperty(notes="chassisNo should have atleast 10 characters")
	@Size(min=10, message="chassisNo should have atleast 10 characters")
	private String chassisNo;
	
	private String engineNo;
	
	private String plateNo;
	
	private int seatingNo;
	
	private int year;
	
	private String colour;
	
	@ApiModelProperty(notes="Name should have atleast 8 characters")
	@Size(min=10, message="Name should have atleast 8 characters")
	private String mvOwnerId;
	
	
	
	public MotorVehicle() { }
	
	public MotorVehicle(Long id, String chassisNo, String name) {
		this.id = id;		
		this.chassisNo = chassisNo;
		this.name = name;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the chassisNo
	 */
	public String getChassisNo() {
		return chassisNo;
	}

	/**
	 * @param chassisNo the chassisNo to set
	 */
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	/**
	 * @return the engineNo
	 */
	public String getEngineNo() {
		return engineNo;
	}

	/**
	 * @param engineNo the engineNo to set
	 */
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	/**
	 * @return the plateNo
	 */
	public String getPlateNo() {
		return plateNo;
	}

	/**
	 * @param plateNo the plateNo to set
	 */
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	/**
	 * @return the seatingNo
	 */
	public int getSeatingNo() {
		return seatingNo;
	}

	/**
	 * @param seatingNo the seatingNo to set
	 */
	public void setSeatingNo(int seatingNo) {
		this.seatingNo = seatingNo;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @return the mvOwnerId
	 */
	public String getMvOwnerId() {
		return mvOwnerId;
	}

	/**
	 * @param mvOwnerId the mvOwnerId to set
	 */
	public void setMvOwnerId(String mvOwnerId) {
		this.mvOwnerId = mvOwnerId;
	}

}
