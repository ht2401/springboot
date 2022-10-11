package athena.com.spring.model.request;

import java.time.LocalDate;

public class UpdateStudentRequest {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String className;

    public UpdateStudentRequest() {
    }

    public UpdateStudentRequest(int id, String name, LocalDate dateOfBirth, String className) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
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
}
