package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class AssertHelper {
    ChromeDriver wd;


    public AssertHelper(ChromeDriver wd) {
        this.wd = wd;
    }

    public void checkUrl(String url) {
        Assert.assertEquals(wd.getCurrentUrl(), url);
    }

    public void chесkText(String xpath, String actualText) {
        String mySelector = xpath;
        String expectText = wd.findElement(By.xpath(mySelector)).getText();
        Assert.assertEquals(expectText, actualText);
    }

    public void checkLastText(String xpath, String actualText) {
        String myXselector = xpath;
        String expectText = wd.findElement(By.xpath(myXselector + "[last()]")).getText();
        Assert.assertEquals(expectText, actualText);
    }

    public void checkFalseText(String xpath, String unexpect) {
        String myXselector = xpath;
        String expectText = wd.findElement(By.xpath(myXselector)).getText();
        String myType = unexpect;
        Assert.assertFalse((expectText.equals(myType)), "expectText = " + expectText + " unexpect = " + unexpect);
    }
}
