package omni_notes.autotests.drivers;

import com.codeborne.selenide.WebDriverProvider;
import omni_notes.autotests.config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {

    private final BrowserstackConfig browserstack = ConfigFactory.create(BrowserstackConfig.class);

    public static URL getBrowserstackUrl() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);
        mutableCapabilities.setCapability("browserstack.user", browserstack.user());
        mutableCapabilities.setCapability("browserstack.key", browserstack.key());
        mutableCapabilities.setCapability("app", browserstack.app());
        mutableCapabilities.setCapability("device", browserstack.device());
        mutableCapabilities.setCapability("os_version", browserstack.osVersion());
        mutableCapabilities.setCapability("project", browserstack.project());
        mutableCapabilities.setCapability("build", browserstack.build());
        mutableCapabilities.setCapability("name", browserstack.name());
        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }
}