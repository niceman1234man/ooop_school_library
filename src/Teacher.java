/*
Create class Teacher with the following:
Inherits from Person.
Constructor extends parent's constructor by adding specialization and a parameter for it.
Override can_use_services? so it always returns true.
Each class should be saved in a separate file.
 */
public class Teacher extends Person {
     private String specialization;

    public Teacher(String name, int age, String specialization) {
        super(name, age);
         this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
         return true;
    }

    public String getSpecialization() {

        return specialization;
    }
}
