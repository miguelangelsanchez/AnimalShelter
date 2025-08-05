package com.shelterService.shelterService.ENTITY;

import java.util.Date;

public class Animal {
    private int Id;
    private String Name;
    private int Age;
    private String Description;
    private String Img;
    private Date RegisterDate;
    private Date Update;

    public Animal(){}

    public Animal(Builder builder){
        this.Id=builder.Id;
        this.Name=builder.Name;
        this.Age=builder.Age;
        this.Description=builder.Description;
        this.Img=builder.Img;
        this.RegisterDate=builder.RegisterDate;
        this.Update=builder.Update;
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

    public Date getUpdate() {
        return Update;
    }

    public void setUpdate(Date update) {
        Update = update;
    }

    public Date getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(Date registerDate) {
        RegisterDate = registerDate;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public static class Builder{
        private int Id;
        private String Name;
        private int Age;
        private String Description;
        private String Img;
        private Date RegisterDate;
        private Date Update;

        public Builder Id(int id){
            this.Id=id;
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

        public Builder Description(String Description){
            this.Description=Description;
            return this;
        }

        public Builder Img(String Img){
            this.Img=Img;
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

        public Animal build(){
            return new Animal(this);
        }
    }
}
