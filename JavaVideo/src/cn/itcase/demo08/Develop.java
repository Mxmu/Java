package cn.itcase.demo08;
/*研发员工继承员工类 关键字extends
  子类自动拥有父类中可以继承的属性和方法
  单继承
  java支持多层继承
 */
public class Develop extends Employee{
        public void print()
        {
            System.out.println(name);
        }

}
