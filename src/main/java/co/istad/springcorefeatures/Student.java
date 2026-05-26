package co.istad.springcorefeatures;


import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String gender;

}
