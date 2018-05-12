package cn.itcase.demo31;

public class JavaEE extends Developer {
    public JavaEE(String name,String id)
    {
        super(name,id);
    }
    public void work()
    {
        System.out.println(getName()+"..."+getId()+"...在开发淘宝");
    }

}
