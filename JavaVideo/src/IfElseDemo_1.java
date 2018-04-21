public class IfElseDemo_1 {
    public static void main(String[] args){
        int i=5;
        int j=6;
        if(i>j) {
            System.out.println(i + "是最大值");
        }else{
            System.out.println(j+"是最大值");
        }
        int k=i>j?i:j;
        System.out.println(k+"是最大值");
    }
}
