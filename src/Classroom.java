import java.util.ArrayList;
import java.util.List;
public class Classroom {

        private String label;
        private List<Student> students;

        public Classroom(String label) {
            this.label = label;
            this.students = new ArrayList<>();
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public List<Student> getStudents() {
            return students;
        }

        public void addStudent(Student student) {
            students.add(student);
            student.setClassroom(this);


        }
    }

