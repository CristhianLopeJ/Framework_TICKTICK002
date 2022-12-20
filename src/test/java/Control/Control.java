package Control;

import Session.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void find() {
        control = Session.getInstance().getBrowser().findElement(this.locator);
    }

    public void click() {
        this.find();
        control.click();
    }

    public boolean isControlDisplayed() {
        try {
            this.find();
            return control.isDisplayed();

        } catch (Exception e) {
            return false;
        }
    }

    public String getText() {
        this.find();
        return this.control.getText();
    }

    /**
     * Wait control is not in the page
     */
    public void waitControlIsNotInThePage() {
        WebDriverWait explicitWait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(this.locator)));
    }

    /**
     * Wait control is in the page
     */
    public void waitControlIsInThePage() {
        WebDriverWait explicitWait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(this.locator));
    }

    /**
     * wait control clickeable page
     */
    public void waitControlIsClickablePage() {
        WebDriverWait explicitWait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.elementToBeClickable(this.locator));
    }
}
