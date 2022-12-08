package omni_notes.autotests.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})
public interface BrowserstackConfig extends Config {

    @Key("browserstack.user")
    String user();
    @Key("browserstack.key")
    String key();
    String app();
    String device();
    @Key("os.version")
    String osVersion();
    String project();
    String build();
    String name();
}
