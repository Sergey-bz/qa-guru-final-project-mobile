package omni_notes.autotests;

import io.qameta.allure.Feature;
import omni_notes.autotests.pages.MenuPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Omni note")
public class NoteTest extends BaseTest {

    private final MenuPage menuPage = new MenuPage();

    @Test
    @DisplayName("Check empty list")
    public void emptyListTest() {
        notePage
                .emptyListShouldBeVisible();
    }

    @Test
    @DisplayName("Check title")
    public void titleTest() {
        menuPage
                .clickDrawerButton();

        menuPage
                .navDrawerTitleEqualTo("Omni Notes Alpha");
    }

    @Test
    @DisplayName("Check create note")
    public void createNoteTest() {
        var title = "Test note";
        var content = "Super test";

        notePage
                .clickExpandMenuButton()
                .clickNoteButton()
                .setNoteTitle(title)
                .setNoteContent(content)
                .clickBackButton();

        notePage
                .noteTitleEqualTo(title)
                .noteContentEqualTo(content);
    }
}
