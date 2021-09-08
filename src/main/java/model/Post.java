package model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String image;
    private String content;
    private Date createDate;
    private int privicy;
    private int feeling;
    private String checkIn;
    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(int id, String image, String content, Date createDate, int privicy, int feeling, String checkIn, User user) {
        this.id = id;
        this.image = image;
        this.content = content;
        this.createDate = createDate;
        this.privicy = privicy;
        this.feeling = feeling;
        this.checkIn = checkIn;
        this.user = user;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getPrivicy() {
        return privicy;
    }

    public void setPrivicy(int privicy) {
        this.privicy = privicy;
    }

    public int getFeeling() {
        return feeling;
    }

    public void setFeeling(int feeling) {
        this.feeling = feeling;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
