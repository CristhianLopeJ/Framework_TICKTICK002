package Page;

import Control.Button;
import Control.TextBox;
import org.openqa.selenium.By;

public class EditListModal {
    public TextBox projectName = new TextBox(By.xpath("//input[@id='edit-project-name']"));
    public Button editListButton = new Button(By.xpath("//a[contains(text(),'Edit')]//ancestor::li"));
    public TextBox saveButton = new TextBox(By.xpath("//button[contains(text(),'Save')]"));
}
