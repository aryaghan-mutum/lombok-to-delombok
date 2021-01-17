/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @NoArgsConstructor
 */
package com.lomboktodelombok.noargsconstructor.ex2;

public class EmployeeDeLombok {
    private int id;
    private String name;
    private static double salary = 85000;
    private final String jobTitle;

    public EmployeeDeLombok() {
        this.id = 0;
        this.name = null;
        this.jobTitle = "Software Developer";
    }
}
