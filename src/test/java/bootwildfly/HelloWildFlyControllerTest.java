package bootwildfly;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWildFlyControllerTest {
    @Test
    public void sayHelloTest() {
        assertEquals(new HelloWildFlyController().sayHello(), "Hello, SpringBoot on Wildfly Today!");
    }
}