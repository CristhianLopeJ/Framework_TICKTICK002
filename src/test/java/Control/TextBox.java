package Control;

import org.openqa.selenium.By;

public class TextBox extends Control {
    public TextBox(By locator) {
        super(locator);
    }

    /**
     * @param value Set a text in the parameter
     */
    public void setText(String value) {
        this.find();
        this.control.sendKeys(value);
    }

    /**
     * @param value clean and set text in the field
     */
    public void cleanSetText(String value) {
        this.find();
        this.control.clear();
        this.control.sendKeys(value);
        System.out.println("test");
    }
}
