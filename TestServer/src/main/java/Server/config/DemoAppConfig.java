package Server.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * The type Demo app config.
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("Server")
@PropertySource ({ "classpath:persistence-mysql.properties" })
public class DemoAppConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;

	private Logger logger = Logger.getLogger(getClass().getName());

	/**
	 * My data source data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource myDataSource() {
		ComboPooledDataSource myDataSource =
				new ComboPooledDataSource();
		try {
			myDataSource.setDriverClass(
					"com.mysql.jdbc.Driver");
		} catch (PropertyVetoException exc) {
			throw new RuntimeException(exc);
		}
		logger.info("jdbc.url="
				+ env.getProperty("jdbc.url"));
		logger.info("jdbc.user="
				+ env.getProperty("jdbc.user"));
		myDataSource.setJdbcUrl(
				env.getProperty("jdbc.url"));
		myDataSource.setUser(
				env.getProperty("jdbc.user"));
		myDataSource.setPassword(
				env.getProperty("jdbc.password"));
		myDataSource.setInitialPoolSize(
				getIntProperty(
						"connection.pool.initialPoolSize"));
		myDataSource.setMinPoolSize(
				getIntProperty(
						"connection.pool.minPoolSize"));
		myDataSource.setMaxPoolSize(
				getIntProperty(
						"connection.pool.maxPoolSize"));
		myDataSource.setMaxIdleTime(
				getIntProperty(
						"connection.pool.maxIdleTime"));
		return myDataSource;
	}

	private Properties getHibernateProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect",
				env.getProperty("hibernate.dialect"));
		props.setProperty("hibernate.show_sql",
				env.getProperty("hibernate.show_sql"));
		return props;
	}

	private int getIntProperty(final String propName) {
		String propVal = env.getProperty(propName);
		int intPropVal = Integer.parseInt(propVal);
		return intPropVal;
	}

	/**
	 * Session factory local session factory bean.
	 *
	 * @return the local session factory bean
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory =
				new LocalSessionFactoryBean();
		sessionFactory.setDataSource(myDataSource());
		sessionFactory.setPackagesToScan(
				env.getProperty("hibernate.packagesToScan"));
		sessionFactory.setHibernateProperties(
				getHibernateProperties());
		return sessionFactory;
	}

	/**
	 * Transaction manager hibernate transaction manager.
	 *
	 * @param sessionFactory the session factory
	 * @return the hibernate transaction manager
	 */
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(
			final SessionFactory sessionFactory) {
		HibernateTransactionManager txManager =
				new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}
}
