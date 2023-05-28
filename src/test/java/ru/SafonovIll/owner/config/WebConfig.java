package ru.SafonovIll.owner.config;

import org.aeonbits.owner.Config;
import ru.SafonovIll.owner.data.Browser;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebConfig extends Config {

    @Key("browserName")
    Browser getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com/")
    String getBaseUrl();

    @Key("remoteWebDriverUrl")
    String getRemoteWebDriverUrl();






}
