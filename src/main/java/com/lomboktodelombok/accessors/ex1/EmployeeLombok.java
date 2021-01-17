/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * <p>
 * Feature: @Accessors(fluent = true)
 * Note: it is used with @Getter/@Setter annotations to configure how lombok generates and looks for getters and setters.
 */

package com.lomboktodelombok.accessors.ex1;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class EmployeeLombok {
    private int id;
    private String name;
}
