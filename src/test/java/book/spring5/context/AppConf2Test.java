package book.spring5.context;

import book.spring5.spring03.config.AppConf1;
import book.spring5.spring03.config.AppConf2;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConf2Test {

    @Test
    public void twoContext() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConf1.class, AppConf2.class);

        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }
}
