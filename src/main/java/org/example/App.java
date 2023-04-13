package org.example;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App 
{
    public boolean login_page(String uname,String pass)
    {
        ResourceBundle r = ResourceBundle.getBundle("config");
        String username = r.getString("username");
        String password = r.getString("Password");
        if(username.equals(uname) && password.equals(pass))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main( String[] args )

    {
        System.out.println( "Hello World!" );
    }
}
