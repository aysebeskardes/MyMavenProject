package technoStudyB7_Day1.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.get("https://demo.seleniumeasy.com/");
        System.out.println("the title is " + drive.getTitle());
        String expected = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actual = drive.getTitle();
        if (expected.equals(actual)) {
            System.out.println("passed");
            System.out.println(actual);
        } else {
            System.out.println("failed");
            System.out.println(actual);
        }

        Thread.sleep(3000);
        String teslaURL = "https://www.tesla.com/";
        drive.navigate().to(teslaURL);
        drive.manage().window().maximize();
        drive.close();
        drive.quit();
    }

}
