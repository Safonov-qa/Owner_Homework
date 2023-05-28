package ru.SafonovIll.owner.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.util.Strings;
import org.openqa.selenium.remote.DesiredCapabilities;

    public class ProjectConfiguration {
        static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        public static void configure() {

            Configuration.baseUrl = config.getBaseUrl();
            Configuration.browser = String.valueOf(config.getBrowserName());
            Configuration.browserVersion = config.getBrowserVersion();


            String remoteUrl = config.getRemoteWebDriverUrl();
            if (!Strings.isNullOrEmpty(remoteUrl)) {
                Configuration.remote = remoteUrl;
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("enableVNC", true);
                capabilities.setCapability("enableVideo", true);
                Configuration.browserCapabilities = capabilities;
            }
        }
}
