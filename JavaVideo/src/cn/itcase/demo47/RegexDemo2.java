package cn.itcase.demo47;

public class RegexDemo2 {
    public static void main(String[] args) {
        replaceAll_1();
        replaceAll_2();
    }
    public static void replaceAll_1(){
        String str="Heafafafha124hfha45";
        str=str.replaceAll("[\\d+]","#");
        System.out.println(str);
    }
    public static void replaceAll_2(){
        String str="Heafafafha124hfha45";
        str=str.replaceAll("[\\d]+","#");
        System.out.println(str);
    }
}
