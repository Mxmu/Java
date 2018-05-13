package cn.itcase.hotel;

public class JingLi extends  Employee {
    public JingLi(){}
    public JingLi(String name,String id,double money)
    {
        super(name,id);
        this.money=money;
    }
    private double money;
    public double getMonry()
    {
        return money;
    }
    public void setMoney(double money)
    {
        this.money=money;
    }
    public void work()
    {
        System.out.println("管理");
    }


}
