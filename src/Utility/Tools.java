package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {


    public static void Bekle(int sn) {
        // milli saniyye cinsinden beklediyi icin 1000 le carpilir
        // bekletme metoufu

        try {
            Thread.sleep(1000 * sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

            // bunu try catch yapmamisin neden simdilik boyle kullan ilicak
        }


    }

    public static void succesMessageValidation() {
        WebElement messageLabel = BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(messageLabel.getText().contains("succes"), "Wrong choice");


    }

    public static int RandomGenerator(int max){ //4
        return (int)(Math.random()*max); // 0,1,2,3
    }

    public static void listContainsString(List<WebElement> list, String aranacakKelime){

        boolean bulundu=false;
        for(WebElement e: list){
            if (e.getText().toLowerCase().contains(aranacakKelime.toLowerCase()))
            {
                bulundu=true;
                break;
            }
        }

        if (bulundu==false)
            Assert.fail();

    }
}
