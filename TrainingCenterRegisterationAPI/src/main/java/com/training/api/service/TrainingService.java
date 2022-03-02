package com.training.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.api.centermodel.TrainingCenter;
import com.training.api.dao.TrainingRepository;
import com.training.api.exceptions.EmailAlreadyRegisteredException;

@Service
public class TrainingService implements TrainingServiceInterface{
	@Autowired
	TrainingRepository trainingRepo ;
	
	public TrainingCenter createCenter(TrainingCenter trainingCenter) {
		Optional<TrainingCenter> registered = trainingRepo.findById(trainingCenter.getContactEmail());
		//Checking if we have new Email for registration.
		if(registered.isEmpty()) {
			return trainingRepo.save(trainingCenter);
		}
		else {throw new EmailAlreadyRegisteredException(); }		
	}
	public List<TrainingCenter> getCenters(){
		return trainingRepo.findAll();
		
	}
}
