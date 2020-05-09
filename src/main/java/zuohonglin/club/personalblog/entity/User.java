package zuohonglin.club.personalblog.entity;

import java.io.Serializable;

public class User implements Serializable {


    private String id;
    private String acount;
    private String name;
    private String pwd;
    private String email;
    private String img;
    private String status;
    private String create_time;
    private String update_time;

    public User(String id, String acount, String name, String pwd, String email, String img,String status) {
        this.id = id;
        this.acount = acount;
        this.name = name;
        this.pwd = pwd;
        this.email = email;
        this.img = img;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", acount='" + acount + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", img='" + img + '\'' +
                "ctime"+create_time+
                "utime"+update_time+
                '}';
    }
}
