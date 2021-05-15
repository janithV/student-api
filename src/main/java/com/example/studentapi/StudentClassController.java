package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentClassController {

    StudentRepository repository = new InMemoryStudentRepository();

    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable String id){
        repository.delete(id);
        return "student " + repository.get(id).getName() +" is deleted";
    }

    @PostMapping("/student/update")
    public String updateStudent(@RequestBody Student student){
        Student updatedStudent=repository.update(student);

        return "Student details updated from " +student + "to :" + updatedStudent;
    }

}
