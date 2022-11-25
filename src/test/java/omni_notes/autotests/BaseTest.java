package omni_notes.autotests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.selenide.AllureSelenide;
import omni_notes.autotests.drivers.BrowserstackMobileDriver;
import omni_notes.autotests.drivers.LocalMobileDriver;
import omni_notes.autotests.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class BaseTest {
    @BeforeAll
    public static void setup() {
        Configuration.browserSize = null;

        switch (System.getProperty("env")) {
            case "browserstack":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
            case "local":
                Configuration.browser = LocalMobileDriver.class.getName();
            default:
                Configuration.browser = LocalMobileDriver.class.getName();

        }
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
//        String sessionId = Selenide.sessionId().toString();

//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
        closeWebDriver();

//        if (System.getProperty("env").equals("browserstack")) {
//            Attach.video(sessionId);
//        }
    }
}
