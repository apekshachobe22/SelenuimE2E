package seleniumE2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LogOut extends BaseTest{
    By myAccountMenu = By.linkText("My account");
    By email = By.id("input-email");
    By password= By.id("input-password");
    By loginButton= By.xpath("//input[@type='submit'and@value='Login']");

    //By logout = By.xpath("//div[@id='widget-navbar-217834']//span[contains(text(),'Logout')]");
    By logout= By.linkText("Logout");

    @Test
    public void test3_LogOut() throws InterruptedException {
        click(myAccountMenu);
        type(email, "monicageller@gmail.com");
        type(password, "Shopping$123");
        Thread.sleep(1000);
        click(loginButton);

        Actions act = new Actions(driver);
        act.moveToElement(find(myAccountMenu)).perform();
    click(logout);
}
    private WebElement find(By locator){

        //WebDriver driver = new SafariDriver();
        return driver.findElement(locator);
    }

    private void click( By locator){

        find (locator).click();}
    private void type(By locator, String text){

        find(locator).sendKeys(text);}

}
