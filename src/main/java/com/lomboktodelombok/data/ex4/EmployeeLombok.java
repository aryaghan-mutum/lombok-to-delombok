/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @Data and @Builder together
 */

package com.lomboktodelombok.data.ex4;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeLombok {
    private int id;
    private String name;
    private double salary;
    private String jobTitle;
}
