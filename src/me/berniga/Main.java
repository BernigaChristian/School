package me.berniga;

public class Main {
    public static void addStudents(Classroom c1){
        for(int i=0;i<25;i++)
            c1.addStudent(new Student("name"+i,"surname"+i));
    }

    public static void yearSimulation(Classroom c1){
        for(int i=0;i<20;i++)
            c1.test();
        credits(c1);
        isFired(c1);
    }

    public static void credits(Classroom c1){
        for(int i=0;i<25;i++)
            c1.getStudent(i).setCredits();
    }

    public static void isFired(Classroom c1){
        for(int i=0;i<25;i++)
            if(c1.getStudent(i).getMedia()<6)   c1.removeStudent(i);
    }

    public static void showResults(Classroom c1){
        for(int i=0;i<25;i++)
            if(c1.getStudent(i)!=null) System.out.println(c1.getStudent(i).toString());
    }

    public static void main(String[] args) {
        Classroom c1=new Classroom("4D");
        addStudents(c1);
        yearSimulation(c1);
        showResults(c1);
    }
}
