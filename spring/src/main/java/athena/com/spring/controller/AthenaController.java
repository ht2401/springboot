package athena.com.spring.controller;

import athena.com.spring.model.entity.Student;
import athena.com.spring.model.request.CreateStudentRequest;
import athena.com.spring.model.request.UpdateStudentRequest;
import athena.com.spring.model.response.StudentResponse;
import athena.com.spring.repository.StudentRepository;
import athena.com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static athena.com.spring.repository.StudentRepository.students;

@RestController
@RequestMapping("demo")
public class AthenaController {

    @Autowired
    private StudentService service;

    @GetMapping
    public String st() {
        return "ha thang ne";
    }

    @GetMapping("athena")
    public String ht() {
        return "ha thang xin chao";
    }

    @PostMapping("student")
    public ResponseEntity<StudentResponse> create(@RequestBody CreateStudentRequest request) {
        StudentResponse response = service.create(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("getAll")
    List<Student> getAllStudent() {
        return students;
    }

    @GetMapping("getOne/{id}")
    public ResponseEntity<StudentResponse> get(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(service.read(id));
    }

    @PutMapping("update/{id}")
    public ResponseEntity<StudentResponse> update(@PathVariable(name = "id") int id, @RequestBody UpdateStudentRequest request) {
        StudentResponse response = service.update(id, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<List<Student>> delete(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
