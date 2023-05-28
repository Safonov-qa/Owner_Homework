package ru.SafonovIll.owner;


import org.junit.jupiter.api.BeforeAll;
import ru.SafonovIll.owner.config.ProjectConfiguration;

public class TestBase {

    @BeforeAll
    public static void setUp() {
        ProjectConfiguration.configure();
    }

}