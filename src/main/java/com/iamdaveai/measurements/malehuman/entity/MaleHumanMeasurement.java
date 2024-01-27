package com.iamdaveai.measurements.malehuman.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "MALE_HUMAN_MESUREMENTS")
public class MaleHumanMeasurement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "male_human_measurement_id")
    private Long maleHumanMeasurementId;

    @Column(name = "height_cm",precision = 5, scale = 2)
    private BigDecimal heightCm;

    @Column(name = "weight_kgs",precision = 5, scale = 2)
    private BigDecimal weightKgs;

    @Column(name = "age",precision = 5, scale = 2)
    private BigDecimal age; 

    @Column(name = "waist_cm",precision = 5, scale = 2)
    private BigDecimal waistCm;

    @Column(name = "del_flag")
    private boolean delFlag;
}
