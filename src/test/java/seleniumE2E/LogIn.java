package seleniumE2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogIn extends BaseTest {
    By myAccountMenu = By.linkText("My account");
    By email = By.id("input-email");
    By password= By.id("input-password");
    By loginButton= By.xpath("//input[@type='submit'and@value='Login']");






    @Test
    public void test2_LogIn() throws InterruptedException {
        click(myAccountMenu);
        type(email, "monicageller@gmail.com");
        type(password, "Shopping$123");
        Thread.sleep(1000);
        click(loginButton);
    }

    private WebElement find(By locator){

        //WebDriver driver = new SafariDriver();
        return driver.findElement(locator);
    }
    private void click( By locator){

        find(locator).click();
    }
    private void type(By locator, String text){

        find(locator).sendKeys(text);
    }}






