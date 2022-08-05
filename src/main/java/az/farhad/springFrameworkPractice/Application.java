package az.farhad.springFrameworkPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
      Notification notification= context.getBean("notification2",Notification.class);
    notification.alert();

    }
}
