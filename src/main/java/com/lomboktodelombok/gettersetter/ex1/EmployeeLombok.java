/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: Annotating Fields with @Getter and @Setter
 */

package com.lomboktodelombok.gettersetter.ex1;

import lombok.Getter;
import lombok.Setter;

public class EmployeeLombok {

    @Getter
    private int id;

    @Getter
    private String name;

    @Setter
    private double salary;

    @Getter @Setter
    private String jobTitle;
}
