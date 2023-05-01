package Day04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */

public class _05_SearchFunctionality extends BaseDriver {

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
