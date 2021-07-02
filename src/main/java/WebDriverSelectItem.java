import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String localUrl = "file:///Users/masayoshi/workspace/github/AutomationTest/src/main/webapp/SelectItem.html";
        driver.get(localUrl);

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("No");

    }
}
