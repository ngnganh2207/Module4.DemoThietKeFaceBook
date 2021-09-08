package model;

import javax.persistence.*;
import java.sql.Date;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String passWord;
    private String avatar;
    private String gender;
    private Date birthDay;
    @ManyToOne
    private Role role;


    public User() {
    }

    public User(int id, String name, String passWord, String avatar, String gender, Date birthDay, Role role) {
        this.id = id;
        this.name = name;
        this.passWord = passWord;
        this.avatar = avatar;
        this.gender = gender;
        this.birthDay = birthDay;
        this.role = role;
    }

    public User(int id, String name, String avatar, String gender, Date birthDay, Role role) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
        this.birthDay = birthDay;
        this.role = role;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
