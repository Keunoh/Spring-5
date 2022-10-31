package book.spring5.spring03.config;

import book.spring5.spring03.MemberDao;
import book.spring5.spring03.MemberPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConf1 {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }
}
