/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: static factory method using @NoArgsConstructor
 */

package com.lomboktodelombok.noargsconstructor.ex3;

import lombok.NoArgsConstructor;

@NoArgsConstructor(staticName = "getInstance")
public class EmployeeLombok {
    private int id;
    private String name;
}
