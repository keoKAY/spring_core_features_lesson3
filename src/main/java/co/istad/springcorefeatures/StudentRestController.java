package co.istad.springcorefeatures;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("api/v1/students")
public class StudentRestController {
    // inject repository in order to return the data
    private final StudentRepository studentRepository;
    public StudentRestController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @GetMapping("")
    public Map<String,Object> getAllStudents(){
        Map<String,Object> response = new HashMap<>();
        response.put("message", "Get Student successfully!");
        response.put("status_code", HttpStatus.OK.value());
        response.put("payload", studentRepository.getStudents());
        return response;
    }
}
