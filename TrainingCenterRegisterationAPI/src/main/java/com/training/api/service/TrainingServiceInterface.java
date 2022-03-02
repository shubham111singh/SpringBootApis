package com.training.api.service;

import java.util.List;

import com.training.api.centermodel.TrainingCenter;

public interface TrainingServiceInterface {

	public TrainingCenter createCenter(TrainingCenter trainingCenter) ;
	public List<TrainingCenter> getCenters();


}
