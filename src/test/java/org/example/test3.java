package org.example;

import org.testng.annotations.Test;

import javax.swing.*;

public class test3
{

    @Test(groups="regression")
    void test1()
    {
        System.out.println("Test1");
    }
    @Test(groups="critical")
    void test2()
    {
        System.out.println("Test2");
    }
    @Test(groups="smoke")
    void est3()
    {
        System.out.println("test3");
    }
    @Test(groups="critical")
    void test4()
    {
        System.out.println("Test4");

    }
    @Test(groups="smoke")
    void test5()
    {
        System.out.println("5");
    }
    @Test(groups="regression")
    void test6()
    {
        System.out.println("Test6");
    }

}
