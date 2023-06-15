package seleniumE2E;

import io.qase.api.annotation.QaseTitle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCart_Checkout extends BaseTest{

    By searchField = By.xpath("//div[@id='entry_217822']//input[@aria-label='Search For Products']");
    By searchButton= By.xpath("//div[@id='search']//button[text()='Search']");


   // By SonyVAIO = By.xpath("//*[@id=\"image-gallery-216817\"]/div[1]/a/img");
    By SonyVAIO = By.xpath("//div[@id='entry_212469']//a[text()= 'Sony VAIO']");
    //By SonyVAIO = By.linkText("Sony VAIO");
    // SonyVAIO = By.id("entry_212469");
    //By addToCartButton = By.linkText("Add to Cart");
    By addToCartButton= By.xpath("//div[@id='entry_216842']//button['Add to Cart']");
    //By addToCartButton=By.id("entry_216842");


    By checkoutButton= By.xpath("//div[@id='notification-box-top']//a[contains(text(),'Checkout')]");

    @Test
    @QaseTitle("Add to Cart_Checkout")
    public void test4_AddToCart_Checkout() throws InterruptedException {

    type(searchField,"Sony VAIO");
    click(searchButton);
    click(SonyVAIO);
    click(addToCartButton);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButton));
    click(checkoutButton);

    }

    private WebElement find(By locator){

        //WebDriver driver = new SafariDriver();
        return driver.findElement(locator);

    }

    private void click( By locator){

        find (locator).click();
    }
    private void type(By locator, String text){

        find(locator).sendKeys(text);
}
}
