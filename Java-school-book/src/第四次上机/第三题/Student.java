package 第四次上机.第三题;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：
 * 建立学生Student接口，包含方法查询学号方法void get_Snumber()
 * 和查询班级方法void get_Class(),建立Teacher接口，包含方法查询
 * 工号方法void get_Wnumber()和查询工资方法void get_Salary(),
 * 建立一个在职研究生类Poststudent，实现这两个接口。最后建立一个
 * 测试类MyTest, 该类中包含主函数，测试接口回调。
 */
public interface Student {
    void get_Snumber();
    void get_Class();
}
