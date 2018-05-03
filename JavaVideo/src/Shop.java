import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    public static void main(String[] args)
    {
        ArrayList<FruitItem> array=new ArrayList<FruitItem>();
        init(array);
       // System.out.println(array);
        while(true)
        {
            System.out.println();

            mainManu();
            int choose=chooseFunction();
            switch (choose)
            {
                case 1:
                    showFruitList(array);
                    break;
                case 2:
                    addFruit(array);
                    break;
                case 3:
                    deleteFruit(array);
                    break;
                case 4:
                    updateFruit(array);
                    break;
                case 5:
                    System.out.println("选择的是退出功能");
                    System.out.println("退出成功!");
                    return ;
                default:
                    break;
            }
        }

    }
    public static void init(ArrayList<FruitItem>array)
    {
        FruitItem f1=new FruitItem();
        f1.ID=9527;
        f1.name="老婆饼";
        f1.price=12.3;
        FruitItem f2=new FruitItem();
        f2.ID=9003;
        f2.name="光光饼";
        f2.price=13.3;
        FruitItem f3=new FruitItem();
        f3.ID=9537;
        f3.name="绿豆饼";
        f3.price=15.3;
        array.add(f1);
        array.add(f2);
        array.add(f3);
    }
    public static void mainManu()
    {
        System.out.println("==========欢迎光临xxx超市=========");
        System.out.println("1.货物清单 2.添加货物  3.删除货物 4.修改货物 5.退出");
        System.out.println("请您输入要操作的序号:");
    }
    public static int chooseFunction()
    {
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    public static void showFruitList(ArrayList<FruitItem>array)
    {
        System.out.println();
        System.out.println("=============商品库存清单==========");
        System.out.println("商品编号    商品名称     商品单价");
        for(int i=0;i<array.size();i++)
        {
            FruitItem item=array.get(i);
            System.out.println(item.ID+"\t\t"+item.name+"\t\t"+item.price);
        }
    }
    public static void addFruit(ArrayList<FruitItem>array)
    {
        System.out.println("您选择的是添加功能:");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入商品编号:");
        int ID=sc.nextInt();
        System.out.println("请输入商品名称:");
        String name=sc.next();
        System.out.println("请输入商品单价:");
        double price=sc.nextDouble();
        FruitItem item=new FruitItem();
        item.ID=ID;
        item.name=name;
        item.price=price;
        array.add(item);
        System.out.println("添加成功!");

    }
    public static void deleteFruit(ArrayList<FruitItem>array)
    {
        System.out.println("您选择的是删除功能:");
        System.out.println("请输入要删除商品的编号:");
        Scanner sc=new Scanner(System.in);
        int ID=sc.nextInt();
        for(int i=0;i<array.size();i++)
        {
            FruitItem item=array.get(i);
            if(item.ID==ID)
            {
                array.remove(i);
                System.out.println("删除成功!");
                return ;
            }

        }
        System.out.println("找不到该编号,删除失败!");

    }
    public static void updateFruit(ArrayList<FruitItem>array)
    {
        System.out.println("选择的是修改功能:");
        System.out.println("请输入要修改的商品编号:");
        Scanner sc=new Scanner(System.in);
        int ID=sc.nextInt();
        for(int i=0;i<array.size();i++)
        {
            FruitItem item=array.get(i);
            if(item.ID==ID)
            {
                System.out.println("请输入新的商品编号:");
                item.ID=sc.nextInt();
                System.out.println("请输入新的商品名称:");
                item.name=sc.next();
                System.out.println("请输入新的商品单价:");
                item.price=sc.nextDouble();
                System.out.println("修改成功!");
                return ;
            }
        }
        System.out.println("找不到输入的编号!修改失败!");
    }
}
