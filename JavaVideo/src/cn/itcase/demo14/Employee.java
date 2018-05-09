package cn.itcase.demo14;
/*所有子类的共性抽取

 */
public abstract class Employee {
    private String name;
    private String Id;
    public abstract void work();
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(String Id)
    {
        this.Id=Id;
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return Id;
    }
}
