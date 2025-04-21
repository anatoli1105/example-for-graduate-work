package ru.skypro.homework.dto;

public class User {
    private int id;
     private String email;
    private String firstName;
    private String lastName;
    private String phone;
     private User  role;
    private String image;
    public User(String email, String firstName, int id, String image, String lastName, String phone, User role) {
        this.email = email;
        this.firstName = firstName;
        this.id = id;
        this.image = image;
        this.lastName = lastName;
        this.phone = phone;
        this.role = role;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getRole() {
        return role;
    }

    public void setRole(User role) {
        this.role = role;
    }
}
