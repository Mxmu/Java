import java.util.HashMap;
import java.util.Scanner;

public class Procedure {

    String procedureName; // 定义进程优先级
    int priority; // 进程优先级
    double startTime; //开始时间
    double runTime; // 运行时间
    double terminalTime;  //结束时间

    public Procedure() {}

    public Procedure(String procedureName, int priority, double startTime, double runtime, double terminalTime) {
        super();
        this.procedureName = procedureName;
        this.priority = priority;
        this.startTime = startTime;
        this.runTime = runtime;
        this.terminalTime = terminalTime;
    }
}







