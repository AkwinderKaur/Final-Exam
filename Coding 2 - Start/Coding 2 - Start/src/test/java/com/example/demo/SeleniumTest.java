package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // setup Webdriver and open a Chrome browser at localhost:8080/animal

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //find the fields we want by id and fill them in
        // animal: dog
        // adjective: funny




        // close the browser after 5 seconds
        Thread.sleep(5000);
        driver.quit();



    }
}