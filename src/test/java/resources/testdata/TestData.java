package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name ="credentials" )
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"test1@gami.com", "test123"},
                {"test2@gami.com", "test234"},
                {"test3@gami.com", "test345"},
        };
        return data;
    }@DataProvider(name = "registration")
    public Object[][] getRegistrationData(){
        Object[][] data = new Object[][]{
                {"test1@gami.com", "test123"},
                {"test2@gami.com", "test234"},
                {"test3@gami.com", "test345"},
        };
        return data;
    }
}
