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
import com.lomboktodelombok.builder.ex2.EmployeeDeLombok;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeBuilderTest {

    @Test
    public void testEmployeeLombokBuilderAtMethodTest() {
        EmployeeLombok employeeLombok = EmployeeLombok.builder()
                .id(8765)
                .name("Chad Presley")
                .build();

        Assert.assertEquals(employeeLombok.getId(), 8765);
        Assert.assertEquals(employeeLombok.getName(), "Chad Presley");
    }

    //FIX ME
    @Test
    public void testEmployeeDeLombokBuilderAtMethodTest() {
        EmployeeDeLombok employeeDeLombok = EmployeeDeLombok.EmployeeBuilder.builder()
                .setId(8765)
                .setName("Chad Presley")
                .build();

//        Assert.assertEquals(employeeDeLombok.getId(), 8765);
//        Assert.assertEquals(employeeDeLombok.getName(), "Chad Presley");
    }

}
