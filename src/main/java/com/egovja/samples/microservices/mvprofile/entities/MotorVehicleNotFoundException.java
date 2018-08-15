package com.egovja.samples.microservices.mvprofile.entities;

public class MotorVehicleNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3513510532525083155L;

	public MotorVehicleNotFoundException(String exception) {
		super(exception);
	}
}
