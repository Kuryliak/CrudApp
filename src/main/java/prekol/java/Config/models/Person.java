package prekol.java.Config.models;

import javax.validation.constraints.*;

public class Person {
    @NotEmpty
    @Size(max = 15)
    @Size(min = 0)
    private String firstname;
    private int id;
    @Email()
    @Size(max = 30)
    private String email;
    @Min(value = 0)
    @Max(value = 100)
    private int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        boolean b = true;
    }

    public Person(int id, String firstname, String email, int age) {
        this.firstname = firstname;
        this.age = age;
        this.email = email;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
