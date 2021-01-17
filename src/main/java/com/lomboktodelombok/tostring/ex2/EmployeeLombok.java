/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @ToString - Skip field names
 */

package com.lomboktodelombok.tostring.ex2;

import lombok.ToString;

@ToString(includeFieldNames = false)
public class EmployeeLombok {
    private int id;
    private String name;
    private static double salary = 85000;
    private final String jobTitle = "Software Developer";
}
