/*二分查找法:折半
  前提：被查找数组中的元素必须有序排列
 */
public class ArrayMethodTest_4 {
    public static void main(String[] args)
    {
        int []arr={1,2,3,4,6,9,11};
        int i=binarySearch(arr,10);
        System.out.println(i);
    }
    public static int binarySearch(int []arr,int key)
    {
        int min=0;
        int max=arr.length-1;
        int mid=0;
        while(min<=max)
        {
            mid=(min+max)/2;
            if(key<arr[mid])
            { max=mid-1; }
            else if(key>arr[mid])
            { min=mid+1; }
            else return mid;
        }
        return -1;
    }
}
