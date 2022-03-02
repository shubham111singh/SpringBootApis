package com.training.api.resources;

import java.time.LocalTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.training.api.centermodel.TrainingCenter;
import com.training.api.service.TrainingService;

@RestController
public class TrainingResources {
	
	@Autowired
	TrainingService trainingService;

	@PostMapping("/create")
	public TrainingCenter createCenter(@RequestBody @Valid TrainingCenter tCenter) {
		tCenter.setCreatedOn(LocalTime.now());
		return trainingService.createCenter(tCenter) ;		
	}
	@GetMapping("/centers")
	public List<TrainingCenter> returnCenters() {
		return trainingService.getCenters();
	}
}
