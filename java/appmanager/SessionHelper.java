package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper {
    ChromeDriver wd;
    public SessionHelper(ChromeDriver wd) {
        this.wd = wd;
    }
    public void login(String email, String password) {
        WebElement emailFilde = wd.findElement(By.id("index_email"));
        emailFilde.sendKeys(email);
        WebElement passwordlFilde = wd.findElement(By.id("index_pass"));
        passwordlFilde.sendKeys(password);
        WebElement loginButton = wd.findElement(By.id("index_login_button"));
        loginButton.click();
    }

    public void logout() {
        WebElement hiderMenu = wd.findElement(By.xpath("//a[@id=\"top_profile_link\"]"));
        hiderMenu.click();
        WebElement exit = wd.findElement(By.xpath("//a[@class=\"top_profile_mrow\"][3]"));
        exit.click();
    }
}
