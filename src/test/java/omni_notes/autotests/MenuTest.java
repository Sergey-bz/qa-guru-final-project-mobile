package omni_notes.autotests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Omni note")
public class MenuTest extends BaseTest {

    @Test
    @DisplayName("Check menu category")
    public void menuCategoryTest() {
        notePage
                .clickExpandMenuButton()
                .clickNoteButton()
                .setNoteTitle("Test note")
                .setNoteContent("Super test")
                .clickMenuCategoryButton()
                .clickAddCategory()
                .setCategoryTitle("Test category")
                .clickSaveButton()
                .clickBackButton();

        notePage
                .categoryMarkerShouldBeVisible()
                .clickDrawerButton()
                .countShouldBe(1);
    }
}
