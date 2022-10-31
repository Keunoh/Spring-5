package book.spring5.spring03.config;

import book.spring5.spring03.MemberRegisterService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AppConfImportTest {

    @Test
    public void appConfigImportTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfImport.class);

        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println("beanDefinitionName = " + beanDefinitionName);

        }

        MemberRegisterService memberRegSvc = ac.getBean("memberRegSvc", MemberRegisterService.class);
        System.out.println("memberRegSvc = " + memberRegSvc);

        assertThat(memberRegSvc).isInstanceOf(MemberRegisterService.class);
    }
}