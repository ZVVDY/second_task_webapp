package com.academy_it.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Model device
 */
@Data
@AllArgsConstructor
public class Device {
    private String typeOfDevice;
    private int powerOfDevice;
}
