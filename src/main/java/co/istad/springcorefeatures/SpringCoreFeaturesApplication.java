package co.istad.springcorefeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCoreFeaturesApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreFeaturesApplication.class, args);
        System.out.println("---- All Bean in the application ---- ");
        String[] beanName = context.getBeanDefinitionNames();
        Arrays.sort(beanName);
        for(var bean : beanName) {
            System.out.println(bean);
        }
    }

}
