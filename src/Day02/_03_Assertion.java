package Day02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertion {


    @Test
    void EqualExample() {
        String c1 = "Hello";
        String c2 = "Hello";
        //Actual (olushan), Expected(beklenen), Message(opsionel)
        Assert.assertEquals(c1, c2, "Karsilashtirma vasharisiz oldu");
        //Assert.assertEquals(driver.getTitle(), "My Account", "Login olmadi");
    }

    @Test
    void notEqualExample() {
        String s1 = "Hello";
        String s2 = "Hello 1";

        Assert.assertNotEquals(s1, s2, "olushan ve beklenen eist oldu oldu");
    }

    @Test
    void trueExample() {
        int d1 = 55;
        int d2 = 66;
        Assert.assertTrue(d1 == d2, "Olushan beklenen esit olmadi");   // mesaji else gibi dushunun

    }

    @Test
    void nullExample() {

        String f1 = null;
        Assert.assertNull(f1, "Olushan null olmadi");

    }

    @Test
    void failExample() {

        int a = 55;

        if (a == 55)
            Assert.fail();  // direk fail verdirme

    }


}
