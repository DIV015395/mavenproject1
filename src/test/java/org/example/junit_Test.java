package org.example;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.*;

public class junit_Test
{

    @BeforeAll
    public void beforeclass()
    {
        System.out.println("BeforeAll");
    }
    @AfterAll
    public void afterclass()
    {
        System.out.println("AfterAll");

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

