package omni_notes.autotests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Omni note")
public class CheckListTest extends BaseTest {

    @Test
    @DisplayName("Check create checklist")
    public void createCheckListTest() {
        var title = "Test checklist";
        var content = " for test";

        notePage
                .clickExpandMenuButton()
                .clickChecklistButton()
                .setNoteTitle(title)
                .setChecklistContent(content)
                .clickBackButton();

        notePage
                .noteTitleEqualTo(title)
                .noteContentEqualTo("New item" + content);
    }
}
