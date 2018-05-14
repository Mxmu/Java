package cn.itcase.demo45;

public class Person {
    private String name;
    private int age;
    public boolean equals(Object obj){
        //参数obj接受到是Person对象才能转型
        //对obj参数进行类型的向下转型,obj转成Person类型
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(obj instanceof Person) {
            Person p = (Person) obj;
            return this.age == p.age;
        }
        return false;
    }
    public String toString(){
        return name+age;
    }
    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
