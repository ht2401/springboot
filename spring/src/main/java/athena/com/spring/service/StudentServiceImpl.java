package athena.com.spring.service;

import athena.com.spring.model.entity.Student;
import athena.com.spring.model.request.CreateStudentRequest;
import athena.com.spring.model.request.UpdateStudentRequest;
import athena.com.spring.model.response.StudentResponse;
import athena.com.spring.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static athena.com.spring.repository.StudentRepository.students;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public StudentResponse create(CreateStudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setClassName(request.getClassName());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setCreateAt(LocalDateTime.now());
        student.setUpdateAt(LocalDateTime.now());
        // fake repository local memory instead of mysql db
        students.add(student);

        return new StudentResponse(student);
    }

    @Override
    public StudentResponse update(int id, UpdateStudentRequest request) {
        List<Student> students = StudentRepository.students;
        Student student = students.stream().filter(studentFilter -> studentFilter.getId() == id).findAny().get();
        student.setName(request.getName());
        student.setClassName(request.getClassName());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setCreateAt(LocalDateTime.now());
        student.setUpdateAt(LocalDateTime.now());
        return new StudentResponse(student);
    }

    @Override
    public List<Student> delete(int id) {
        List<Student> students = StudentRepository.students;
        students.removeIf(student -> student.getId() == id);
        return students;
    }

    @Override
    public StudentResponse read(int id) {
        List<Student> students = StudentRepository.students;
        return new StudentResponse(students.stream().filter(student -> student.getId() == id).findAny().get());
    }
}
