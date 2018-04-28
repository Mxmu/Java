public class ArrayMethodTest {
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4};
        printArray(arr);
        String []arr2={"ab","b","c","d","e"};
        printArray(arr2);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {
                System.out.print(arr[i]+",");
            }
            else{
                System.out.print(arr[i]+"]");
            }
        }
        System.out.println();

    }
    public static void printArray(String[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
            {
                System.out.print(arr[i]+",");
            }
            else{
                System.out.print(arr[i]+"]");
            }
        }
        System.out.println();

    }
}
