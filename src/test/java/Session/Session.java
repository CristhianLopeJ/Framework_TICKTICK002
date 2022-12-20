package Session;

import Browser.FactoryBrowser;
import Utils.GetProperties;
import org.openqa.selenium.WebDriver;

public class Session {
    private static Session instance = null;
    private WebDriver browser;

    private Session() {
        browser = FactoryBrowser.make(GetProperties.getInstance().getBrowser()).create();
    }

    public static Session getInstance() {
        if (instance == null)
            instance = new Session();
        return instance;
    }

    public void closeSession() {
        browser.quit();
        instance = null;
    }

    public WebDriver getBrowser() {
        return browser;
    }
}
