package omni_notes.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class TipsPage extends BasePage {

    private final SelenideElement nextButton = $(AppiumBy.id(BASE_LOCATOR + "next"));
    private final SelenideElement doneButton = $(AppiumBy.id(BASE_LOCATOR + "done"));

    @Step("Click next")
    public TipsPage clickNextButton() {
        nextButton.click();
        return this;
    }

    @Step("Click done")
    public TipsPage clickDoneButton() {
        doneButton.click();
        return this;
    }
}
