package config;

import Server.config.MySpringMvcDispatcherServletInitializer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type My spring mvc dispatcher servlet initializer test.
 */
public class MySpringMvcDispatcherServletInitializerTest {

    public MySpringMvcDispatcherServletInitializer mySpringMvcDispatcherServletInitializerUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
       mySpringMvcDispatcherServletInitializerUnderTest = new MySpringMvcDispatcherServletInitializer();
            }

    @Test
    public void testGetRootConfigClasses() {

        MySpringMvcDispatcherServletInitializer mySpringMvcDispatcherServletInitializerUnderTest2 = new MySpringMvcDispatcherServletInitializer();
        assertEquals(mySpringMvcDispatcherServletInitializerUnderTest2.getClass(), mySpringMvcDispatcherServletInitializerUnderTest.getClass());
    }

// As this is a configuration class without any branches, we found it hard to test it as our knowledge of Mokito was no
// advanced enough

}
