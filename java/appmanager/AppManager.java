package appmanager;

import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class AppManager {
    ChromeDriver wd;
    public MessageHelper messageHelper;
    private SessionHelper sessionHelper;
    public AssertHelper assertHelper;


    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        assertHelper = new AssertHelper(wd);
        messageHelper = new MessageHelper(wd);
        sessionHelper = new SessionHelper(wd);

        wd.manage().window().maximize();

        wd.get("https://vk.com");
        sessionHelper.login("8916786786786", "***********");
    }

    public void stop() {
        sessionHelper.logout();
        wd.quit();
    }
}
