package tests.massageTest.DelateMassage;

import tests.TestBase;

public class PageDelateMassage extends TestBase {


    public void writeSendMassage() {
        app.messageHelper.writeMassage("DelateTest");
        app.messageHelper.sendMassageBtn();
    }

    public void writeSendMassages() {
        app.messageHelper.writeMassage("HiSelenium");
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

    public void checkName() {
        app.assertHelper.chесkText("//div[@class=\"TopNavBtn__profileName\"]", "Дима");
    }

    public void heckLastMassage() {
        app.assertHelper.checkLastText("//div[@class=\"im-mess--text wall_module _im_log_body\"]", "DelateTest");
    }

    public void heckDelate() {
        app.assertHelper.checkFalseText("//li[@aria-hidden=\"false\"][2]", "DelateTest");
    }

    public void clickMassge(){
        app.messageHelper.findeAndClick();

    }

    public void delateMassage() {
        app.messageHelper.clickElement("//button[@class=\"im-page-action _im_page_action im-page-action_delete\"]");
        app.messageHelper.clickElement("//button[@class=\"flat_button\"]");


    }
}

