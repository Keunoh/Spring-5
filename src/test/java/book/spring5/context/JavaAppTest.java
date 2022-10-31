package book.spring5.context;

import book.spring5.spring03.MemberDao;
import book.spring5.spring03.MemberInfoPrinter;
import book.spring5.spring03.MemberListPrinter;
import book.spring5.spring03.MemberPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class JavaAppTest {

    @Test
    @DisplayName("빈으로 등록되지 않은 객체 조회 불가")
    public void findObjectNotRegisteredBean() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppCtxNoMemberPrinterBean.class);

//        MemberPrinter bean = ac.getBean(MemberPrinter.class);
//        System.out.println("bean = " + bean);

        Assertions.assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean(MemberPrinter.class));
    }

    @Configuration
    static class AppCtxNoMemberPrinterBean {
        private MemberPrinter printer = new MemberPrinter();  //빈이 아님

        @Bean
        public MemberListPrinter listPrinter() {
            return new MemberListPrinter(new MemberDao(), printer);
        }

        @Bean
        public MemberInfoPrinter infoPrinter() {
            MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
            return infoPrinter;
        }
    }

}
