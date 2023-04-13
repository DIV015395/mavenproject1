package org.example;

import org.testng.annotations.Test;

public class test_method_depend
{
    @Test
    void login()
    {
        System.out.println("login");
    }
    @Test(dependsOnMethods = "login")
    void accesshomepage()
    {
        System.out.println("accesshomepage");
    }
    @Test(dependsOnMethods = {"login","accesshomepage"})
    void announcemnt()
    {
        System.out.println("announcemnt");
    }
}
