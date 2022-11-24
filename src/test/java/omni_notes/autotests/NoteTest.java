package omni_notes.autotests;

import io.qameta.allure.Feature;
import omni_notes.autotests.pages.NotesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Omni note")
public class NoteTest extends BaseTest {

    private final NotesPage notesPage = new NotesPage();

    @BeforeEach
    void skip() {
        notesPage
                .clickNextButton()
                .clickNextButton()
                .clickNextButton()
                .clickNextButton()
                .clickNextButton()
                .clickDoneButton();
    }

    @Test
    @DisplayName("Check empty list")
    public void emptyListTest() {
        notesPage
                .emptyListShouldBeVisible();
    }

    @Test
    @DisplayName("Check title")
    public void titleTest() {
        notesPage
                .clickDrawerButton();

        notesPage
                .navDrawerTitleEqualTo("Omni Notes Alpha");
    }

    @Test
    @DisplayName("Check create note")
    public void createNoteTest() {
        var title = "Test note";
        var content = "Super test";

        notesPage
                .clickExpandMenuButton()
                .clickNoteButton()
                .setNoteTitle(title)
                .setNoteContent(content)
                .clickBackButton();

        notesPage
                .noteTitleEqualTo(title)
                .noteContentEqualTo(content);
    }

    @Test
    @DisplayName("Check create checklist")
    public void createCheckListTest() {
        var title = "Test checklist";
        var content = " for test";

        notesPage
                .clickExpandMenuButton()
                .clickChecklistButton()
                .setNoteTitle(title)
                .setChecklistContent(content)
                .clickBackButton();

        notesPage
                .noteTitleEqualTo(title)
                .noteContentEqualTo("New item" + content);
    }

    @Test
    @DisplayName("Check menu category")
    public void menuCategoryTest() {
        notesPage
                .clickExpandMenuButton()
                .clickNoteButton()
                .setNoteTitle("Test note")
                .setNoteContent("Super test")
                .clickMenuCategoryButton()
                .clickAddCategory()
                .setCategoryTitle("Test category")
                .clickSaveButton()
                .clickBackButton();

        notesPage
                .categoryMarkerShouldBeVisible()
                .clickDrawerButton()
                .countShouldBe(1);
    }
}
