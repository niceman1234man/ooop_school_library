/*
create class Person with the following:
Instance vars: id, name, and age.
Constructor with name, age, and parent_permission as parameter. name and parent_permission are optional and have default values of "Unknown" and true.
Getters for id, name, and age.
Setters for name and age.
Private method of_age? that returns true if age is greater or equal to 18 and false otherwise.
Public method can_use_services? that returns true if person is of age or if they have permission from parents.

 */
public class Person {
     int id;
     String name;
     int age;
     boolean parentPermission;

    public Person(String name, int age) {

        this.name = name != null ? name : "Unknown";
        this.age = age;
        this.parentPermission = true;
    }

    public Person(String name, int age, boolean parentPermission) {
       this(name, age);
        this.parentPermission = parentPermission;
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOfAge() {
        return age >= 18;
    }

    public boolean canUseServices() {

        return isOfAge() || parentPermission;
    }


}

