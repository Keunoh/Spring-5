package book.spring5.qualifier;

import book.spring5.spring03.MemberPrinter;
import book.spring5.spring03.config.AppCtx;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class QualifierTest {

    @Test
    @DisplayName("빈이 2개 이상일 경우 구분자 옵션")
    public void findBeanWhenBeanExitsMoreThanTwo() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(QualifierApp.class);

        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }

    }

    static class QualifierApp {

        @Bean
        public Printer printer() {
            return new LaserPrinter();
        }

        @Bean
        public BoxImpl boxImpl() {
            return new BoxImpl(printer());
        }

    }

}
