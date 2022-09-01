import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchedJobPageTests extends BaseTest{

    HomePage homepage;
    AllJobsPage allJobs;
    SearchedJobPage searchedJob;


    @Test
    @Order(1)
    public void JobAssertion() throws InterruptedException {
        homepage = new HomePage(driver);
        homepage.GoToAllJobs();
        allJobs = new AllJobsPage(driver);
        allJobs.FindJob();
        searchedJob = new SearchedJobPage(driver);
        searchedJob.Jobs();
        //searchedJob.Job1ToJob3();

    }

}
