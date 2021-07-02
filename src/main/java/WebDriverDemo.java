import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
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
