package com.iamdaveai.measurements.malehuman.entity;

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

    @Column(name = "height_cm")
    private float heightCm;

    @Column(name = "weight_kgs")
    private float weightKgs;

    @Column(name = "age")
    private float age;

    @Column(name = "waist_cm")
    private float waistCm;

    @Column(name = "del_flag")
    private boolean delFlag;
}
