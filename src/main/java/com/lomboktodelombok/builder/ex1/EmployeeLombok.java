/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 *
 * Feature: @Builder at Class level
 * Note: Applying @Builder annotation at class level it generates sophisticated builder APIs for the class.
 */

package com.lomboktodelombok.builder.ex1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class EmployeeLombok {
    private int id;
    private String name;
}
