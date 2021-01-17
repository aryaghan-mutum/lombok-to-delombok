/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @Data
 */


package com.lomboktodelombok.data.ex2;

public class EmployeeDeLombok {

    private int id;
    private String name;
    private double salary;
    private String jobTitle;

    private EmployeeDeLombok() {
    }

    public static EmployeeDeLombok construct() {
        return new EmployeeDeLombok();
    }
}
