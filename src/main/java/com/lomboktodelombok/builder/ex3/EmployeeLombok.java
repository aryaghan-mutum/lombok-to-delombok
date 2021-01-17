/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * <p>
 * Feature: @Builder at Method level
 * Note:
 * If your class already have a method to create instance, you can make it as builder by declaring @Builder on that method.
 */

package com.lomboktodelombok.builder.ex3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeLombok {
    private int id;
    private String name;

    /**
     * Generate instance with default role and status
     */
    @Builder(builderMethodName = "builder")
    public static EmployeeLombok createInstance(int id, String name) {
        return new EmployeeLombok(id, name);
    }
}
