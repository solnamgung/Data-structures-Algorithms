package practicePage;

public class People {
    private String firstname;
    private String lastname;
    private Integer age;

    public People(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public void display() {
        System.out.print("First name is : " + firstname);
        System.out.print("Last name is : " + lastname);
        System.out.println(", Age is " + age);
    }
    public String getLastname() {
        return lastname;
    }
}
