package ru.SafonovIll.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.SafonovIll.owner.config.WebConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class WebTest extends TestBase{

    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    @Test
    public void testGithub() {
        open(config.getBaseUrl());
        String title = title();
        assertEquals ("GitHub: Let’s build from here · GitHub", title);
    }
}
