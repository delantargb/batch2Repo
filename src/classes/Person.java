package classes;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * Created by JPMPC-B210 on 11/10/2016.
 */
public /*abstract*/ class Person {

    public String name;
    public boolean gender ;
    public int age;
    public float weight;
    public float height;
    public String email;
            //student
    public int subjects;


    //students


    public int getSubjects() {
        return subjects;
    }

    //getters
    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public String getEmail() {
        return email;

    }
        //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //method or function overWriting
    public String intoduceYourself(){

        return this.name;

    }
    //method or function overLoading
    public String intoduceYourself2(String eName, String newDepartment){

        return eName + newDepartment;

    }











    }

