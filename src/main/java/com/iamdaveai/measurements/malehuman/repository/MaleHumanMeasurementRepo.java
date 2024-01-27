package com.iamdaveai.measurements.malehuman.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iamdaveai.measurements.malehuman.entity.MaleHumanMeasurement;

@Repository
public interface MaleHumanMeasurementRepo extends JpaRepository<MaleHumanMeasurement,Long>  {

    // @Query(value = "select MaleHumanMeasurement from MALE_HUMAN_MESUREMENTS where height_cm=?1 and weight_kgs=?2 and age=?3 and del_flag=0 ")
    // Optional<MaleHumanMeasurement> getByheightCmAndWeightKgsAndage(float heightCm, float weightKgs, float age);
    
}
