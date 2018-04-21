public class ArrayDemo_1 {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};//new后面的中括号中，不允许写任何内容，写了就编译失败
        System.out.println(arr.length);
        System.out.println(arr[2]);
        System.out.println("========");
        int[] arr1={1,2,3,4,5,};
        System.out.println(arr1.length);
        System.out.println(arr1[2]);
    }
}
