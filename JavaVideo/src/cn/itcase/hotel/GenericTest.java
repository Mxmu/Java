package cn.itcase.hotel;

import java.util.ArrayList;
import java.util.Iterator;

/*
将酒店的员工,厨师,服务员,经理,分别存储到3个集合中
定义方法,可以同时遍历3集合,遍历三个集合的同时,可以调用工作方法
 */
public class GenericTest {
    public static void main(String[] args) {
        ArrayList<ChuShi> cs=new ArrayList<ChuShi>();
        ArrayList<FuWuYuan> fwy=new ArrayList<FuWuYuan>();
        ArrayList<JingLi> jl=new ArrayList<JingLi>();
        cs.add(new ChuShi("张三","后厨001"));
        cs.add(new ChuShi("李四","后厨002"));
        fwy.add(new FuWuYuan("哈哈","服务部001"));
        fwy.add(new FuWuYuan("嘻嘻","服务部002"));
        jl.add(new JingLi("小明","董事会001",123));
        jl.add(new JingLi("小红","董事会002",233));
        iterator(cs);
        iterator(fwy);
        iterator(jl);
    }
    /*
    限制
    ? extends Employee 限制的是父类,上限限定,可以传递Employee也可以子类对象
    ? super Employee 限制的是子类,下限限定,可以传递Employee也可以父类对象
     */
    public static void iterator(ArrayList<? extends Employee> array){
        Iterator<? extends Employee> it=array.iterator();
        while(it.hasNext()){
            Employee e=it.next();
            e.work();
        }

    }
}
