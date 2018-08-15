package com.egovja.samples.microservices.mvprofile.controllers;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.egovja.samples.microservices.mvprofile.entities.MotorVehicle;
import com.egovja.samples.microservices.mvprofile.entities.MotorVehicleNotFoundException;
import com.egovja.samples.microservices.mvprofile.repositories.MotorVehicleRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
//@Api(description = "Motor Vehicles API", produces = "application/json")
@Api(value="onlinestore", description="Motor Vehicles API")
public class MotorVehicleResource {
	
	@Autowired
	private MotorVehicleRepository motorVehicleRepository;
	
	@GetMapping("/motorvehicles")
	@ApiOperation(value = "Retreive all Motor Vehicles",
    notes = "")
	public List<MotorVehicle> retrieveAllMotorVehicles() {
		return motorVehicleRepository.findAll();
	}
	
	@GetMapping("/motorvehicles/{id}")
	@ApiOperation(value = "Find Motor Vehicle by MVID",
    notes = "Also returns a link to retrieve all motor vehicles with rel - all-motorvehicles")
	public Resource<MotorVehicle> retrieveMotorVehicle(@PathVariable Long id) {
		Optional<MotorVehicle> motorVehicle = motorVehicleRepository.findById(id);

		if (!motorVehicle.isPresent())
			throw new MotorVehicleNotFoundException("id-" + id);

		Resource<MotorVehicle> resource = new Resource<>(motorVehicle.get());

		//ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllMotorVehicles());
		//resource.add(linkTo.withRel("all-MotorVehicles"));

		return resource;
	}
	
//	@DeleteMapping("/MotorVehicles/{id}")
//	public void deleteMotorVehicle(@PathVariable Long id) {
//		motorVehicleRepository.deleteById(id);
//	}

	@PostMapping("/MotorVehicles")
	@ApiOperation(value = "Add a Motor Vehicle to System",
    notes = "")
	public ResponseEntity<Object> createMotorVehicle(@RequestBody MotorVehicle motorVehicle) {
		MotorVehicle savedMotorVehicle = motorVehicleRepository.save(motorVehicle);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedMotorVehicle.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/MotorVehicles/{id}")
	@ApiOperation(value = "Update a Motor Vehicle's Detaiails by MVID",
    notes = "")
	public ResponseEntity<Object> updateMotorVehicle(@RequestBody MotorVehicle motorVehicle, @PathVariable Long id) {

		Optional<MotorVehicle> motorVehicleOptional = motorVehicleRepository.findById(id);

		if (!motorVehicleOptional.isPresent())
			return ResponseEntity.notFound().build();

		motorVehicle.setId(id);
		
		motorVehicleRepository.save(motorVehicle);

		return ResponseEntity.noContent().build();
	}

}
