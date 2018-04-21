import java.util.Random;
public class CallName_1 {
    public static void main(String[] args){
        String[] names=new String[3];
        addStudent(names);
        printStudentName(names);
        randomStudentName(names);
        String name=randomStudentName(names);
        System.out.println(name);

    }
    public static void addStudent(String[] names){
        names[0]="jjj";
        names[1]="hhh";
        names[2]="xxx";
    }
    public static void printStudentName(String[] names){
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
    public static String randomStudentName(String[] names){
        Random ran=new Random();
        int index=ran.nextInt(names.length);
        return names[index];
    }
}
