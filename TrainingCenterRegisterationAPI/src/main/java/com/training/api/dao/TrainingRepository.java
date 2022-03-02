package com.training.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.api.centermodel.TrainingCenter;

public interface TrainingRepository extends JpaRepository<TrainingCenter, String>{

}
