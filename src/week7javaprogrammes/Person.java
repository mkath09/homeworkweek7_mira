package week7javaprogrammes;
/*
. Person
Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
 */
public class Person {
    String firstName;
    String lastName;
    int age;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }
    public String getFullName() {
        String name = "";
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return name;
        } else if (getFirstName().isEmpty()) {
            return getFirstName();
        } else if (getLastName().isEmpty()) {
            return name = getLastName();
        } else if (!firstName.isEmpty() || lastName.isEmpty()) {
            name = getFirstName() + " " + getLastName();
            return name;
        }
        name = getFirstName() + getLastName();
        return name;
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
