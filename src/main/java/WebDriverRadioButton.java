import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String localUrl = "file:///Users/masayoshi/workspace/github/AutomationTest/src/main/webapp/RadioButton.html";
        driver.get(localUrl);
        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for (WebElement radioButton:
             radioButtons) {
            if (radioButton.isSelected()) {
                System.out.println(radioButton.getAttribute("value"));
            }
        }

        WebElement checkBox = driver.findElement(By.id("turkeyCheckbox"));
        checkBox.click();
        checkBox.click();

    }
}
