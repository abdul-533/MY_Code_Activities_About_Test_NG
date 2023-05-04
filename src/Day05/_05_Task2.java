package Day05;

import Utility.BaseDriverParametr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
/**
 * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
 * sonrasında fakrlı tarayıcılar ile çalıştırınız. (crossbrowser)
 * sonrasında paralel çalıştırınız.(parallel)
 */

public class _05_Task2 extends BaseDriverParametr {

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
