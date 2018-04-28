/*逆序的实现思想：数组最远端位置的交换*/
public class ArrayMethodTest_1 {
    public static void main(String[] args)
    {
        int[]arr={1,2,3,4};
        reverse(arr);
        printArray(arr);
    }
    public static void reverse(int[]arr) {
        for (int min = 0, max = arr.length - 1; min < max; max--, min++) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
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
    }

