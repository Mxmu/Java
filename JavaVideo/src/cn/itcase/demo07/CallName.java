package cn.itcase.demo07;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
    public static void main(String[] args)
    {
        ArrayList<Student>array=new ArrayList<Student>();
        addStudent(array);
        printStudent(array);
        randomStudent(array);
    }
    public static void addStudent(ArrayList<Student>array)
    {
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(12);
        Student s2=new Student();
        s2.setName("张四");
        s2.setAge(13);
        Student s3=new Student();
        s3.setName("张二");
        s3.setAge(15);
        Student s4=new Student();
        s4.setName("张七");
        s4.setAge(11);
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
    }
    public static void printStudent(ArrayList<Student>array)
    {
        for(int i=0;i<array.size();i++)
        {
            Student s=array.get(i);
            System.out.println(s.getName()+"..."+s.getAge());
        }
    }
    public static void randomStudent(ArrayList<Student>array)
    {
        Random r=new Random();
        int index=r.nextInt(array.size());
        Student s=array.get(index);
        System.out.println(s.getName());
    }
}
