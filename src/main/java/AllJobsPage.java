import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllJobsPage extends BasePage{

    By PositionSearch = By.id("position-search");
    By LocationSearch = By.id("location-search");
    By SearchButton = By.cssSelector("[data-test='job-search-button']");

    public AllJobsPage(WebDriver driver){
        super(driver);
    }

    public void FindJob(){
        driver.findElement(PositionSearch).click();
        driver.findElement(PositionSearch).sendKeys("garson");
        driver.findElement(LocationSearch).click();
        driver.findElement(LocationSearch).sendKeys("kadıköy");
        driver.findElement(SearchButton).click();
    }
}
