package Day02;

import Utility.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _01_Enable {

    @Test
    void Test1() {
        System.out.println("Test 1");
    }

    @Test(enabled = false)
        // bazen bunu calishdirmak lazim olmaz o yuzden sen simdilik anable deyilsin diycez
    void Test2() {
        System.out.println("Test 2");
    }

    @Test()
    void Test3() {
        System.out.println("Test 3");
    }

    //framework driver kismi yapili starting...
    public static WebDriver driver;

    @BeforeClass
        // ilk bu
    void bashlanqicIhslemleri() {

        System.out.println("Bashlanqic ishlemi yapiliyor");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        // driver.manage().window().maximize();
        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);

    }

    @AfterClass
        // en son bu
    void bitishIshlemleri() {
        System.out.println("Bitish ishlemleri yapiliyor");
        Tools.Bekle(3);
        driver.quit();
    }


}
