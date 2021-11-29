package me.berniga;

import java.util.Random;

public class Student {
    private final int id;
    private String name;
    private String surname;
    private int credits;
    private double media;
    private static int registered=0;

    public Student(String name,String surname){
        id=++registered;
        this.credits=0;
        this.name=name;
        this.surname=surname;
    }

    public double getMedia(){
        return this.media;
    }

    public int study(){
        int hours=new Random().nextInt(6);
        if(hours<1) return 0;
        else if(hours>3)    return 4;
        else    return 2;
    }

    public void setMedia(int mark){
        this.media=(this.media+mark)/2;
    }

    public void setCredits(){
        if(this.media>=6&&this.media<8) this.credits+=10;
        else if(this.media >=8) this.credits+=12;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", credits=" + credits +
                ", media=" + media +
                '}';
    }
}