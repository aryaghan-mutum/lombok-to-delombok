/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * <p>
 * Feature: @Accessors(chain = true)
 * Note: If chain option true, setters return this instead of void. default value false, unless fluent=true, then default true
 */

package com.lomboktodelombok.accessors.ex2;

public class EmployeeDeLombok {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmployeeDeLombok setId(final int id) {
        this.id = id;
        return this;
    }

    public EmployeeDeLombok setName(final String name) {
        this.name = name;
        return this;
    }
}
