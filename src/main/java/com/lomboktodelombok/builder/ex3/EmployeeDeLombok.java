/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * <p>
 * Feature: @Builder at Method level
 * Note:
 * If your class already have a method to create instance, you can make it as builder by declaring @Builder on that method.
 */

package com.lomboktodelombok.builder.ex3;

public class EmployeeDeLombok {

    private int id;
    private String name;

    public EmployeeDeLombok(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Generate instance with default role and status
     */
    public static EmployeeDeLombok createInstance(int id, String name) {
        return new EmployeeDeLombok(id, name);
    }

    public static class EmployeeBuilder {

        private int id;
        private String name;

        EmployeeBuilder() {
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public EmployeeDeLombok.EmployeeBuilder setId(final int id) {
            this.id = id;
            return this;
        }

        public EmployeeDeLombok.EmployeeBuilder setName(final String name) {
            this.name = name;
            return this;
        }

        public EmployeeDeLombok build() {
            return EmployeeDeLombok.createInstance(this.id, this.name);
        }

        @Override
        public String toString() {
            return "EmployeeBuilder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static EmployeeDeLombok.EmployeeBuilder builder() {
        return new EmployeeDeLombok.EmployeeBuilder();
    }

}