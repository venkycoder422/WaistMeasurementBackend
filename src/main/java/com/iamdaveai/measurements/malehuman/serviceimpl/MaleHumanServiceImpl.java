package com.iamdaveai.measurements.malehuman.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamdaveai.measurements.malehuman.entity.MaleHumanMeasurement;
import com.iamdaveai.measurements.malehuman.repository.MaleHumanMeasurementRepo;
import com.iamdaveai.measurements.malehuman.service.MaleHumanService;

@Service
public class MaleHumanServiceImpl implements MaleHumanService {


    @Autowired
    private MaleHumanMeasurementRepo maleHumanMeasurementRepo;

    @Override
    public MaleHumanMeasurement addUpdateHumanMeasurement(MaleHumanMeasurement maleHumanMeasurement) {
        return maleHumanMeasurementRepo.save(maleHumanMeasurement);
    }

    @Override
    public List<MaleHumanMeasurement> getAllMeasurements() {
      return maleHumanMeasurementRepo.findAll();
    }
}
