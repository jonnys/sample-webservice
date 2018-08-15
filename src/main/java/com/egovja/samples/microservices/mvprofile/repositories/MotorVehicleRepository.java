package com.egovja.samples.microservices.mvprofile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egovja.samples.microservices.mvprofile.entities.MotorVehicle;


@Repository
public interface MotorVehicleRepository extends JpaRepository<MotorVehicle, Long> {
	
}
