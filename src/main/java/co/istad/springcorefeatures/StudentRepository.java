package co.istad.springcorefeatures;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// meaning it work with database
@Repository
public class StudentRepository {
 // initialize some values for our repository ( because we don't have database yet!)
 private final static ArrayList<Student> students = new ArrayList<>(){{
   add(new Student(1001,"James bond", "male" ));
   add(new Student(1002,"Mona Liza ", "female"));
   add(new Student(1003,"John Snow", "male"));
 }};


 // return all the student for rest controller
 public List<Student> getStudents(){
  return students;
 }

 // Optional = use mostly for searching tasks when there is
 // chance of you getting NULL
 // prevent NULLPOINTER EXCEPTION
 public Optional<Student> findStudentByID(int id){
     return  students.stream()
             .filter(stu -> stu.getId() == id )
             .findFirst();

 }

}
