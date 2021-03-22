import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {

    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Second Link From The Yandex Response")
    public static void submitForm() {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        YandexPage yandexPage = new YandexPage(driver);
        yandexPage.setRequestText("API testing");
        yandexPage.clickSearchButton();
        yandexPage.clickSecondLink();
        driver.close();
    }

}
