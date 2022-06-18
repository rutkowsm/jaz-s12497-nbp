package com.goldnbp.jazs12497nbp.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class AvgGoldRate {

    @Id
    @ApiModelProperty(value = "Unique identifier if the given gold rate", readOnly = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Metal metal;
    private String dataStart;
    private String dataEnd;
    private double avgRate;
    private Timestamp queryTs;
}
