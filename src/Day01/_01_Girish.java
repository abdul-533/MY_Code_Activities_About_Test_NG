package Day01;

import org.testng.annotations.Test;
//    public static void main(String[] args) {
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }

//    @Test JUnit
//    public void Test1(){
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }

// Eğer herhangi bir sıralama verilmezse metod isimlerinin alfabetik çalışıyor


public class _01_Girish {
    @Test(priority = 1) // onceliklendirdik hangisi once calishsin diye ishlem (priority=1....n)
    public void webSitesiniAc() {
        System.out.println("Site acildi");

    }

    @Test(priority = 2)
    public void loginishleminiYap() {
        System.out.println("Login yapildi");

    }

    @Test(priority = 3)
    public void driveriKapat() {
        System.out.println("Driver kapatildi");

    }

}
