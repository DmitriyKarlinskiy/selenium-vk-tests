package tests;

import appmanager.AppManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {

    protected final AppManager app = new AppManager();

    @BeforeClass
    public void setUp() {
        app.init();
    }

    @AfterClass
    public void endTest() {
        app.stop();
    }

}
