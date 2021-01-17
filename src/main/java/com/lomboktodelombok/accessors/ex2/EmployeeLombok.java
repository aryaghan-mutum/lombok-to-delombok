/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * <p>
 * Feature: @Accessors(chain = true)
 * Note: If chain option true, setters return this instead of void. default value false, unless fluent=true, then default true
 */

package com.lomboktodelombok.accessors.ex2;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class EmployeeLombok {
    private int id;
    private String name;
}
