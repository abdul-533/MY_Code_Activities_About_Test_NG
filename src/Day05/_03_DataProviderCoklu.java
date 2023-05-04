package Day05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProviderCoklu {

    @Test(dataProvider = "userData")
    void UsernameTest(String username, String password) {
        System.out.println("user: " + username + " " + password);

    }

    @DataProvider
    public Object[][] userData() {

        Object[][] data = {
                {"Nurhayat", "111w2"},
                {"Ali", "41ww3"},
                {"Hakan", "000899u8"},
        };


        return data;


    }
}
