package Day07;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_WishListElements {
    public _02_WishListElements() {

        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "div[class='caption']>h4>a")
    List<WebElement> searhResult;

    @FindBy(xpath = "//button[@data-original-title='Add to Wish List']")
    List<WebElement> wishBtnList;
    @FindBy(id = "wishlist-total")
    WebElement btnWisthProducts;

    @FindBy(css = "[class='text-left']>a")
    List<WebElement> wishTableNames;


}

/*
Product Owner -> Birimlerin müdürü

Takım Lideri
Scrum Master
Business Analist(iş analisti)
Developerler
Testerlar

Proje Gelir
Müşteri -> BA ya anlatır.
BA -> Dev lere anlatır.
Developer yazılıma başlar.
Dev Unit test oluşturur.
Testera gider. DEV kontrol ediyor,
   (bu testin içind emüşteri gereksinimleri yok)
  problemler : müşterinin istediği gibi olmadı
               userfriend li olmadı

testine göre bire
Test Driven Development -> TDD


------> yöntemler değiştirildi. Agile Yöntemi
Müşteri
BA
Tester -> test case leri yazmaya başladı
Dev e dedileri, senin yazdığın yazılım
    tester ın caselerine göre çalışmalı.


son kullanıcınn davranışına göre yöntem olduğu için
Behaviour Driven Development -> BDD

Testera dedilerki-> testleri öyle yazki
müşteri bakınca da anlasın
BA bakınca da anlasın
Dev bakınca da anlasın

Cucumber BDD test Organizatörü

Senaryo: Login Kontrolü
Siteye git
Login bilgilerini gönder
Sonra girildiğini kontrol et.

“ Agile methodolojisi ile iş yapıyorsanız ve uygulama testi için
BDD kullanmıyorsanız kendinizle çelişiyorsunuzdur. ”

Bize bu şekilde senaryo yazma imkanı veren TOOL CUCUMBER dır.

 */
