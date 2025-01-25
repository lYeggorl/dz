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

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();

        try {
            try {
                driver.findElement(By.xpath("//*[contains(text(), 'Онлайн пополнение')]")); // Онлайн пополнение без комиссии задание 1
                System.out.println("Надпись : 'Онлайн пополнение без комиссии' на месте");
            } catch (Exception e) {
                System.out.println("Нет надписи : Онлайн пополнение без комиссии" + e.getMessage());
            }
            try { // проверка наличия иконки банка 1. задание 2
                driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
            } catch (Exception e) {
                System.out.println("Нет иконки 1: " + e.getMessage());
            }
            try { // проверка наличия иконки банка 2. задание 2
                driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img"));
            } catch (Exception e) {
                System.out.println("Нет иконки 2: " + e.getMessage());
            }
            try { // проверка наличия иконки банка 3. задание 2
                driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
            } catch (Exception e) {
                System.out.println("Нет иконки 3: " + e.getMessage());
            }
            try { // проверка наличия иконки банка 4. задание 2
                driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
            } catch (Exception e) {
                System.out.println("Нет иконки 4: " + e.getMessage());
            }
            try { // проверка наличия иконки банка 5. задание 2
                driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
            } catch (Exception e) {
                System.out.println("Нет иконки 5: " + e.getMessage());
            }
        } catch (Exception e) {
        } finally {
            System.out.println("Все иконки присутствуют");
        }
        try { //"подробнее о сервисе" задание 3
            driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")).click();

            driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/h3[1]"));
            System.out.println("'подробнее о сервисе' работает");

            driver.navigate().back(); //загружается долго
        } catch (Exception e) {
            System.out.println("подробнее о сервисе не работает" + e.getMessage());
        }
        try {
            driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys("297777777");

            driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).sendKeys("7");

            driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();

            System.out.println("Всё вообще отлично");
        } catch (Exception e) {
            System.out.println("Не работает" + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
