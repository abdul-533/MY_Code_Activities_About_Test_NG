package Day05;

import Utility.BaseDriverParametr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_SerchFunctionality extends BaseDriverParametr {


        @Test
        @Parameters("mesaj")
        void Test1(String kelime) {

            WebElement serch = driver.findElement(By.name("search"));
            serch.sendKeys(kelime);

            WebElement arat = driver.findElement(By.xpath("//i[@class='fa fa-search']"));
            arat.click();

            List<WebElement> captions = driver.findElements(By.cssSelector("div[class='caption']>h4"));

            for (WebElement e : captions) {
                Assert.assertTrue(e.getText().toLowerCase().contains(kelime.toLowerCase()));
            }

        }
}
