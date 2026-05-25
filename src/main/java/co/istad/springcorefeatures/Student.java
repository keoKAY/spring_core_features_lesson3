package co.istad.springcorefeatures;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component("whateverBean")
@Data
public class Student {
    private String name;
    private String gender;
    private int age;
}
