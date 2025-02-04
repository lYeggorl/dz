import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class WebSiteTest {
    String phoneNumber = "297777777";
    String sum = "7";
    By cookieClose = By.xpath("//button[@class=\"btn btn_gray cookie__cancel\"]");
    By blockName = By.xpath("//div[@class='pay__wrapper']//h2");

    By bankImagineVisa = By.xpath("//img[@alt=\"Visa\"]");
    By bankImagineVerifiedByVisa = By.xpath("//img[@alt=\"Verified By Visa\"]");
    By bankImagineMasterCard = By.xpath("//img[@alt=\"MasterCard\"]");
    By bankImagineMasterCardSecureCode = By.xpath("//img[@alt=\"MasterCard Secure Code\"]");
    By bankImagineBelcard = By.xpath("//section//div//img[@alt=\"Белкарт\"]");

    By checkNumberOfBankElements = By.xpath("//div[@class=\"pay__partners\"]//ul//li");
    By moreAboutService = By.xpath("//div[@class='pay__wrapper']//a");
    By checkmoreAboutServiceByTextInIt = By.xpath("//div[@class=\"container-fluid\"]//h3");

    By phoneNumberField = By.xpath("//input[@id=\"connection-phone\"]");
    By sumField = By.xpath("//*[@id=\"connection-sum\"]");
    By continueOperation = By.xpath("//button[@class=\"button button__default \"]");

    By selectWrapper = By.xpath("//div[@class=\"select__wrapper\"]");
    By switchToConnectionPhone = By.xpath("//p[text()='Услуги связи']");
    By placeHolderPhoneNumberConnectionPhone = By.xpath("//input[@placeholder='Номер телефона' and @id='connection-phone']");
    By placeHolderSumConnectionPhone = By.xpath("//input[@placeholder='Сумма' and @id='connection-sum']");
    By placeHolderEmailConnectionPhone = By.xpath("//input[@placeholder='E-mail для отправки чека' and @id='connection-email']");
    By switchToInternetPhone = By.xpath("//p[text()='Домашний интернет']");
    By placeHolderPhoneNumberInternetPhone = By.xpath("//input[@placeholder='Номер абонента' and @id='internet-phone']");
    By placeHolderSumInternetPhone = By.xpath("//input[@placeholder='Сумма' and @id='internet-sum']");
    By placeHolderEmailInternetPhone = By.xpath("//input[@placeholder='E-mail для отправки чека' and @id='internet-email']");
    By switchToScoreInstalment = By.xpath("//p[text()='Рассрочка']");
    By placeHolderNumScoreInstalment = By.xpath("//input[@placeholder='Номер счета на 44' and @id='score-instalment']");
    By placeHolderSumScoreInstalment = By.xpath("//input[@placeholder='Сумма' and @id='instalment-sum']");
    By placeHolderEmailScoreInstalment = By.xpath("//input[@placeholder='E-mail для отправки чека' and @id='instalment-email']");
    By switchToScoreArrears = By.xpath("//p[text()='Задолженность']");
    By placeHolderNumScoreArrears = By.xpath("//input[@placeholder='Номер счета на 2073' and @id='score-arrears']");
    By placeHolderSumScoreArrears = By.xpath("//input[@placeholder='Сумма' and @id='arrears-sum']");
    By placeHolderEmailScoreArrears = By.xpath("//input[@placeholder='E-mail для отправки чека' and @id='arrears-email']");

    By frameXpath = By.xpath("//iframe[@class=\"bepaid-iframe\"]");
    By frameCheckSum = By.xpath("//div[@class=\"pay-description__cost\"]/span[text()]");
    By frameCheckSumOnButton = By.xpath("//button[@class=\"colored disabled\" and text()]");
    By frameCheckCardNumText = By.xpath("//label[@class=\"ng-tns-c46-1 ng-star-inserted\" and text()]");
    By frameCheckCardDateText = By.xpath("//label[@class=\"ng-tns-c46-4 ng-star-inserted\" and text()]");
    By frameCheckCardCVCText = By.xpath("//label[@class=\"ng-tns-c46-5 ng-star-inserted\" and text()]");
    By frameCheckNameOnCardText = By.xpath("//label[@class=\"ng-tns-c46-3 ng-star-inserted\" and text()]");

    By frameCheckImagineVisa = By.xpath("//img[@src=\"assets/images/payment-icons/card-types/visa-system.svg\"]");
    By frameCheckImagineMasterCard = By.xpath("//img[@src=\"assets/images/payment-icons/card-types/mastercard-system.svg\"]");
    By frameCheckImagineBelcard = By.xpath("//img[@src=\"assets/images/payment-icons/card-types/belkart-system.svg\"]");
    By frameCheckImagineMaestro = By.xpath("//img[@src=\"assets/images/payment-icons/card-types/maestro-system.svg\"]");
    By frameCheckImagineMir = By.xpath("//img[@src=\"assets/images/payment-icons/card-types/mir-system.svg\"]");

    By phoneNumberInFrame = By.xpath("//div[@class=\"pay-description__text\"]/span[text()]");

    private WebDriverWait wait;

    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://mts.by");
        driver.findElement(cookieClose).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    @Description("Проверка названия блока")
    @Severity(SeverityLevel.NORMAL)
    public void testBlockName(){
        String BlockNameIn = driver.findElement(blockName).getText();
        String expectedResult = "Онлайн пополнение\n" +
                "без комиссии";
        Assert.assertEquals(BlockNameIn, expectedResult);
    }

    @Test(priority = 2)
    @Description("Проверка изображений банков")
    @Severity(SeverityLevel.NORMAL)
    public void testBankImgs() {
        driver.findElement(bankImagineVisa);
        driver.findElement(bankImagineVerifiedByVisa);
        driver.findElement(bankImagineMasterCard);
        driver.findElement(bankImagineMasterCardSecureCode);
        driver.findElement(bankImagineBelcard);
        List<WebElement> childElements = driver.findElements(checkNumberOfBankElements);
        int childElementsCount = childElements.size();
        int expectedCount = 5;

        Assert.assertEquals(childElementsCount, expectedCount);
    }

    @Test(priority = 3)
    @Description("Проверка ссылки 'Подробнее о сервисе'")
    @Severity(SeverityLevel.NORMAL)
    public void testMoreAboutService() {
        String checkLinkName = driver.findElement(moreAboutService).getText();
        String expectedText = "Подробнее о сервисе";
        Assert.assertEquals(checkLinkName, expectedText);
        driver.findElement(moreAboutService).click();
        String Text = driver.findElement(checkmoreAboutServiceByTextInIt).getText();
        String expectedResult = "Оплата банковской картой";
        Assert.assertEquals(Text, expectedResult);
        driver.navigate().back();
    }

    @Test(priority = 4)
    @Description("Проверка плейсхолдеров для услуг связи")
    @Severity(SeverityLevel.NORMAL)
    public void testPlaceHoldersConnectionPhone(){
        driver.findElement(selectWrapper).click();
        driver.findElement(switchToConnectionPhone).click();
        driver.findElement(placeHolderPhoneNumberConnectionPhone);
        driver.findElement(placeHolderSumConnectionPhone);
        driver.findElement(placeHolderEmailConnectionPhone);
    }

    @Test(priority = 5)
    @Description("Проверка плейсхолдеров для домашнего интернета")
    @Severity(SeverityLevel.NORMAL)
    public void testPlaceHoldersInternetPhone(){
        driver.findElement(selectWrapper).click();
        driver.findElement(switchToInternetPhone).click();
        driver.findElement(placeHolderPhoneNumberInternetPhone);
        driver.findElement(placeHolderSumInternetPhone);
        driver.findElement(placeHolderEmailInternetPhone);
    }

    @Test(priority = 6)
    @Description("Проверка плейсхолдеров для рассрочки")
    @Severity(SeverityLevel.NORMAL)
    public void testPlaceHoldersScoreInstalment(){
        driver.findElement(selectWrapper).click();
        driver.findElement(switchToScoreInstalment).click();
        driver.findElement(placeHolderNumScoreInstalment);
        driver.findElement(placeHolderSumScoreInstalment);
        driver.findElement(placeHolderEmailScoreInstalment);
    }

    @Test(priority = 7)
    @Description("Проверка плейсхолдеров для Задолженности")
    @Severity(SeverityLevel.NORMAL)
    public void testPlaceHoldersScoreArrears(){
        driver.findElement(selectWrapper).click();
        driver.findElement(switchToScoreArrears).click();
        driver.findElement(placeHolderNumScoreArrears);
        driver.findElement(placeHolderSumScoreArrears);
        driver.findElement(placeHolderEmailScoreArrears);
    }

    @Test(priority = 8)
    @Description("Заполнение полей для перехода в новый фрейм")
    @Severity(SeverityLevel.NORMAL)
    public void testPayWrapper(){
        driver.findElement(selectWrapper).click();
        driver.findElement(switchToConnectionPhone).click();
        WebElement phoneIn = driver.findElement(phoneNumberField);
        phoneIn.sendKeys(phoneNumber);
        var sumIn = driver.findElement(sumField);
        sumIn.sendKeys(sum);
        driver.findElement(continueOperation).click();
    }

    @Test(priority = 9)
    @Description("Проверка текста в строках заполнения карты")
    @Severity(SeverityLevel.NORMAL)
    public void testFieldsInFrame() {
        driver.switchTo().frame(driver.findElement(frameXpath));
        String cardNumText = driver.findElement(frameCheckCardNumText).getText();
        Assert.assertEquals(cardNumText, "Номер карты");
        String cardDateText = driver.findElement(frameCheckCardDateText).getText();
        Assert.assertEquals(cardDateText, "Срок действия");
        String cardCVCText = driver.findElement(frameCheckCardCVCText).getText();
        Assert.assertEquals(cardCVCText, "CVC");
        String nameOnCardText = driver.findElement(frameCheckNameOnCardText).getText();
        Assert.assertEquals(nameOnCardText, "Имя держателя (как на карте)");
    }

    @Test(priority = 10)
    @Description("Проверка корректрности суммы в шапке фрейма")
    @Severity(SeverityLevel.NORMAL)
    @Attachment
    public void testSumInFrame() {
        if (driver.findElement(frameCheckSum) != null) {
            String stringSum = driver.findElement(frameCheckSum).getText();
            Assert.assertEquals(stringSum, sum + ".00 BYN");
        }
    }

    @Test(priority = 11)
    @Description("Проверка корректрности суммы в кнопке фрейма")
    @Severity(SeverityLevel.NORMAL)
    public void testSumInButton() {
        String stringButtonSum = driver.findElement(frameCheckSumOnButton).getText();
        Assert.assertEquals(stringButtonSum,  "Оплатить " + sum + ".00 BYN");
    }

    @Test(priority = 12)
    @Description("Проверка иконок банков во фрейме")
    @Severity(SeverityLevel.NORMAL)
    @Step
    public void testBankImgsInFrame() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(frameCheckImagineVisa);
        driver.findElement(frameCheckImagineMasterCard);
        driver.findElement(frameCheckImagineBelcard);
        wait.until(ExpectedConditions.visibilityOfElementLocated(frameCheckImagineMaestro));
        driver.findElement(frameCheckImagineMaestro);
        while (true) {
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(frameCheckImagineMir)));
            boolean isElementPresent = isElementExists(driver, frameCheckImagineMir);
            if (isElementPresent) {
                break;
            }
        }
    }

    @Test(priority = 13)
    @Description("Проверка корректрности номера телефона во фрейме")
    @Severity(SeverityLevel.NORMAL)
    public void testPhoneNumberInFrame() {
        String stringWithPhoneNumber = driver.findElement(phoneNumberInFrame).getText();
        Assert.assertEquals(stringWithPhoneNumber,  "Оплата: Услуги связи Номер:375" + phoneNumber);
    }

    private static boolean isElementExists(WebDriver driver, By xpath) {
        try {
            WebElement element = driver.findElement(xpath);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

