import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;



public class allJobsOdev extends BasePage{

    By ReleaseDate = By.cssSelector("[data-test='publish-date-filter-button']");
    By Today = By.cssSelector("[for='drp-publish-date-filter-option-1']");
    By ThisWeek = By.cssSelector("[for='drp-publish-date-filter-option-2']");

    public allJobsOdev(WebDriver driver) {super(driver);}

    public void releasedate(){
        driver.findElement(ReleaseDate).click();
    }
    public void releaseToday(){
        driver.findElement(Today).click();
    }
    public void releaseThisWeek(){
        driver.findElement(ThisWeek).click();
    }
}
