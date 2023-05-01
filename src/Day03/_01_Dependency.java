package Day03;

import org.testng.annotations.Test;

public class _01_Dependency {

    //araba haraketi: start, drive, park,stop haraket siniri
    @Test
    void startCar() {
        System.out.println("Start Car");
        //icinde ishlemler var simdilik bunla idare et
        // calishtirma esnasinda startda problem olushdu onda diyerlerini etkilemez baqlarsak etkiler ve diyerleri calishmaz bununcun dependenci ile bir birine baqliyicaz
        //Assert.fail();

    }

    @Test(dependsOnMethods = {"startCar"})
        // buraya birden fazla metod da yaza biliyoruz misal ikiside bashari olsun sarti
        // bunla her birini bir oncekine baqladik ve hepsi biri biirni etkiler
    void driveCar() {
        System.out.println("Drive Car");
        //icinde ishlemler var simdilik bunla idare et

    }

    @Test(dependsOnMethods = {"startCar", "driveCar"})
    void parkCar() {
        System.out.println("Park Car");
        //icinde ishlemler var simdilik bunla idare et


    }

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)
        //alwaysRun=true baqimliliklari var amma hata cikarsa da yinr calishir
    void stopCar() {
        System.out.println("Stop Car");
        //icinde ishlemler var simdilik bunla idare et


    }// tek tek calistirmada 2 taneye kadar uzerinde olani calishtirir
    // 3 ve daha ust uzerinde calishtirilmasi gereken olursa calihtive fail messajini firlatir



    // aynı seviyedeki testleri için priority verilebilir.
    // bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde
    // 2 üste kadar ototmatik çağırıp çalışabilir.

}
