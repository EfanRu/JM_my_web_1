package model;


import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="first_names")
    private String firstName;

    @Column(name="last_names")
    private String lastName;

    @Column(name="phone_numbers")
    private Long phoneNumber;


    public User() {}

    public User(Long id, String firstName, String lastName, Long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

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

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
