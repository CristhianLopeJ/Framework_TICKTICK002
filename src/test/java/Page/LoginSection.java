package Page;

import Control.Button;
import Control.Label;
import Control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public Button loginButton = new Button(By.xpath("//div[@class='navRow_236y3 container']//a[normalize-space()='Sign In']"));
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@id='emailOrPhone']"));
    public TextBox passwordTxtBox = new TextBox(By.xpath("//input[@id='password']"));
    public Button loginButtonClick = new Button(By.xpath("//button[@class='button__3eXSs ']"));

}
