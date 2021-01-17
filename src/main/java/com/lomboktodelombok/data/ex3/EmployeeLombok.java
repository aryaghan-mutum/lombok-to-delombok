/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: include or exclude fields using @Data
 */

package com.lomboktodelombok.data.ex3;

import lombok.*;

@Data
public class EmployeeLombok {

    @Setter(value = AccessLevel.NONE)
    private int id;

    @Getter(value = AccessLevel.NONE)
    private String name;

    @ToString.Exclude
    private double salary;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private String jobTitle;
}
