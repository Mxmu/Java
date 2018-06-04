package 第二次上机.第二题;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：教材71页15题，增加以下内容：同时要求用选择排序、冒泡排序、插入排序实现，分别用不同的函数实现，在实现时写一个排序类，
 * 该类的数据成员包括一个待排序的数组，用不同的函数成员实现不同的排序，在主函数中进行测试。
 */
public class Sort {
    public static void ChooseSort(int[]a,int size)
    {
        int minIndex=0;
        int temp=0;
        if((a==null)||(size==0))
            return;
        for(int i=0;i<size-1;i++)
        {
            minIndex=i;//无序区的最小数据数组下标
            for(int j=i+1;j<size;j++)
            {
                //在无序区中找到最小数据并保存其数组下标
                if(a[j]<a[minIndex])
                {
                    minIndex=j;
                }
            }
            //将最小元素放到本次循环的前端
            temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    }
    public static void BubbleSort(int a[],int size){
        int t;
        for(int i=1;i<size;i++)
            for(int j=0;j<size-i;j++)
                if(a[j]>a[j+1])
                {
                    t=a[j];a[j]=a[j+1];a[j+1]=t;
                }
    }
    public static void InsertSort(int a[],int size) {
        int index;
        int inserter;
        int t;
        for (int i = 1; i < size; i++) {
            inserter = a[i];
            index = i - 1;
            while(index>=0&&a[index]>inserter)
            {
                a[index+1]=a[index];
                index--;
            }
            a[index+1]=inserter;
        }
    }
    public static void main(String[] args)
    {
        int []a={20,10,55,40,30,70,60,80,90,100};
        System.out.println("原数组为:");
        for(int i=0;i<10;i++){
        System.out.print(a[i]+" ");}
        System.out.println();
        System.out.println("用选择排序:");
        ChooseSort(a,10);
        for(int i=0;i<10;i++){
        System.out.print(a[i]+" ");}
        System.out.println();
        System.out.println("用冒泡排序:");
        BubbleSort(a,10);
        for(int i=0;i<10;i++){
        System.out.print(a[i]+" ");}
        System.out.println();
        System.out.println("用插入排序:");
        InsertSort(a,10);
        for(int i=0;i<10;i++){
        System.out.print(a[i]+" ");}
    }
}
