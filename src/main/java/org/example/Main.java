package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://mts.by");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();

        try {
            driver.findElement(By.xpath("//*[contains(text(), 'Онлайн пополнение')]")); // Онлайн пополнение без комиссии задание 1
            System.out.println("Надпись : 'Онлайн пополнение без комиссии' на месте");
        } catch (Exception e) {
            System.out.println("Нет надписи : Онлайн пополнение без комиссии" + e.getMessage());
        }
        try {
            FillFields fillFields = new FillFields(driver);
            fillFields.findbankImagine1();
            fillFields.findbankImagine2();
            fillFields.findbankImagine3();
            fillFields.findbankImagine4();
            fillFields.findbankImagine5();
            fillFields.moreAboutServiceLink();
            fillFields.checkPalceholdersForCommunicationServices();
            fillFields.checkPalceholdersForInternet();
            fillFields.checkPalceholdersForInstallment();
            fillFields.checkPalceholdersForDebt();
            fillFields.BackToCommunicationServices();
            fillFields.typeNumber();
            String suma = fillFields.typeSum("7");
            fillFields.continueOperationButton();
            fillFields.checkSum(suma);
            fillFields.checkPhoneNumber();
            //fillFields.checkPlaceholderCard();
            fillFields.checkBankImagine();

            System.out.println("Всё вообще отлично");
        } catch (Exception e) {
            System.out.println("Что-то не работает" + e.getMessage());
        } finally {
            //    driver.quit();
        }
    }
}
