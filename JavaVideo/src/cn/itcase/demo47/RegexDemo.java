package cn.itcase.demo47;

public class RegexDemo {
    public static void main(String[] args) {
    checkQQ();
    checkTel();
    }
    public static void checkQQ(){
        String QQ="124567000";
        boolean b=QQ.matches("[1-9][0-9]{4,9}");
        System.out.println(b);
    }
    public static void checkTel(){
        String telNumber="15651412227";
        boolean b=telNumber.matches("1[34578][\\d]{9}");
        System.out.println(b);
    }
}
