package cn.itcase.hotel;

public class ChuShi extends Employee implements VIP {
    public ChuShi(){}
    public ChuShi(String name,String id)
    {
        super(name,id);
    }
    public void work()
    {
        System.out.println("初始在炒菜");
    }
    public void services()
    {
        System.out.println("厨师做菜加量");
    }


}
