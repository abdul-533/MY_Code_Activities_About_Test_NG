package Day02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Example extends BaseDriver {

    //https://opencart.abstracta.us/index.php?route=account/login

    //name; Abdul
    //surname: Alizada
    // mail: abdul-533@gmail.com
    //phone:0-111
    // password:Aa199714a

    @Test
    void loginTest() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
//        WebElement login = driver.findElement(By.xpath("//a[@class='list-group-item']"));
//        login.click();

        WebElement mail = driver.findElement(By.xpath("//input[@id='input-email']"));
        mail.sendKeys("abdul-533@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Aa199714a");

        WebElement loginEnt = driver.findElement(By.xpath("//input[@type='submit']"));
        loginEnt.click();

        //Assert.assertTrue(driver.getCurrentUrl().equals("https://opencart.abstracta.us/index.php?route=account/account"),"Yalnish girish");
        Assert.assertTrue(driver.getTitle().equals("My Account"));
        //Assert.assertEquals(driver.getTitle(), "My Account", "Login olmadi");

    }


}
