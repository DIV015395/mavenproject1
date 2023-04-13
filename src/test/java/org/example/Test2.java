package org.example;

import org.testng.annotations.*;

public class Test2
{
    @BeforeSuite
    public void beforeSuit()
    {
        System.out.println("BeforeSuit");
    }
    @AfterSuite
    public void afterSuit()
    {
        System.out.println("AfterSuit");

    }
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("Beforeclass");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("Afterclass");

    }
    @BeforeMethod
    public void beforeM()
    {
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void afterM()
    {
        System.out.println("AfterMethod");

    }
    @Test
    public void test()
    {
        System.out.println("Test");
    }
    @Test
    public void test1()
    {
        System.out.println("Test 1");
    }
    @Test
    public void test2()
    {
        System.out.println("Test2");
    }
    @Test
    public void test3()
    {
        System.out.println("Test3");
    }
}
