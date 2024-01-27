package com.iamdaveai.measurements.malehuman.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.iamdaveai.measurements.malehuman.entity.MaleHumanMeasurement;

public interface MaleHumanService {
    
    MaleHumanMeasurement addUpdateHumanMeasurement(MaleHumanMeasurement maleHumanMeasurement);

    List<MaleHumanMeasurement> getAllMeasurements();

    Optional<MaleHumanMeasurement> getMeasurementByHeightAndWeightAndAge(BigDecimal heightCm, BigDecimal weightKgs, BigDecimal age);

}
