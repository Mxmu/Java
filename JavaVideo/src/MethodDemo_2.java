public class MethodDemo_2 {//方法不能定义在另一个方法内
    public static void main(String[] args){
        print();
    }
    public static int  print(){//方法返回值是void，方法中可以省略return不写
        return 1 ;              //方法返回值类型和return后面数据类型必须匹配
    }
}
