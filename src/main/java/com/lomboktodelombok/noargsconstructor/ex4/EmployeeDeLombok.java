/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: put annotations on generated @NoArgsConstructor
 */

package com.lomboktodelombok.noargsconstructor.ex4;

public class EmployeeDeLombok {

    private int id;
    private String name;

    @Deprecated
    private EmployeeDeLombok() {
    }
}
