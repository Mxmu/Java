package 第二章;

public class ArrayDemo {
    public static void main(String[] args) {
        char[] AB;
        AB=new char[3];
        AB[0]='a';AB[1]='b';AB[2]='c';
        System.out.println(AB[0]);
        System.out.println(AB[1]);
        System.out.println(AB[2]);
        int [] AC=new int[2];
        AC[0]=100;AC[1]=200;
        System.out.println(AC[0]);
        System.out.println(AC[1]);
        int[] AD={10,20,30,40};
        System.out.println(AD[0]);
        System.out.println(AD[1]);
        System.out.println(AD[2]);
        System.out.println(AD[3]);
        System.out.println(AB.length);
        System.out.println(AC.length);
        System.out.println(AD.length);
    }
}
