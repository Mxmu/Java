public class ArrayDemo_4 {
    public static void main(String[] args){
        int[] arr={5,2,1};
       // System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException: 3
       //负数也不行
        //空指针异常
        int[] arr2={1,5,8};
        System.out.println(arr2[2]);
        arr2=null;
        //System.out.println(arr2[2]);//java.lang.NullPointerException
    }
}
