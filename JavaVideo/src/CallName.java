import java.util.Random;
public class CallName {
    public static void main(String[] args){
        String[] names={"嘤嘤嘤","英语","hhhh","hdahd"};
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);

        }
        System.out.println("==========");
        Random ran=new Random();
        int index=ran.nextInt(names.length);
        System.out.println(names[index]);
    }
}
