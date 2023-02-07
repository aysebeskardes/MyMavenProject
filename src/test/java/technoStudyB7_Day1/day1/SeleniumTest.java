package technoStudyB7_Day1.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //to set the chrome driver
        WebDriverManager.chromedriver().setup();
        //opening the browser
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com");
        System.out.println("title of goggle.com =" + driver.getTitle());
        System.out.println("url of google.com " + driver.getCurrentUrl());
        driver.navigate().to("https://techno.study/");
        String expected = "Join the best coding bootcamps online and get IT training in the US";
        String actual = driver.getTitle();
        if (expected.equals(actual)) {
            System.out.println("verification is done : PASS ");

        } else {
            System.out.println("Verification failed");
            System.out.println("actual :" + actual);
        }
    }
}