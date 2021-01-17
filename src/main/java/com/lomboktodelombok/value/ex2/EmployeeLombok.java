/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @Value
 * @Value is used when creating Immutable classes.
 * All Lombok generated fields are made private and final by default,
 * and setters are not generated. The class itself is also made final by default.
 */

package com.lomboktodelombok.value.ex2;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Value
public class EmployeeLombok {

    private int id;
    private String name;
}
