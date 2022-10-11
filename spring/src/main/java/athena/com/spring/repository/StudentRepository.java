package athena.com.spring.repository;

import athena.com.spring.model.entity.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {
    //mock data
    LocalDateTime moment1 = LocalDateTime.now();
    LocalDateTime moment2 = LocalDateTime.now().minusDays(1).minusHours(1);
    LocalDateTime moment3 = LocalDateTime.now().minusDays(2).minusHours(3);
    LocalDateTime moment4 = LocalDateTime.now().minusDays(3).minusHours(2);

    List<Student> students = new ArrayList<>() {
        {
            add(new Student(1,"Thang", LocalDate.parse("2001-12-12"),"JB01",moment1,moment3));
            add(new Student(2,"Nam", LocalDate.parse("2001-12-12"),"JB06",moment2,moment3));
            add(new Student(3,"Hieu", LocalDate.parse("2001-12-12"),"Jh01",moment1,moment3));
            add(new Student(4,"Oanh", LocalDate.parse("2001-12-12"),"JB01",moment1,moment2));
            add(new Student(5,"Duc", LocalDate.parse("2001-12-12"),"Jk01",moment1,moment3));
            add(new Student(6,"Hiep", LocalDate.parse("2001-12-12"),"JB01",moment2,moment3));
            add(new Student(7,"Cuong", LocalDate.parse("2001-12-12"),"JB02",moment1,moment3));
            add(new Student(8,"Thuong", LocalDate.parse("2001-12-12"),"JB01",moment1,moment3));
            add(new Student(9,"Anh", LocalDate.parse("2001-12-12"),"MB03",moment2,moment3));
            add(new Student(10,"Tuan", LocalDate.parse("2001-12-12"),"JB01",moment1,moment3));

        }
    };
}
