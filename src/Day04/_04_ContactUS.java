package Day04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */
public class _04_ContactUS extends BaseDriver {

    @Test
    @Parameters("mesaj")
        //xml deki parametre adi olmak zorunda
    void contactUs(String gelenMesaj) {
        //string gelen mesaj: method icin gerekli tanimlama ayni olmak zorunda

        WebElement contact = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contact.click();

        WebElement mesage = driver.findElement(By.name("enquiry"));
        mesage.sendKeys(gelenMesaj); //burayi xml den yapalim

        WebElement submit = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submit.click();

//        WebElement yazi=driver.findElement(By.xpath("//h1[text()='Contact Us']"));
//        Assert.assertTrue(yazi.getText().contains("Contact Us"), "you do wrong choice");
        Assert.assertTrue(driver.getCurrentUrl().contains("succes"));

    }
}
