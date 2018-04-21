import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

public class ArrayArrayDemo_3 {
    public static void main(String[] args){
        int [][] arr={{11,12},{21,22,23},{31,32,33,34}};
        int sum=0;
        int groupSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                groupSum+=arr[i][j];
            }
            System.out.println("每个小组总金额"+groupSum);
            sum+=groupSum;
            groupSum=0;
        }
        System.out.println("本公司总金额="+sum);
    }
}
