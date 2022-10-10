package athena.com.spring.service;

import athena.com.spring.model.entity.Student;
import athena.com.spring.model.request.CreateStudentRequest;
import athena.com.spring.model.request.UpdateStudentRequest;
import athena.com.spring.model.response.StudentResponse;

import java.util.List;

public interface StudentService {
    StudentResponse create(CreateStudentRequest request);

    StudentResponse update(int id, UpdateStudentRequest request);

    List<Student> delete(int id);

    StudentResponse read(int id);
}
