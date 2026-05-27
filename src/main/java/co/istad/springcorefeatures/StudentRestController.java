package co.istad.springcorefeatures;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


// annotations
// java-based configuration
// xml

// Type of DI in spring
    // constructor injection (rec )
    // setter injection ( rec )
    // field injection
@RestController
@RequestMapping("api/v1/students")
public class StudentRestController {

    // inject repository in order to return the data
    private final StudentRepository studentRepository;
    public StudentRestController(StudentRepository studentRepository ) {
        this.studentRepository = studentRepository;
    }


    @GetMapping("")
    public Map<String,Object> getAllStudents(){

        Map<String,Object> response = new HashMap<>();
        response.put("message", "Student result is found!");
        response.put("status_code", HttpStatus.OK.value());
        response.put("payload", studentRepository.getStudents());


        return response;
    }

    // find the student by id


    // /api/v1/students/78907890
    @GetMapping("/{id}")
    public Map<String, Object > getStudentByID(@PathVariable int id){
        Map<String, Object> response = new HashMap<>();
        Optional<Student> result  = studentRepository.findStudentByID(id);
        if (result.isPresent()) {
            // we find what we're looking for !
            response.put("message", "Get Student successfully!");
            response.put("status_code", HttpStatus.OK.value());
            response.put("payload", result.get());
        }else {
            // not found
            response.put("message", "Student not found!");
            response.put("status_code", HttpStatus.NOT_FOUND.value());
           // response.put("payload", );
        }
        return response;
    }
}
