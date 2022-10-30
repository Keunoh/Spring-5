package book.spring5.spring03.main;

import book.spring5.spring03.ChangePasswordService;
import book.spring5.spring03.MemberRegisterService;
import book.spring5.spring03.config.AppCtx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainForSpring {
    private static ApplicationContext ctx = null;

    public static void main(String[] args) {
        ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        MemberRegisterService memberRegSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
        ChangePasswordService changePwdSvc = ctx.getBean("changePwdSvc", ChangePasswordService.class);

        System.out.println("changePwdSvc = " + changePwdSvc);
        System.out.println("memberRegSvc = " + memberRegSvc);
    }
}
