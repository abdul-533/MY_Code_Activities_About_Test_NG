package Day03;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son adresi siliniz.
 */


public class _02_AdressFunctionality extends BaseDriver {
    @Test
    void addAddress() {
        WebElement addBook1 = driver.findElement(By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=account/address']"));
        addBook1.click();

        WebElement newBook = driver.findElement(By.xpath("//a[text()='New Address']"));
        newBook.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='input-firstname']"));
        firstName.sendKeys("Alim");

        WebElement lastNAme = driver.findElement(By.xpath("//input[@id='input-lastname']"));
        lastNAme.sendKeys("AlizadaA");

        WebElement company = driver.findElement(By.xpath("//input[@id='input-company']"));
        company.sendKeys("Techno Study");
        WebElement adres1 = driver.findElement(By.xpath("//input[@id='input-address-1']"));
        adres1.sendKeys("Baku Azerbaijan");
        WebElement adress2 = driver.findElement(By.name("address_2"));
        adress2.sendKeys("H.Aslanov");
        WebElement city = driver.findElement(By.xpath("//input[@id='input-city']"));
        city.sendKeys("Lerik");
        WebElement poscode = driver.findElement(By.xpath("//input[@id='input-postcode']"));
        poscode.sendKeys("0043");

        WebElement Webcountry = driver.findElement(By.xpath("//select[@id='input-country']"));
        Select country = new Select(Webcountry);
        country.selectByVisibleText("Azerbaijan");

        //2 ci secenek
        wait.until(ExpectedConditions.elementToBeClickable(Webcountry));
        //yani secildikden sonra kendine gelene kadar bekle  bu bize diyerinin kendine gelmesini verir
        // bu da ikinci yontem

        //1-ci secenek
        // once elementi bulalim burda optionlari bayatladiqi yenilendiyi icin bunu aldik bunu indexicin yapdik
        //       WebElement options = driver.findElement(By.cssSelector("select[id='input-zone']>option"));
        //            wait.until(ExpectedConditions.stalenessOf(options));

        WebElement Webzone = driver.findElement(By.xpath("//select[@id='input-zone']"));
        Select zone = new Select(Webzone);
        // zone.selectByVisibleText("Lerik");
        //zone.selectByValue("240");
        zone.selectByIndex(20);

        //selectByVisibleText: and  zone.selectByValue:
        // find element gibi calishdiqindan
        //implicivly Wait i kullanir implicitly wait olmazsa elementi bulamaz ve calishmaz

        //zone.selectByIndex: index implicitly wait ile calishmiyor, explicitly waitle calishir

        //StaleElementReferenceException:   eskisi gibi olmayan yani yenilenmish,
        //yani bayatladi hizli bulduqu icin indexle bulma zamani implicity wait de yetmedi
        //tex buldum erken kayb etdim

        WebElement contin = driver.findElement(By.xpath("//input[@value='Continue']"));
        contin.click();

//        WebElement true1 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
//        Assert.assertTrue(true1.getText().contains("succes"));
        Tools.succesMessageValidation();

    }

    @Test(dependsOnMethods = "addAddress")
    void editAddress() {
        List<WebElement> editler = driver.findElements(By.linkText("Edit"));
        WebElement edit;
        edit = editler.get(editler.size() - 1);

        // WebElement edit = driver.findElement(By.xpath("(//table[@class='table table-bordered table-hover']//child::tr)[2]//following::td[2]//child::a[1]"));
        edit.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='input-firstname']"));
        firstName.clear();
        firstName.sendKeys("Ali2");

        WebElement lastNAme = driver.findElement(By.xpath("//input[@id='input-lastname']"));
        lastNAme.clear();
        lastNAme.sendKeys("Alizada2");

//        WebElement Webcountry = driver.findElement(By.xpath("//select[@id='input-country']"));
//        Select country = new Select(Webcountry);
//        country.selectByVisibleText("Azerbaijan");


//        //1-ci secenek
//        // once elementi bulalim burda optionlari bayatladiqi yenilendiyi icin bunu aldik bunu indexicin yapdik
//        WebElement options = driver.findElement(By.cssSelector("select[id='input-zone']>option"));
//        wait.until(ExpectedConditions.stalenessOf(options));
//
//        WebElement Webzone = driver.findElement(By.xpath("//select[@id='input-zone']"));
//        Select zone = new Select(Webzone);
//        // zone.selectByVisibleText("Lerik");
//        //zone.selectByValue("240");
//        zone.selectByIndex(24);


        WebElement contin = driver.findElement(By.xpath("//input[@value='Continue']"));
        contin.click();

        Tools.succesMessageValidation();

//        WebElement true1 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
//        Assert.assertTrue(true1.getText().contains("updated"));


    }

    @Test(dependsOnMethods = {"editAddress", "addAddress"})
    void deleteAddress() {

        WebElement addBook1 = driver.findElement(By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=account/address']"));
        addBook1.click();

        List<WebElement> editler = driver.findElements(By.linkText("Delete"));
        WebElement delete1;
        delete1 = editler.get(editler.size() - 1);

       // WebElement delete1 = driver.findElement(By.xpath("(//table[@class='table table-bordered table-hover']//child::tr)[2]//following::td[2]//child::a[2]"));
        // WebElement delete1 = driver.findElement(By.xpath("(//a[text()='Delete']//following::a)[18]"));

        delete1.click();

//        WebElement true1 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
//        Assert.assertTrue(true1.getText().contains("deleted"));

        Tools.succesMessageValidation();


    }
}
