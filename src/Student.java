/*
Create class Student with the following:
Inherits from Person.
Constructor extends parent's constructor by adding classroom and a parameter for it
 */
public class Student extends Person {
    String classroom;

    public Student(String name, int age, String classroom) {
        super(name, age);
        this.classroom = classroom;
    }

    public String getClassroom() {

        return classroom;
    }
}
