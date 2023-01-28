package tests.Properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    @Tag("one_property")
    void simplePropertyTest() {
        String browserName = System.getProperty("browser", "opera");
        System.out.println(browserName);
        //gradle clean one_property_test

        //gradle clean one_property_test -Dbrowser=safari
    }

    @Test
    @Tag("hello")
    void sayHello() {
        System.out.println("Hello " + System.getProperty("username", "unknown"));
    }
}
