import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allJobsOdevTests extends BaseTest{


    HomePage homepage;
    allJobsOdev alljobsodev;

    
    @Test
    @Order(1)
    public void tc001(){
        homepage = new HomePage(driver);
        homepage.GoToAllJobs();
        alljobsodev = new allJobsOdev(driver);
        alljobsodev.releasedate();
        alljobsodev.releaseToday();
    }
    @Test
    @Order(2)
    public void tc002(){
        homepage = new HomePage(driver);
        homepage.GoToAllJobs();
        alljobsodev = new allJobsOdev(driver);
        alljobsodev.releasedate();
        alljobsodev.releaseThisWeek();
    }
    @Test
    @Order(3)
    public void tc003(){
        homepage = new HomePage(driver);
        homepage.GoToAllJobs();
        alljobsodev = new allJobsOdev(driver);
        alljobsodev.releasedate();
        alljobsodev.releaseToday();
        alljobsodev.releaseThisWeek();
    }
}
