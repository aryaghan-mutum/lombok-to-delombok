/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: Annotating Class with @Getter and @Setter
 */

package com.lomboktodelombok.gettersetter.ex2;

public class EmployeeDeLombok {

    private int id;

    private String name;

    // no getter setter created for static fields
    private static double salary = 85000;

    // only getters will be created for final fields
    private final String jobTitle = "Software Developer";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
