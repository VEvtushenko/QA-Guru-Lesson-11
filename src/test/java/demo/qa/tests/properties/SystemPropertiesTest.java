package demo.qa.tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("SystemPropertiesTest")
public class SystemPropertiesTest {
    @Test
    void someTest00() {
        String browser = System.getProperty("browser");
        System.out.println(browser); // null
    }

    @Test
    void someTest01() {
        System.setProperty("browser", "safary");
        String browser = System.getProperty("browser");
        System.out.println(browser); //safary
    }

    @Test
    void someTest02() {
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); // opera
    }

    @Test
    void someTest03() {
        System.setProperty("browser", "safary");
        String browser = System.getProperty("browser", "opera");
        System.out.println(browser); // safary
    }

    @Test
    @Tag("test04")
    void someTest04() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "100");
        String browserSize = System.getProperty("browserSize", "1920x1080");

        System.out.println(browser); // chrome
        System.out.println(version); // 100
        System.out.println(browserSize); // 1920x1080
    }

    @Test
    void someTest05() {
        String text = System.getProperty("anyText");
        System.out.println(text); // safary
    }


}
