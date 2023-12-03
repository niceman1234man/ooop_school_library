import java.util.ArrayList;
import java.util.List;
public class Classroom {

        private String label;
        private List<Student> students;


        public void addStudent(Student student) {
            students.add(student);
            student.setClassroom(this);


        }
    }

