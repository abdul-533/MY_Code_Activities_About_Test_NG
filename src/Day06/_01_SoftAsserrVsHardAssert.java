package Day06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAsserrVsHardAssert {

    @Test
    void hardAssert() {
        String s1 = "Hello"; //"Hello1 ->farkli verdiyimizde kirar
        System.out.println("Hard Assert oncesi");
        Assert.assertEquals("Hello", s1, "Olushan ve beklenen esit deyiol");
        System.out.println("Hard Assert sonraso"); // testi kirara yalnish olursa ve bu gozukmez
    }

    @Test
    void softAssert() { //hatalari topla en sonda ben dediyimde ver buna sofy Asser toplu olarak istediyimiz yerde verir
        String strHomePage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String strEditAccount = "www.facebook.com/editaccountpage";

        SoftAssert _softAssert = new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage); //true;
        System.out.println("soft Assert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCartPage); //false;
        System.out.println("soft Assert 2");

        _softAssert.assertEquals("www.facebook.com/settings", strEditAccount); //false;
        System.out.println("soft Assert 3");

        _softAssert.assertAll(); //butun assert sonuclarini ishleme koyar
        System.out.println("soft AssertAll: aktivlik sonrasi"); // ishlemden sonra olduqu icin bu kisim cikmaz

    }
}
