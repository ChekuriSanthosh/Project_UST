package com.ust.traineeapp.trainee_rest_api_v2.repository;

import com.ust.traineeapp.trainee_rest_api_v2.model.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {
}
