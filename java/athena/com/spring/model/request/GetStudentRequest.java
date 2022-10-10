package athena.com.spring.model.request;

import java.time.LocalDate;

public class GetStudentRequest {
    private int id;

    public GetStudentRequest() {
    }

    public GetStudentRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
