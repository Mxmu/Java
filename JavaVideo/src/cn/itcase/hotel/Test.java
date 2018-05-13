package cn.itcase.hotel;

public class Test {
    public static void main(String[] args)
    {
        JingLi jl=new JingLi("张三","董事会001",124);
        jl.work();
        FuWuYuan f1=new FuWuYuan("李四","服务部");
        FuWuYuan f2=new FuWuYuan("王五","服务部");
        f1.work();
        f1.services();
        f2.work();
        f2.services();
        ChuShi c1=new ChuShi("11","22");
        ChuShi c2=new ChuShi("12","23");
        c1.work();
        c1.services();
        c2.work();
        c2.services();

    }
}
