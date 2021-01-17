/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @ToString - Skip field names
 */

package com.lomboktodelombok.tostring.ex2;

public class EmployeeDeLombok {
    private int id;
    private String name;
    private static double salary = 85000;
    private final String jobTitle = "Software Developer";

    @Override
    public String toString() {
        return "EmployeeDeLombok(" + this.id + ", " + this.name + ")";
    }
}
