
public class Student extends Person {
    String classroom;

    public Student(int id,String name, int age, String classroom) {
        super(id,name, age);
         this.classroom = classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = this.classroom;
        classroom.addStudent(this);

    }

}
