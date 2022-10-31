package book.spring5.context;

import book.spring5.spring03.MemberDao;
import book.spring5.spring03.MemberPrinter;
import book.spring5.spring03.config.AppCtx;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    @DisplayName("등록되지 않은 이름으로 빈을 조회하면 exception 발생")
    public void findExceptionWrongBeanName() {
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> applicationContext.getBean("memberDao1"));
    }

    @Test
    @DisplayName("이름과 매칭되지 않는 클래스타입을 넘겼을 경우 exception 발생")
    public void findExceptionWrongBeanType() {
        assertThrows(BeanNotOfRequiredTypeException.class,
                () -> applicationContext.getBean("memberDao", MemberPrinter.class));
    }
}
