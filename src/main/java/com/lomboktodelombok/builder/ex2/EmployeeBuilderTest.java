/**
 * @Author: Anurag Muthyam
 * Email: anu.drumcoder@gmail.com
 * GitHub: https://github.com/aryaghan-mutum
 *
 * Feature: @Builder at Class level
 * Note: Applying @Builder annotation at class level it generates sophisticated builder APIs for the class.
 */

package com.lomboktodelombok.builder.ex2;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeBuilderTest {

    @Test
    public void testEmployeeLombokBuilderAtConstructorTest() {
        EmployeeLombok employeeLombok = EmployeeLombok.builder()
                .id(8765)
                .name("Chad Presley")
                .build();

        Assert.assertEquals(employeeLombok.getId(), 8765);
        Assert.assertEquals(employeeLombok.getName(), "Chad Presley");
    }

    //FIX ME
    @Test
    public void testEmployeeDeLombokBuilderAtConstructorTest() {
        EmployeeDeLombok employeeDeLombok = EmployeeDeLombok.EmployeeBuilder.builder()
                .setId(8765)
                .setName("Chad Presley")
                .build();

//        Assert.assertEquals(employeeDeLombok.getId(), 8765);
//        Assert.assertEquals(employeeDeLombok.getName(), "Chad Presley");
    }
}
