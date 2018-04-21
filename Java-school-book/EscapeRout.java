public class EscapeRout {
    public static void main(String[] args) {
        System.out.println("a\u0022.length()+\u0022b".length());
        System.out.println("a".length() + "b".length());
        System.out.println("a\".length()+\"b".length());

    }
}
/*
2
2
14
*/
