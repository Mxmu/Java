package cn.itcase.demo47;

public class RegexDemo3 {
    public static void main(String[] args) {
        checkMail();
    }
    public static void checkMail(){
        String email="abc123@sina.com.cn";
        boolean b=email.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
        System.out.println(b);
    }
}
