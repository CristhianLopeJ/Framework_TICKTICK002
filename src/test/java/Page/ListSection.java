package Page;

import Control.Button;
import Control.Label;
import org.openqa.selenium.By;


public class ListSection {
    public Button deleteListButton = new Button(By.xpath("//a[contains(text(),'Delete')]//ancestor::li"));
    public Button confirmDeletion = new Button(By.xpath("//button[contains(text(),'Delete')]"));

    /**
     * @param listName This method make a click in the list created
     */
    public void clickList(String listName) {
        new Label(By.xpath("//p[contains(text(),'" + listName + "')]/following-sibling::div/child::div//*[local-name()='svg' and @class='icon-more-for-folder w-[18px] h-[18px] hover:text-sidebar-color text-sidebar-color-40 ']")).click();
    }

    public boolean isListIsDisplayed(String nameList) {
        Label listCreated = new Label(By.xpath("//p[contains(text(),'" + nameList + "')]//ancestor::button"));
        return listCreated.isControlDisplayed();
    }
}
