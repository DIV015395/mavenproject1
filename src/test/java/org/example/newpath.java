package org.example;

import org.testng.annotations.*;

public class newpath
{
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("Beforeclass");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("After class");

    }
    @Test
    public void test()
    {
        System.out.println("Test");
    }
    @Test
    public void test1()
    {
        System.out.println("Test");
    }

}
