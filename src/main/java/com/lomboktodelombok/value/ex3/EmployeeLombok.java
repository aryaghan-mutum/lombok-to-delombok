/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 *
 * Feature: @Value(staticConstructor = "getInstance")
 * If you specify a staticConstructor name, then the generated constructor will be private,
 * a static factory method is created to that other classes can use to create instances.
 */
package com.lomboktodelombok.value.ex3;

import lombok.Value;

@Value(staticConstructor = "getInstance")
public class EmployeeLombok {

    private int id;
    private String name;
}
