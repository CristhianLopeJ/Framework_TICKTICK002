import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testTickTick {
    //TODO apply design patterns

    private WebDriver driver = null;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "");
        driver = new ChromeDriver();
        driver.get("https://ticktick.com/");
    }

    String listName = "Test001";
    String listNameUpdated = "Task To DO";

    // LOGIN PAGE
    String signInButton = "//div[@class='navRow_236y3 container']//a[normalize-space()='Sign In']";
    String idEmail = "//input[@id='emailOrPhone']";
    String idPassword = "//input[@id='password']";
    String buttonSignIn = "//button[@class='button__3eXSs '] ";
    //MainMenu
    String clickListIcon = "(//*[local-name()='svg'])[19]";
    String projectName = "//input[@id='edit-project-name']";
    String clickSaveButton = "//button[contains(text(),'Save')]";
    //EDIT PROJECT
    String editListCreated = "//p[contains(text(),'" + listName + "')]/following-sibling::div/child::div//*[local-name()='svg' and @class='icon-more-for-folder w-[18px] h-[18px] hover:text-sidebar-color text-sidebar-color-40 ']";
    String editList = "//a[contains(text(),'Edit')]//ancestor::li";
    String deleteList = "//a[contains(text(),'Delete')]//ancestor::li";


    @Test
    public void testing() throws InterruptedException {
        driver.findElement(By.xpath(signInButton)).click();
        driver.findElement(By.xpath(idEmail)).sendKeys("digitaltest71@gmail.com");
        driver.findElement(By.xpath(idPassword)).sendKeys("Password1!");
        driver.findElement(By.xpath(buttonSignIn)).click();
        Thread.sleep(9000);
        //MainMenu
        driver.findElement(By.xpath(clickListIcon)).click();
        driver.findElement(By.xpath(projectName)).sendKeys(listName);
        driver.findElement(By.xpath(clickSaveButton)).click();
        Thread.sleep(2000);
        //EDIT PROJECT
        driver.findElement(By.xpath(editListCreated)).click();
        driver.findElement(By.xpath(editList)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(projectName)).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath(projectName)).sendKeys(listNameUpdated);
        //driver.findElement(By.xpath("//div[@class='color inline-block h-[24px] w-[24px] rounded-[4px] relative cursor-pointer border border-solid border-[#D1D1D1] relative dark:border-white-20']")).click();
        //driver.findElement(By.xpath("//div[@style='background-color: rgb(115, 27, 99);']"));
        //driver.findElement(By.xpath("//div[@class='color inline-block h-[24px] w-[24px] rounded-[4px] relative cursor-pointer border border-solid border-[#D1D1D1] relative dark:border-white-20']")).click();
        driver.findElement(By.xpath(clickSaveButton)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(editListCreated)).click();
        driver.findElement(By.xpath(deleteList)).click();
        driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
        Thread.sleep(2000);

    }

}
