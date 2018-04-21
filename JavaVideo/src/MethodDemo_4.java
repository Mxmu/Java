import sun.awt.geom.AreaOp;

public class MethodDemo_4 { //方法参数是引用类型，传递的是内存地址
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(arr[2]);//3
        change(arr);
        System.out.println(arr[2]);//100
    }
    public static void change(int[] arr){
        arr[2]=100;
    }
}
