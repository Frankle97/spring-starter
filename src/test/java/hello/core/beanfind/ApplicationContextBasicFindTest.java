package hello.core.beanfind;

import hello.core.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
}
