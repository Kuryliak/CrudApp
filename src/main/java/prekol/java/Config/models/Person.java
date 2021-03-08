package prekol.java.Config.models;

import javax.validation.constraints.*;

public class Person {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        boolean b = true;
    }

    public Person(int id, String name, String email, int age) {
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
