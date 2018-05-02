/*选择排序:数组的每个元素都进行比较
  冒泡排序:数组的相邻元素进行比较
 */
public class ArrayMethodTest_2 {
    public static void main(String[] args)
    {
        int[] arr={2,3,1,4,2,3,-6,0,4};
        selectSort(arr);
        printArray(arr);
    }
    public static void selectSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[])
    {
        System.out.print("[");
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
                System.out.print(arr[i]+",");
            else System.out.println(arr[i]+"]");
        }
    }
}
