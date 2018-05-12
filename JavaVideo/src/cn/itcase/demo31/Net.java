package cn.itcase.demo31;

public class Net extends Maintainer {
    public Net(String name,String id)
    {
        super(name,id);
    }
    public void work()
    {
        System.out.println(getName()+"..."+getId()+"...检查网络");
    }
}
