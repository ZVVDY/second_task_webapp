package com.academy_it.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Model user
 */
@Data
@AllArgsConstructor
public class User {
    private String nameUser;
    private String passwordUser;
}
