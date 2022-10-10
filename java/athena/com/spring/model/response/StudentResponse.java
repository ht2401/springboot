package athena.com.spring.model.response;

import athena.com.spring.model.entity.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StudentResponse {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String className;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public StudentResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.dateOfBirth = student.getDateOfBirth();
        this.className = student.getClassName();
        this.createAt = student.getCreateAt();
        this.updateAt = student.getUpdateAt();
    }
}
