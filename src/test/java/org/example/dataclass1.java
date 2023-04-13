package org.example;

import org.testng.annotations.DataProvider;

public class dataclass1
{
    @DataProvider(name ="mylogindata")
    public Object[][] getlogindata()
    {
        Object[][] data = {{11904954,"Manjeet"},{11904866,"Gagan"},{123456,"xscsc"}};
        return data;

    }
}
