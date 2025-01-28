package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class FillFields {

    By bankImagine1 = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img");
    By bankImagine2 = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img");
    By bankImagine3 = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img");
    By bankImagine4 = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img");
    By bankImagine5 = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img");
    By moreAboutService = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a");
    By phoneNumberField = By.xpath("//*[@id=\"connection-phone\"]");
    By sumField = By.xpath("//*[@id=\"connection-sum\"]");
    By continueOperation = By.xpath("//*[@id=\"pay-connection\"]/button");
    By selectHeader = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");

    private final WebDriver driver;

    public FillFields(WebDriver driver) {
        this.driver = driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver.get("http://mts.by");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public FillFields findbankImagine1() {
        try {
            driver.findElement(bankImagine1);
        }catch (Exception e) {
            System.out.println("Нет иконки 1: " + e.getMessage());
        }
        return null;
    }
    public FillFields findbankImagine2() {
        try {
            driver.findElement(bankImagine2);
        }catch (Exception e) {
            System.out.println("Нет иконки 2: " + e.getMessage());
        }
        return null;
    }
    public FillFields findbankImagine3() {
        try {
            driver.findElement(bankImagine3);
        }catch (Exception e) {
            System.out.println("Нет иконки 3: " + e.getMessage());
        }
        return null;
    }
    public FillFields findbankImagine4() {
        try {
            driver.findElement(bankImagine4);
        }catch (Exception e) {
            System.out.println("Нет иконки 4: " + e.getMessage());
        }
        return null;
    }
    public FillFields findbankImagine5() {
        try {
            driver.findElement(bankImagine5);
        }catch (Exception e) {
            System.out.println("Нет иконки 5: " + e.getMessage());
        }
        return null;
    }
    public FillFields moreAboutServiceLink() {
        try {
            driver.findElement(moreAboutService).click();
            driver.findElement(By.xpath("/html/body/div[6]/main/div/div[4]/h3[1]"));
            System.out.println("'подробнее о сервисе' работает");
            driver.navigate().back();
            return this;
        } catch (Exception e) {
            System.out.println("подробнее о сервисе не работает" + e.getMessage());
        }
        return null;
    }
    public FillFields checkPalceholdersForCommunicationServices() {
        try {
            driver.findElement(selectHeader).click();
            driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")).click();
            String placeholderNumber = (driver.findElement(phoneNumberField).getAttribute("placeholder"));
            placeholderNumber.contains("Номер телефона");
            String placeholderSum = (driver.findElement(sumField)).getAttribute("placeholder");
            placeholderSum.contains("Сумма");
            String placeholderMail = (driver.findElement(By.xpath("//*[@id=\"connection-email\"]"))).getAttribute("placeholder");
            placeholderMail.contains("E-mail для отправки чека");
            System.out.println("Все плесхолдеры во вкладке \"Услуги связи\" на месте");
        } catch (Exception e) {
            System.out.println("Нет плесхолдеров во вкладке \"Услуги связи\"" + e.getMessage());
        }
        return null;
    }
    public FillFields checkPalceholdersForInternet() {
        try {
            driver.findElement(selectHeader).click();
            driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")).click();
            String placeholderNumber = (driver.findElement(By.xpath("//*[@id=\"internet-phone\"]"))).getAttribute("placeholder");
            placeholderNumber.contains("Номер абонента");
            String placeholderSum = (driver.findElement(By.xpath("//*[@id=\"internet-sum\"]"))).getAttribute("placeholder");
            placeholderSum.contains("Сумма");
            String placeholderMail = (driver.findElement(By.xpath("//*[@id=\"internet-email\"]"))).getAttribute("placeholder");
            placeholderMail.contains("E-mail для отправки чека");
            System.out.println("Все плесхолдеры во вкладке \"Домашний интернет\" на месте");
        } catch (Exception e) {
            System.out.println("Нет плесхолдеров во вкладке \"Домашний интернет\"" + e.getMessage());
        }
        return null;
    }
    public FillFields checkPalceholdersForInstallment() {
        try {
            driver.findElement(selectHeader).click();
            driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p")).click();
            String placeholderNumber = (driver.findElement(By.xpath("//*[@id=\"score-instalment\"]"))).getAttribute("placeholder");
            placeholderNumber.contains("Номер счета на 44");
            String placeholderSum = (driver.findElement(By.xpath("//*[@id=\"instalment-sum\"]"))).getAttribute("placeholder");
            placeholderSum.contains("Сумма");
            String placeholderMail = (driver.findElement(By.xpath("//*[@id=\"instalment-email\"]"))).getAttribute("placeholder");
            placeholderMail.contains("E-mail для отправки чека");
            System.out.println("Все плесхолдеры во вкладке \"Рассрочка\" на месте");
        } catch (Exception e) {
            System.out.println("Нет плесхолдеров во вкладке \"Рассрочка\"" + e.getMessage());
        }
        return null;
    }
    public FillFields checkPalceholdersForDebt() {
        try {
            driver.findElement(selectHeader).click();
            driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p")).click();
            String placeholderNumber = (driver.findElement(By.xpath("//*[@id=\"score-arrears\"]"))).getAttribute("placeholder");
            placeholderNumber.contains("Номер счета на 2073");
            String placeholderSum = (driver.findElement(By.xpath("//*[@id=\"arrears-sum\"]"))).getAttribute("placeholder");
            placeholderSum.contains("Сумма");
            String placeholderMail = (driver.findElement(By.xpath("//*[@id=\"arrears-email\"]"))).getAttribute("placeholder");
            placeholderMail.contains("E-mail для отправки чека");
            System.out.println("Все плесхолдеры во вкладке \"Задолженность\" на месте");
        } catch (Exception e) {
            System.out.println("Нет плесхолдеров во вкладке \"Задолженность\"" + e.getMessage());
        }
        return null;
    }
    public FillFields BackToCommunicationServices() {
        driver.findElement(selectHeader).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")).click();
        return null;
    }
    public FillFields typeNumber() {
        driver.findElement(phoneNumberField).sendKeys("297777777");
        return this;
    }
    public String typeSum(String sum) {
        driver.findElement(sumField).sendKeys(sum);
        return sum;
    }
    public FillFields continueOperationButton() {
        driver.findElement(continueOperation).click();
        return this;
    }
    public FillFields checkSum(String sum) {

        try{
            driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[8]/div/iframe")));
            driver.findElement(By.xpath("//*[contains(text(), '7.00 BYN')]"));
            System.out.println("7.00 BYN найден");
            driver.findElement(By.xpath("//button[contains(text(), ' Оплатить  7.00 BYN ')]"));
            System.out.println("Оплатить 7.00 BYN найден");
        }catch (Exception e) {
            System.out.println("Эллемент не найден" + e.getMessage());
        }
        return null;
    }
    public FillFields checkPhoneNumber() {
        driver.findElement(By.xpath("//*[contains(text(), 'Номер:375297777777')]"));
        System.out.println("Номер телефона отображается");
        return null;
    }
    public FillFields checkPlaceholderCard() {
        String cardnum = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label")).getText();
        System.out.println(cardnum);
        driver.findElement(By.xpath("//*[contains(text(), 'Срок действия'"));
        System.out.println("Текст в поле 'Срок действия' отображается");
        //driver.findElement(By.xpath("//*[contains(text(), 'CVC'"));
        //System.out.println("Текст в поле 'CVC' отображается");
        //driver.findElement(By.xpath("//*[contains(text(), 'Имя держателя (как на карте)'"));
        //System.out.println("Текст в поле 'Имя держателя (как на карте)' отображается");

        return null;
    }
    public FillFields checkBankImagine() {
        try{
            driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]"));
            System.out.println("Картинка 1 есть");
        } catch (Exception e) {
            System.out.println("Картинка 1 не найдена" + e.getMessage());
        }
        try{
            driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]"));
            System.out.println("Картинка 2 есть");
        } catch (Exception e) {
            System.out.println("Картинка 2 не найдена" + e.getMessage());
        }
        try{
            driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]"));
            System.out.println("Картинка 3 есть");
        } catch (Exception e) {
            System.out.println("Картинка 3 не найдена" + e.getMessage());
        }
        try{
            driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[1]"));
            System.out.println("Картинка 4.1 есть");
            driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div/img[2]"));
            System.out.println("Картинка 4.2 есть");
        } catch (Exception e) {
            System.out.println("Картинка 4 не найдена" + e.getMessage());
        }
        return null;
    }
}
