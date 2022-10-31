package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPripertiesTests {

    @Test
    @Tag("one_property_test")
    void simplePropertiesTest() {
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("many_property_test")
    void simpleProperties2Test() {
        String browserName = System.getProperty("browser", "firefox");
        String browserVersion = System.getProperty("version", "99");
        String windowSize = System.getProperty("windowSize", "1900x1080");
        String remote = System.getProperty("remoteBrowser", null);
    }
}
