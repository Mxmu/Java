import java.util.ArrayList;
import java.util.Random;
public class CallName_2 {
    public static void main(String[] args)
    {
        ArrayList <StudentName>array=new <StudentName> ArrayList();
        add(array);
        printStudentName(array);
        System.out.println();
        randomStudentName(array);
    }
    public static void printStudentName(ArrayList <StudentName> array)
    {
        for(int i=0;i<array.size();i++){
        StudentName s=array.get(i);
        System.out.println(s.name+" "+s.age); }

    }
    public static void add(ArrayList <StudentName> array)
    {
        StudentName n1=new StudentName();
        StudentName n2=new StudentName();
        StudentName n3=new StudentName();

        n1.name="王老五";
        n1.age=19;
        n2.name="李小四";
        n2.age=10;
        n3.name="张全蛋";
        n3.age=22;

        array.add(n1);
        array.add(n2);
        array.add(n3);
    }
public static void randomStudentName(ArrayList <StudentName> array)
{
    Random r=new Random();
    int number=r.nextInt(array.size());
    StudentName s=array.get(number);
    System.out.println(s.name+" "+s.age);
}
}
