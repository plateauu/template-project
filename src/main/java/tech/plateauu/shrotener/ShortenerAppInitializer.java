package tech.plateauu.shrotener;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

class ShortenerAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootApplication.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
