package com.shelterService.shelterService.ENTITY;

import jakarta.persistence.Entity;

import java.util.Date;

//@Entity
public class User {
    private int Id;
    private String Name;
    private int Age;
    private String Img;
    private String Address;
    private Date RegisterDate;
    private Date Update;

    public User(){}

    public User(Builder builder){
        this.setId(builder.Id);
        this.setName(builder.Name);
        this.setAge(builder.Age);
        this.setImg(builder.Img);
        this.setAddress(builder.Address);
        this.setRegisterDate(builder.RegisterDate);
        this.setUpdate(builder.Update);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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
        private String Name;
        private int Age;
        private String Img;
        private String Address;
        private Date RegisterDate;
        private Date Update;

        public Builder Id(int Id){
            this.Id=Id;
            return this;
        }

        public Builder Name(String Name){
            this.Name=Name;
            return this;
        }

        public Builder Age(int Age){
            this.Age=Age;
            return this;
        }

        public Builder Img(String Img){
            this.Img=Img;
            return this;
        }

        public Builder Address(String Address){
            this.Address=Address;
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

        public User build(){
            return new User(this);
        }
    }
}
