package Day06;
/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_PlaceOrder extends BaseDriver {

    @Test
    void Test1() {
//        WebElement x = driver.findElement(By.id("//img[@id='bitnami-close-banner-button']"));
//
//        Actions ac = new Actions(driver);
//        ac.moveToElement(x).click().build();

        WebElement serch = driver.findElement(By.xpath("//input[@name='search']"));
        serch.sendKeys("ipod");

        WebElement serchBtn = driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        serchBtn.click();

        WebElement adTocart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        adTocart.click();

        WebElement shopping = driver.findElement(By.xpath("//a[text()='shopping cart']"));
        shopping.click();

        WebElement checkOut = driver.findElement(By.xpath("//a[text()='Checkout']"));
        checkOut.click();

        WebElement continue1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));

        continue1.click();

//        List<WebElement> continues = driver.findElements(By.xpath("//input[@value='Continue']"));
//        for (WebElement c : continues) {
//            c.click();
//
//        }
        WebElement continue2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@value='Continue'])[2]")));
        continue2.click();

        WebElement continue3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@value='Continue'])[3]")));
        continue3.click();


//        WebElement click1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
//        click1.click();
        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Continue'])[4]")));

        WebElement continue4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@value='Continue'])[4]")));
        continue4.click();

        WebElement conifirm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //input[@value='Confirm Order']")));
        conifirm.click();

        wait.until(ExpectedConditions.urlContains("succes"));

        WebElement doqrulama = driver.findElement(By.xpath("//h1[text()='Your order has been placed!']"));

        Assert.assertTrue(doqrulama.getText().contains("has been placed"));


    }


}
