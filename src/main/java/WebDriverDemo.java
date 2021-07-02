import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverDemo {
    public static void main(String[] args) throws MalformedURLException {

//        WebDriver driver = new ChromeDriver();

//        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8181/wd/hub"),
//                DesiredCapabilities.chrome());

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8181/wd/hub"),
        new DesiredCapabilities("firefox", "", Platform.MAC));

        driver.get("https://www.google.com/?hl=en");

        WebElement searchFiled = driver.findElement(By.name("q"));
        searchFiled.sendKeys("pluralsight");
        searchFiled.submit();

        WebElement imagesLinks = driver.findElements(By.linkText("Images")).get(0);
        imagesLinks.click();

        WebElement imageElement = driver.findElements(By.cssSelector("a[jsname = sTFXNd]")).get(0);
        imageElement.click();
    }
}
