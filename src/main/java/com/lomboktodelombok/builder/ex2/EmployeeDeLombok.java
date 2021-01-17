/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 *
 * Feature: @Builder at Class level
 * Note: Applying @Builder annotation at class level it generates sophisticated builder APIs for the class.
 */

package com.lomboktodelombok.builder.ex2;

public class EmployeeDeLombok {

    private int id;
    private String name;

    public EmployeeDeLombok(final int id, final String name) {
        this.id = id;
        this.name = name;
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

        public EmployeeBuilder setId(final int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(final String name) {
            this.name = name;
            return this;
        }

        public EmployeeDeLombok build() {
            return new EmployeeDeLombok(this.id, this.name);
        }

        @Override
        public String toString() {
            return "EmployeeBuilder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public static EmployeeDeLombok.EmployeeBuilder builder() {
            return new EmployeeDeLombok.EmployeeBuilder();
        }
    }
}
