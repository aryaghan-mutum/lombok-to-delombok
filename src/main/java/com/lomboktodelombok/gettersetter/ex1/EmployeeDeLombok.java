/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: Annotating Fields with @Getter and @Setter
 */

package com.lomboktodelombok.gettersetter.ex1;

public class EmployeeDeLombok {

    private int id;
    private String name;
    private String jobTitle;
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public void setJobTitle(final String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
