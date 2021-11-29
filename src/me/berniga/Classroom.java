package me.berniga;

import java.util.Random;

public class Classroom {
    private final int id;
    private String name;
    private Student[] students;
    private static int registered=0;

    public Classroom(String name){
        id=++registered;
        this.name=name;
        students=new Student[25];
    }

    public int firstFreeIndex(){
        for(int i=0;i<students.length;i++)
            if(students[i]==null)   return i;
        return -1;
    }

    public void addStudent(Student s){
        students[firstFreeIndex()]=s;
    }

    public Student getStudent(int i){
        return students[i];
    }

    public void removeStudent(int i){
        students[i]=null;
    }

    public void test(){
        for(int i=0;i<students.length;i++)
            students[i].setMedia((new Random().nextInt(7))+students[i].study());
    }




}
