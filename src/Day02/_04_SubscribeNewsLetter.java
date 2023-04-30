package Day02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
  3-Ayri bir test ile
  4- Ayrı bir test ile Newsletter  Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapınız.

 */


public class _04_SubscribeNewsLetter extends BaseDriver {
// alternativ olarak locatorlar buraya kona bilir

    By yes = By.xpath("//input[@name='newsletter']");
    By no = By.xpath("//input[@value='0']");
    By continue1 = By.xpath("//input[@type='submit']");

    @Test(priority = 1)
    void Test1() {
//        _02_Example f = new _02_Example();
//        f.loginTest();

//        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
//        WebElement mail = driver.findElement(By.xpath("//input[@id='input-email']"));
//        mail.sendKeys("abdul-533@gmail.com");
//
//        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//        password.sendKeys("Aa199714a");
//
//        WebElement loginEnt = driver.findElement(By.xpath("//input[@type='submit']"));
//        loginEnt.click();

        // otomotik base driverde var o yuzden direk calishir


        WebElement newsLetter = driver.findElement(By.xpath("//a[text()='Newsletter']"));
        //WebElement nersLetterlink=driver.findElement(By.partialLinkText("Newsletter"));
        newsLetter.click();


        WebElement yes1 = driver.findElement(yes);
        yes1.click();

        WebElement continue1 = driver.findElement(By.xpath("//input[@type='submit']"));
        continue1.click();

        // WebElement element = driver.findElement(By.xpath("//*[text()=' Success: Your newsletter subscription has been successfully updated!']"));


        Tools.succesMessageValidation();
//        WebElement messageLabel = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
//
//        Assert.assertTrue(messageLabel.getText().contains("Succes"), "Wrong choice");
//        //  System.out.println("element.getText() = " + element.getText());
    }

    @Test(priority = 2)
    void subscribeFunctionNo() {
        WebElement newsLetter = driver.findElement(By.xpath("//a[text()='Newsletter']"));
        //WebElement nersLetterlink=driver.findElement(By.partialLinkText("Newsletter"));
        newsLetter.click();

        WebElement no = driver.findElement(By.xpath("//input[@value='0']"));
        no.click();

        WebElement continue1 = driver.findElement(By.xpath("//input[@type='submit']"));
        continue1.click();

        // WebElement element = driver.findElement(By.xpath("//*[text()=' Success: Your newsletter subscription has been successfully updated!']"));

        Tools.succesMessageValidation();
        //  System.out.println("element.getText() = " + element.getText());


    }

    @Test(priority = 3)
    void yesNoSubscribe() {
        WebElement newsLetter = driver.findElement(By.xpath("//a[text()='Newsletter']"));
        //WebElement nersLetterlink=driver.findElement(By.partialLinkText("Newsletter"));
        newsLetter.click();

        WebElement yes = driver.findElement(By.xpath("//input[@name='newsletter']"));
        WebElement no = driver.findElement(By.xpath("//input[@value='0']"));
        Tools.Bekle(2);
        if (yes.isSelected()) {
            no.click();
        } else yes.click();

        WebElement continue1 = driver.findElement(By.xpath("//input[@type='submit']"));
        continue1.click();

        Tools.succesMessageValidation();
    }

}
