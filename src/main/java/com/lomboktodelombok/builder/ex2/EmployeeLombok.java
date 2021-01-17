/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 *
 * Feature: @Builder at Constructor level
 * Note:
 * if not all the fields are required to instantiate your class,
 * if only few of them required then declare @Builder annotation at constructor level which is having required arguments.
 */

package com.lomboktodelombok.builder.ex2;

import lombok.Builder;
import lombok.Data;

@Data
public class EmployeeLombok {
    private int id;
    private String name;

    @Builder()
    public EmployeeLombok(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
