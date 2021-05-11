package tests.massageTest.WriteMassage;

import tests.TestBase;

public class PagePrivateMassage extends TestBase {


    public void writeSendMassage() {
        app.messageHelper.writeMassage("Hi Selenium!");

        //Нажать на кнопку отправить
        app.messageHelper.sendMassageBtn();
    }

    public void goToUserDialog() {
        app.messageHelper.findeUserInMassage("Default User");
    }

    public void findeUser() {
        app.messageHelper.findeDialog("Default User");
    }

    public void goToMassanger() {
        app.messageHelper.gotoMassage();
    }

    public void checkIdAdres() {
        app.assertHelper.checkUrl("https://vk.com/");
    }
    public void checkName(){
        app.assertHelper.chесkText("//div[@class=\"TopNavBtn__profileName\"]","Дима");
    }
    public void heckLastMassage(){
        app.assertHelper.checkLastText("//div[@class=\"im-mess--text wall_module _im_log_body\"]", "Hi Selenium!");
    }
}

