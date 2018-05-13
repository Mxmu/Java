package cn.itcase.interfaces;

public class GetSmoking {
    /*接口不能创建对象，return语句后面返回的是他实现类的对象*/
    public Smoking getSmoking()
    {
        return new Student();
        }
    }

