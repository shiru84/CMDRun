package s.com_side_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CMDRunSimpleTest {
    static ChromeDriver driver = null;
    @BeforeSuite
    void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    void test(){
        driver.get("http://samsung.com/uk");
        driver.findElement(By.id("truste-consent-button")).click();
    }
        @Test
        void test01 () {
            test();
        }
        @AfterSuite
        void close(){
        driver.close();
        }
}
