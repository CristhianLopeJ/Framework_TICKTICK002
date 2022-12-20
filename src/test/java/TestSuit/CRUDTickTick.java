package TestSuit;

import Page.EditListModal;
import Page.ListSection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CRUDTickTick extends TestBase {
    EditListModal editListModal = new EditListModal();
    ListSection listSection = new ListSection();

    @Test
    public void verifyCRUD() throws InterruptedException {
        String nameList = "Sprint 1 tasks";
        String updateListName = "Only 001";

        //List Creation
        mainPage.addList.click();
        editListModal.projectName.setText(nameList);
        editListModal.saveButton.click();
        Assertions.assertTrue(listSection.isListIsDisplayed(nameList),"Error not found");

        //Edit List
        listSection.clickList(nameList);
        editListModal.editListButton.click();
        editListModal.projectName.cleanSetText(updateListName);
        editListModal.saveButton.click();
        Assertions.assertTrue(listSection.isListIsDisplayed(updateListName),"Error List Not Updated");

        //Delete List
        listSection.clickList(updateListName);
        listSection.deleteListButton.click();
        listSection.confirmDeletion.click();
        Assertions.assertFalse(listSection.isListIsDisplayed(updateListName),"Error The List is not Deleted");
    }
}
