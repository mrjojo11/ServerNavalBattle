package Server.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * The type My spring mvc dispatcher servlet initializer.
 */
public class MySpringMvcDispatcherServletInitializer
		extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
				DemoAppConfig.class
		};
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/" };
	}

}










