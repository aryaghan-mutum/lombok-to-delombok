/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @Data
 */


package com.lomboktodelombok.data.ex1;

import java.util.Objects;

public class EmployeeDeLombok {
    private int id;
    private String name;
    private double salary;
    private String jobTitle;

    public EmployeeDeLombok() {
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(final String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDeLombok that = (EmployeeDeLombok) o;
        return id == that.id &&
                Double.compare(that.salary, salary) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(jobTitle, that.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, jobTitle);
    }

    @Override
    public String toString() {
        return "EmployeeDeLombok{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
