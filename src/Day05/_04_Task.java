package Day05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Daha önceki derslerde yaptğımız Search fonksiyonunu
 * mac,ipod ve samsung için Dataprovider ile yapınız.
 */

public class _04_Task extends BaseDriver {
    @Test(dataProvider = "getData")
    void SerchFunction(String text) {
        WebElement serch = driver.findElement(By.name("search"));
        serch.clear();
        serch.sendKeys(text);


        WebElement arat = driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        arat.click();

        List<WebElement> captions = driver.findElements(By.cssSelector("div[class='caption']>h4"));

        for (WebElement e : captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(text.toLowerCase()));
        }


    }


    @DataProvider
    Object[] getData() {
        Object[] data = {"mac", "samsung","ipod"};

        return data;

    }
}

