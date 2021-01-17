/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum

 * Feature: @ToString
 * Note: Prints instance and final field but excludes static fields.
 */

package com.lomboktodelombok.tostring.ex1;

import lombok.ToString;

@ToString
public class EmployeeLombok {
    private int id;
    private String name;
    private static double salary = 85000;
    private final String jobTitle = "Software Developer";
}
