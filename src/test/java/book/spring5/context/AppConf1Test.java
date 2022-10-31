package book.spring5.context;

import book.spring5.spring03.config.AppConf1;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConf1Test {

    @Test
    public void getContextNames() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConf1.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }
}
