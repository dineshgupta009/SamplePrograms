package org.example.stream;

public class student {

   public String name;
    public int age;
    public Double sal;


    public student(String name, int age, Double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sal=" + sal +
                '}';
    }
}
