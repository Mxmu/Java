import java.util.HashMap;
import java.util.Scanner;
//优先级调度算法
public class PriorityTest {

    public static void function() {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Procedure> hash = new HashMap<>();

        Procedure temp1 = new Procedure();
        Procedure temp2 = new Procedure();

        System.out.println("请输入进程个数：");
        int num = sc.nextInt();
        Procedure p[] = new Procedure[num]; //创建含有num 个进程的数组
        double startTime[] = new double[num]; //创建优先级数组，存放进程优先级
        double average = 0; //平均作业周转时间
        double sum = 0;
        String str[] = new String[num];
        String str2;
        System.out.println("进程名\t" + "优先级(0-5)\t" + "进入内存时间(单位/小时)\t" + "运行时间(单位/小时)\t");
        int sign = 0;

        for(int i = 0;i < num;i ++) {
            p[i] = new Procedure();
            p[i].procedureName = sc.next();
            str[i] = p[i].procedureName;
            hash.put(p[i].procedureName, p[i]);
            p[i].priority = sc.nextInt();
            p[i].startTime = sc.nextDouble();
            startTime[i] = p[i].startTime;
            p[i].runTime = sc.nextDouble();
        }

        for(int i = 0;i < startTime.length - 1; i++) {
            sign ++;
            if(i < startTime.length - 1) {
                if(startTime[i] < startTime[i + 1]) {
                    if(i == 0) {
                        p[i].terminalTime = p[i].startTime + p[i].runTime;
                    } else if(p[i - 1].terminalTime < p[i].startTime) {
                        p[i].terminalTime = p[i].startTime + p[i].runTime;
                    } else if(p[i - 1].terminalTime >= p[i].startTime)
                    {
                        p[i].terminalTime = p[i - 1].terminalTime + p[i].runTime;
                    }
                } else if(startTime[i] == startTime[i + 1])
                {
                    if(p[i].priority > p[i + 1].priority) {
                        temp1 = p[i + 1];
                        p[i + 1] = p[i];
                        p[i] = temp1;

                        str2 = str[i + 1];
                        str[i + 1] = str[i];
                        str[i] = str2;
                    }
                    if(i == 0) {
                        p[i].terminalTime = p[i].startTime + p[i].runTime;
                    } else if(sign < startTime.length - 1)
                    {
                        if(p[i - 1].terminalTime < p[i].startTime) {
                            p[i].terminalTime = p[i].startTime + p[i].runTime;
                        } else if(p[i - 1].terminalTime >= p[i].startTime)
                        {
                            p[i].terminalTime = p[i - 1].terminalTime + p[i].runTime;
                        }
                    } else if(sign == startTime.length - 1) {
                        if(p[sign - 1].terminalTime < p[sign].startTime) {
                            p[sign].terminalTime = p[sign].startTime + p[sign].runTime;
                        } else if(p[sign - 1].terminalTime >= p[sign].startTime) {
                            p[sign].terminalTime = p[sign - 1].terminalTime + p[sign].runTime;
                        }
                    }
                }
            }
        }
        if(sign == 0) {
            p[sign].terminalTime = p[sign].startTime + p[sign].runTime;
        } else if(sign == startTime.length - 1)
        {
            if(p[sign - 1].terminalTime > p[sign].startTime) {
                p[sign].terminalTime = p[sign - 1].terminalTime + p[sign].runTime;
            } else
            {
                p[sign].terminalTime = p[sign].startTime + p[sign].runTime;
            }
        }
        for(int i = 0;i < num;i ++) {
            sum += p[i].terminalTime - p[i].startTime;
        }
        average = sum / num;
        System.out.println("--------------------------------------------------------------");
        System.out.println("进程名\t" + "优先级\t" + "进入内存时间(单位/小时)\t" + "运行时间(单位/小时)\t" + "结束时间(单位/小时)\t");
        for(int i = 0;i < num;i ++) {
            temp2 = hash.get(str[i]);
            System.out.println(temp2.procedureName + "\t" + temp2.priority + "\t" +
                    temp2.startTime + "\t" + "\t" + "\t" + temp2.runTime +
                    "\t"+ "\t" + temp2.terminalTime);
        }
        System.out.println("平均作业周转时间：" + average);
        sc.close();
    }

    public static void main(String[] args) {
        PriorityTest test = new PriorityTest();
        test.function();
    }
}