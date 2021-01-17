/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: static factory method using @NoArgsConstructor
 */
package com.lomboktodelombok.noargsconstructor.ex3;

public class EmployeeDeLombok {

    private int id;
    private String name;

    private EmployeeDeLombok() {
    }

    public EmployeeDeLombok getInstance() {
        return new EmployeeDeLombok();
    }


}
