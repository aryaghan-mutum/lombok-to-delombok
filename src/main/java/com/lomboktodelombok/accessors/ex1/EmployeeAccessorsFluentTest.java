/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * <p>
 * Feature: @Accessors(fluent = true)
 * Note: it is used with @Getter/@Setter annotations to configure how lombok generates and looks for getters and setters.
 */

package com.lomboktodelombok.accessors.ex1;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeAccessorsFluentTest {

    @Test
    public void testEmployeeLombokAccessorsFluent() {
        EmployeeLombok employeeLombok = new EmployeeLombok();
        employeeLombok.id(8765).name("Chad Presley");

        Assert.assertEquals(employeeLombok.id(), 8765);
        Assert.assertEquals(employeeLombok.name(), "Chad Presley");
    }

    @Test
    public void testEmployeeDeLombokAccessorsFluent() {
        EmployeeDeLombok employeeDeLombok = new EmployeeDeLombok();
        employeeDeLombok.id(8765).name("Chad Presley");

        Assert.assertEquals(employeeDeLombok.id(), 8765);
        Assert.assertEquals(employeeDeLombok.name(), "Chad Presley");
    }

}
