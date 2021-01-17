/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * <p>
 * Feature: @Accessors(fluent = true)
 * Note: it is used with @Getter/@Setter annotations to configure how lombok generates and looks for getters and setters.
 */

package com.lomboktodelombok.accessors.ex1;

public class EmployeeDeLombok {

    private int id;
    private String name;

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public EmployeeDeLombok id(final int id) {
        this.id = id;
        return this;
    }

    public EmployeeDeLombok name(final String name) {
        this.name = name;
        return this;
    }
}
