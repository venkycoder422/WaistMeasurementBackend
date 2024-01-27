package com.iamdaveai.measurements.malehuman.service;

import java.util.List;
import java.util.Optional;

import com.iamdaveai.measurements.malehuman.entity.MaleHumanMeasurement;

public interface MaleHumanService {
    
    MaleHumanMeasurement addUpdateHumanMeasurement(MaleHumanMeasurement maleHumanMeasurement);

    List<MaleHumanMeasurement> getAllMeasurements();

}
