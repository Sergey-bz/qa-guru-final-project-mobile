package omni_notes.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class NotePage extends BasePage {

    private final SelenideElement expandMenuButton = $(AppiumBy.id(BASE_LOCATOR + "fab_expand_menu_button"));
    private final SelenideElement emptyList = $(AppiumBy.id(BASE_LOCATOR + "empty_list"));
    private final SelenideElement detailTitleInput = $(AppiumBy.id(BASE_LOCATOR + "detail_title"));
    private final SelenideElement detailContentInput = $(AppiumBy.id(BASE_LOCATOR + "detail_content"));
    private final SelenideElement backButton = $(AppiumBy.accessibilityId("drawer open"));
    private final SelenideElement noteButton = $(AppiumBy.id(BASE_LOCATOR + "fab_note"));
    private final SelenideElement menuCategoryButton = $(AppiumBy.id(BASE_LOCATOR + "menu_category"));
    private final SelenideElement addCategoryButton = $(AppiumBy.id(BASE_LOCATOR + "md_buttonDefaultPositive"));
    private final SelenideElement categoryTitleInput = $(AppiumBy.id(BASE_LOCATOR + "category_title"));
    private final SelenideElement noteTitle = $(AppiumBy.id(BASE_LOCATOR + "note_title"));
    private final SelenideElement noteContent = $(AppiumBy.id(BASE_LOCATOR + "note_content"));
    private final SelenideElement checklistButton = $(AppiumBy.id(BASE_LOCATOR + "fab_checklist"));
    private final SelenideElement saveButton = $(AppiumBy.id(BASE_LOCATOR + "save"));
    private final SelenideElement categoryMarker = $(AppiumBy.id(BASE_LOCATOR + "category_marker"));
    private final SelenideElement checklistContentInput = $(AppiumBy.xpath("/hierarchy/android.widget" +
            ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget" +
            ".FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget" +
            ".DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget" +
            ".RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view" +
            ".ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget" +
            ".LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget" +
            ".LinearLayout/android.widget.LinearLayout/android.widget.EditText"));


    @Step("Open expand menu")
    public NotePage clickExpandMenuButton() {
        expandMenuButton.click();
        return this;
    }

    @Step("Check empty list")
    public NotePage emptyListShouldBeVisible() {
        emptyList.shouldBe(visible);
        return this;
    }

    @Step("Click \"create note\"")
    public NotePage clickNoteButton() {
        noteButton.click();
        return this;
    }

    @Step("Set note title")
    public NotePage setNoteTitle(String title) {
        detailTitleInput.sendKeys(title);
        return this;
    }

    @Step("Set note content")
    public NotePage setNoteContent(String content) {
        detailContentInput.sendKeys(content);
        return this;
    }

    @Step("Click back")
    public NotePage clickBackButton() {
        backButton.click();
        return this;
    }

    @Step("Check note title")
    public NotePage noteTitleEqualTo(String expected) {
        noteTitle.shouldBe(exactText(expected));
        return this;
    }

    @Step("Check note content")
    public NotePage noteContentEqualTo(String expected) {
        noteContent.shouldHave(text(expected));
        return this;
    }

    @Step("Click \"create checklist\"")
    public NotePage clickChecklistButton() {
        checklistButton.click();
        return this;
    }

    @Step("Set checklist content")
    public NotePage setChecklistContent(String content) {
        checklistContentInput.sendKeys(content);
        return this;
    }

    @Step("Click menu category")
    public NotePage clickMenuCategoryButton() {
        menuCategoryButton.click();
        return this;
    }

    @Step("Click add category")
    public NotePage clickAddCategory() {
        addCategoryButton.click();
        return this;
    }

    @Step("Set category title")
    public NotePage setCategoryTitle(String title) {
        categoryTitleInput.sendKeys(title);
        return this;
    }

    @Step("Click save")
    public NotePage clickSaveButton() {
        saveButton.click();
        return this;
    }

    @Step("Check category marker")
    public MenuPage categoryMarkerShouldBeVisible() {
        categoryMarker.shouldBe(visible);
        return new MenuPage();
    }
}
