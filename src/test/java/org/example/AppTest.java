package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testcase1_login()
    {
        App a = new App();
        Assert.assertEquals(true,a.login_page("Manjeet","MAN3328"));
    }

}
