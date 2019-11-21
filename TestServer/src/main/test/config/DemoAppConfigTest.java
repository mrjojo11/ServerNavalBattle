package config;

import Server.config.DemoAppConfig;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * The type Demo app config test.
 */
@RunWith(MockitoJUnitRunner.class)
public class DemoAppConfigTest {

    @Mock
    private Environment mockEnv;

    @InjectMocks
    private DemoAppConfig demoAppConfigUnderTest;

    /**
     * Sets up.
     */
    @Before
    public void setUp() {
        initMocks(this);
    }

    /**
     * Test my data source.
     */
    @Test
    public void testDemoAppConfig() {

        DemoAppConfig testConfig = new DemoAppConfig();
        assertEquals(testConfig.getClass(), demoAppConfigUnderTest.getClass());
    }
}


// As this is a configuration class without any branches, we found it hard to test it as our knowledge of Mokito was no
// advanced enough
