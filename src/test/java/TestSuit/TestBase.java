package TestSuit;

import Page.LoginSection;
import Page.MainPage;
import Session.Session;
import Utils.GetProperties;
import com.sun.tools.javac.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
        loginSection.loginButton.click();
        loginSection.emailTxtBox.isControlDisplayed();
        loginSection.emailTxtBox.setText(GetProperties.getInstance().getEmail());
        loginSection.passwordTxtBox.setText(GetProperties.getInstance().getPwd());
        loginSection.loginButtonClick.click();
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }

}
