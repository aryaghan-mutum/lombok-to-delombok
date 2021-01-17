/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: Annotating Class with @Getter and @Setter
 */

package com.lomboktodelombok.gettersetter.ex2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeLombok {

    private int id;
    private String name;

    // no getter setter created for static fields
    private static double salary = 85000;

    // only getters will be created for final fields
    private final String jobTitle = "Software Developer";
}
