import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    By All_Jobs = By.cssSelector("[data-test='all-jobs-link']");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void GoToAllJobs(){
        driver.findElement(All_Jobs).isDisplayed();
        driver.findElement(All_Jobs).click();
    }
}
