package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class MessageHelper {
    ChromeDriver wd;
    public MessageHelper(ChromeDriver wd) {
        this.wd = wd;
    }

    //методы отправки личного сообщения
    public void writeMassage(String masage) {
        WebElement sendFide = wd.findElement(By.xpath("//div[@id=\"im_editable0\"]"));
        sendFide.sendKeys(masage);
    }

    //Найти переписку по пользователю (новые сообщения)
    public void findeUserInMassage(String bodyName) {
        String userName = bodyName;
        WebElement findBody = wd.findElement(By.xpath("//span[@class=\"_im_dialog_link\"][text()='" + userName + "']"));
        findBody.click();
    }

    //Нажать на категорию месенджер
    public void gotoMassage() {
        WebElement messCategory = wd.findElement(By.id("l_msg"));
        messCategory.click();
    }

    //Нажать кнопку отправить
    public void sendMassageBtn() {
        WebElement sendBtn = wd.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div[2]/div[4]/div[2]/div[4]/div[1]/button"));
        sendBtn.click();
    }

    //Найти переписку с пользователем
    public void findeDialog(String dialog) {
        WebElement searchFild = wd.findElement(By.xpath("//input[@id=\"im_dialogs_search\"]"));
        searchFild.sendKeys(dialog);
    }

    //Найти элемент на странние по названию
    public void findeElemnt (String nameElement) {
        String name = nameElement;
        WebElement DomNameElement = wd.findElement(By.xpath("//*[text()=\'" + name + "']"));
    }
    //Найти и нажать
    public void findeAndClick () {
//        String nameClick = nameElement;
        wd.findElement(By.xpath("//li[@aria-hidden=\"false\"]")).click();
        System.out.println();

    }

    //Наайти все элементы на странице по названию
    public void findeElemnts (String nameElements) {
        String names = nameElements;
        WebElement DomNameElements = wd.findElement(By.xpath("//*[text()=" + names + "']"));
    }

    //Клик
    public void clickElement (String xpaths){
         wd.findElementByXPath(xpaths).click();
    }

    public void checkLastText(String xpath, String actualText) {
        String myXselector = xpath;
        String expectText = wd.findElement(By.xpath(myXselector + "[last()]")).getText();
        Assert.assertEquals(expectText, actualText);
    }
}
