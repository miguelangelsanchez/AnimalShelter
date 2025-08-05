package com.shelterService.shelterService.ENTITY;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class AppAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "username")
    private String User;
    private String Password;
    private String Name;
    private Date RegisterDate;

    @Column(name = "last_update")
    private Date Update;

    public AppAdmin(){}

    public AppAdmin(Builder builder){
        this.setId(builder.Id);
        this.setUser(builder.User);
        this.setPassword(builder.Password);
        this.setName(builder.Name);
        this.setRegisterDate(builder.RegisterDate);
        this.setUpdate(builder.Update);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(Date registerDate) {
        RegisterDate = registerDate;
    }

    public Date getUpdate() {
        return Update;
    }

    public void setUpdate(Date update) {
        Update = update;
    }

    public static class Builder{
        private int Id;
        private String User;
        private String Password;
        private String Name;
        private Date RegisterDate;
        private Date Update;

        public Builder Id(int Id){
            this.Id=Id;
            return this;
        }

        public Builder User(String User){
            this.User=User;
            return this;
        }

        public Builder Password(String Password){
            this.Password=Password;
            return this;
        }

        public Builder Name(String Name){
            this.Name=Name;
            return this;
        }

        public Builder RegisterDate(Date RegisterDate){
            this.RegisterDate=RegisterDate;
            return this;
        }

        public Builder Update(Date Update){
            this.Update=Update;
            return this;
        }

        public AppAdmin build(){
            return new AppAdmin(this);
        }
    }
}
