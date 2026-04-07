package utilities;

import org.testng.annotations.DataProvider;
import java.util.HashMap;

public class TestDataProvider {

    @DataProvider(name = "loginDataMap")
    public Object[][] getData() {

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("username", "standard_user");
        map1.put("password", "secret_sauce");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("username", "problem_user");
        map2.put("password", "secret_sauce");

        return new Object[][] {
            { map1 },
            { map2 }
        };
    }
}