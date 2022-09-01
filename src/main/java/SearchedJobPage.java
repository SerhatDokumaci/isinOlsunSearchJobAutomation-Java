import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchedJobPage extends BasePage{

    By Jobs = By.cssSelector("[data-test='job-list-item'] [class='jsx-1449613932 card-city']");
    By JobLocationText = By.cssSelector("[data-test='job-list-city'][class='jsx-1966909199 city']");


    public SearchedJobPage(WebDriver driver)
    {
        super(driver);
    }

    public void Jobs() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        synchronized (wait) {wait.wait(2000);}
        List<WebElement> Jobs_list = driver.findElements(Jobs);

        for (WebElement element:Jobs_list) {
            //wait.until(ExpectedConditions.elementToBeClickable(element));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();
            String Job_text = element.getText();
            String Verify_text = "Kadıköy, İstanbul";
            Assertions.assertEquals(Verify_text, Job_text);
        }
    }
}
