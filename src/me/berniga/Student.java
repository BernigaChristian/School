package me.berniga;

public class Student {
    private final int id;
    private String name;
    private String surname;
    private int credits;
    private static int registered=0;

    public Student(String name,String surname){
        id=++registered;
        this.name=name;
        this.surname=surname;
    }



}
