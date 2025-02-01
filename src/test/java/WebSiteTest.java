import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    By selectHeader = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");

    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://mts.by");
        driver.findElement(cookieClose).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testBlockName(){
        String BlockNameIn = driver.findElement(blockName).getText();
        System.out.println(BlockNameIn);
        String expectedResult = "Онлайн пополнение\n" +
                "без комиссии";
        Assert.assertEquals(BlockNameIn, expectedResult);
    }

    @Test
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

    @Test
    public void testmoreAboutService() {
        String checkLinkName = driver.findElement(moreAboutService).getText();
        String expectedText = "Подробнее о сервисе";
        Assert.assertEquals(checkLinkName, expectedText);
        driver.findElement(moreAboutService).click();
        String Text = driver.findElement(checkmoreAboutServiceByTextInIt).getText();
        String expectedResult = "Оплата банковской картой";
        Assert.assertEquals(Text, expectedResult);
        driver.navigate().back();
    }

    @Test
    public void testPayWrapper(){
        WebElement phoneIn = driver.findElement(phoneNumberField);
        phoneIn.sendKeys(phoneNumber);

        var sumIn = driver.findElement(sumField);
        sumIn.sendKeys(sum);

        driver.findElement(continueOperation).click();
    }
}

