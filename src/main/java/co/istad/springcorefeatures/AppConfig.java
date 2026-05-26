package co.istad.springcorefeatures;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean("student1")
    public Student student(){
        return new Student();
    }
    @Bean("student2")
    public Student student2(){
        return new Student(1001,"koko",",male");
    }

}
