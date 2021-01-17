/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @Data
 */

package com.lomboktodelombok.data.ex1;

import lombok.*;

/**
 * The below commented code is equal to @Data
 */
//@Getter
//@Setter
//@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
public class EmployeeLombok {
    private int id;
    private String name;
    private double salary;
    private String jobTitle;
}
