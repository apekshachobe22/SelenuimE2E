package seleniumE2E;

import io.qase.api.annotation.QaseTitle;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class CreateNewProfileTest extends BaseTest {
    By myAccountMenu = By.linkText("My account");
    //By myAccountMenu= By.xpath("//div[@id='widget-navbar-217834']span[contains(text(),'My account')]");
    By continueButton= By.xpath("//div[@id='content']//a[text()='Continue']");
    //By continueButton=By.xpath("//*[@id='content']/div/div[1]/div/div/a");

    // new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("XPath for Element 1"))).click();


    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone= By.id("input-telephone");
    By password= By.id("input-password");
    By confirmPassword= By.id("input-confirm");

    By agreeCheckbox = By.xpath("//label[@for='input-agree']");
    By continueRegistrationButton= By.xpath("//input[@type='submit' and @value='Continue']");



    @Test
    @QaseTitle("CreateNewProfile")
    public void test1_CreateNewProfile() throws InterruptedException {

        //driver.findElement(By.xpath("//div[@id='widget-navbar-217834']span[contains(text(),'My account')]")).click();
        click(myAccountMenu);
        click(continueButton);
        type(firstName,"Monica");
        type(lastName,"Geller");
        type(email,generateRandomEmail());
        type(telephone,"764372040");
        type(password,"Shopping$123");
        type(confirmPassword,"Shopping$123");
        Thread.sleep(1000);
        click(agreeCheckbox);
        click(continueRegistrationButton);

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

    private String generateRandomEmail(){
        return RandomStringUtils.random(
                4,true,true) + "@gmail.com";
    }
}
