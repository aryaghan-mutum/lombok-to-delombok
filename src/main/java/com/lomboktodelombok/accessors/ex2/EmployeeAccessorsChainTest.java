/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 * <p>
 * Feature: @Accessors(chain = true)
 * Note: If chain option true, setters return this instead of void. default value false, unless fluent=true, then default true
 */

package com.lomboktodelombok.accessors.ex2;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeAccessorsChainTest {

    @Test
    public void testEmployeeLombokAccessorsChain() {
        EmployeeLombok employeeLombok = new EmployeeLombok();
        employeeLombok.setId(8765).setName("Chad Presley");

        Assert.assertEquals(employeeLombok.getId(), 8765);
        Assert.assertEquals(employeeLombok.getName(), "Chad Presley");
    }

    @Test
    public void testEmployeeDeLombokAccessorsChain() {
        EmployeeDeLombok employeeDeLombok = new EmployeeDeLombok();
        employeeDeLombok.setId(8765).setName("Chad Presley");

        Assert.assertEquals(employeeDeLombok.getId(), 8765);
        Assert.assertEquals(employeeDeLombok.getName(), "Chad Presley");
    }

}
