/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * Feature: @Value
 * @Value is used when creating Immutable classes.
 * All Lombok generated fields are made private and final by default,
 * and setters are not generated. The class itself is also made final by default.
 */

package com.lomboktodelombok.value.ex2;

import java.util.Objects;

public final class EmployeeDeLombok {

    private final int id;
    private final String name;

    public EmployeeDeLombok(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "EmployeeDeLombok{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDeLombok that = (EmployeeDeLombok) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
