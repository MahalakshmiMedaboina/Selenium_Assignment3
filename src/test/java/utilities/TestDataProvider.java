package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class TestDataProvider {

    @DataProvider(name = "jsonData")
    public Object[][] getJsonDataProvider() throws IOException {

        String path = System.getProperty("user.dir") + "/testdata/loginData.json";

        List<HashMap<String, String>> data = JsonUtil.getJsonData(path);

        return new Object[][] {
            { data.get(0) },
            { data.get(1) }
        };
    }
}