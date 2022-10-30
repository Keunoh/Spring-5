package book.spring5.context;

import book.spring5.spring03.MemberRegisterService;
import book.spring5.spring03.config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContextTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppCtx.class);

    @Test
    public void getRegisteredBeanNamesFromContainer() {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }
}
