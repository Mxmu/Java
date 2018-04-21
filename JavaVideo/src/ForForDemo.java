public class ForForDemo {
    public static void main(String[] args){
        for(int i=0;i<9;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}//外循环控制的是行数，内循环控制的是每行的个数
