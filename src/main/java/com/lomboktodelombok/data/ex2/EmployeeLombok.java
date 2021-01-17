/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @Data for staticConstructor
 */

package com.lomboktodelombok.data.ex2;

import lombok.Data;

@Data(staticConstructor = "construct")
public class EmployeeLombok {
    private int id;
    private String name;
    private double salary;
    private String jobTitle;
}
