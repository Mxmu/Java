/*提高安全问题:让外面的类，不允许直接调用我的成员变量
  新的关键字 private 私有 属于成员修饰符，不能修饰局部变量
  被private修饰的成员，只能在自己的本类中被使用
  对私有变量，提供公共的访问方式：方法
 */
package cn.itcase.demo04;

public class PersonTest {
    public static void main(String[] args)
    {
        Person p=new Person();
        //p.age=20;
        //只能调用set方法赋值
        p.setAge(1000);
        p.name="张三";
        p.speak();
        System.out.println(p.getAge());
    }
}
