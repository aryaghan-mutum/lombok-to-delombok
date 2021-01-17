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

public final class EmployeeDeLombok {

    private final int id;
    private final String name;

    public EmployeeDeLombok(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public static EmployeeDeLombok getInstance(final int id, final String name) {
        return new EmployeeDeLombok(id, name);
    }

    // rest of the code ...
}
