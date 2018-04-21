public class ArrayDemo_5 {
    public static void main(String[] args){
        int[] arr={4,56,7,23,66,24,25};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
