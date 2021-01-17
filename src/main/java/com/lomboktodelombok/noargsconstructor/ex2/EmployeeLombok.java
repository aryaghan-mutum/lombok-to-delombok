/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @NoArgsConstructor(force = true) vs static and final fields
 */

package com.lomboktodelombok.noargsconstructor.ex2;

import lombok.NoArgsConstructor;

@NoArgsConstructor(force = true)
public class EmployeeLombok {
    private int id;
    private String name;
    private static double salary = 85000.50;
    private final String jobTitle;
}
