package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderexample
{
//    @DataProvider(name ="mylogindata")
//    public Object[][] getlogindata()
//    {
//        Object[][] data = {{11904954,"Manjeet"},{11904866,"Gagan"},{123456,"xscsc"}};
//        return data;
//
//    }
    @Test(dataProvider = "mylogindata",dataProviderClass = dataclass1.class)
    public void loginform(int reg,String name)
    {
        System.out.println(reg+"->"+name);
    }

}
