package omni_notes.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class MenuPage extends BasePage {

    private final SelenideElement drawerButton = $(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=drawer open]"));
    private final SelenideElement navDrawerTitle = $(AppiumBy.id(BASE_LOCATOR + "navdrawer_title"));
    private final SelenideElement count = $(AppiumBy.id(BASE_LOCATOR + "count"));

    @Step("Open drawer")
    public MenuPage clickDrawerButton() {
        drawerButton.click();
        return this;
    }

    @Step("Check drawer title")
    public MenuPage navDrawerTitleEqualTo(String expected) {
        navDrawerTitle.shouldHave(exactText(expected));
        return this;
    }

    @Step("Check count of notes in category")
    public MenuPage countShouldBe(int expected) {
        count.shouldHave(exactText(String.valueOf(expected)));
        return this;
    }

}
