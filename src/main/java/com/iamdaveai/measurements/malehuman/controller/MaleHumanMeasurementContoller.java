package com.iamdaveai.measurements.malehuman.controller;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iamdaveai.measurements.malehuman.entity.MaleHumanMeasurement;
import com.iamdaveai.measurements.malehuman.service.MaleHumanService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/male/human")
public class MaleHumanMeasurementContoller {

    @Autowired
    private MaleHumanService maleHumanService;

    @PostMapping("/measurement/add")
    public ResponseEntity<?> addInterviewQuestion(@RequestBody MaleHumanMeasurement maleHumanMeasurement,
            HttpServletRequest request) {
        return new ResponseEntity<>(maleHumanService.addUpdateHumanMeasurement(maleHumanMeasurement),
                HttpStatus.CREATED);
    }

    @GetMapping("/measurements/getAll")
    public ResponseEntity<?> getAllMeasurements(HttpServletRequest request) {
        return new ResponseEntity<>(maleHumanService.getAllMeasurements(), HttpStatus.OK);
    }

    @GetMapping("/getMeasurement")
    public ResponseEntity<?> getMeasurement(
            @RequestParam BigDecimal heightCm,
            @RequestParam BigDecimal weightKgs,
                @RequestParam BigDecimal age) {        Optional<MaleHumanMeasurement> measurementOptional = maleHumanService
                .getMeasurementByHeightAndWeightAndAge(heightCm, weightKgs, age);

        if (measurementOptional.isPresent()) {
            return ResponseEntity.ok(measurementOptional.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found your Waist size");
        }

    }

}
