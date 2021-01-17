/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: put annotations on generated @NoArgsConstructor
 */

package com.lomboktodelombok.noargsconstructor.ex4;

import lombok.NoArgsConstructor;

@NoArgsConstructor(onConstructor_ = @Deprecated)
public class EmployeeLombok {
    private int id;
    private String name;
}
