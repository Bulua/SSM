package cn.edu.aynu.test;

import cn.edu.aynu.service.ILoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedisTest {

    @Test
    public void test01(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        ILoginService loginService = (ILoginService) ioc.getBean("loginService");
        String jph = loginService.verificationCode("jph");
        System.out.println(jph);
    }
}
