import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Test {
    private static Scanner input;

    public static void main(String args[]) {
        Vector<ProcedureTest2> pcbs = new Vector<ProcedureTest2>();
        System.out.println("请输入进程数：");
        input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            ProcedureTest2 pcb = new ProcedureTest2();
            System.out.println("请输入第" + (i + 1) + "个进程的名字/运行所占内存用空格隔开");
            pcb.procedureName = input.next();
            pcb.procedureSize = input.nextDouble();
            pcbs.add(pcb);
        }
        System.out.println("请定义存储块数，并为他们分配区间：");
        int m = input.nextInt();
        ArrayList<MemoryTest> list = new ArrayList<MemoryTest>();
        for (int i = 0; i < m; i++) {
            MemoryTest nck = new MemoryTest();
            System.out.println("请输入第" + (i + 1) + "个存储块的存储名和存储大小：");
            nck.memoryName = input.next();
            nck.memorySize = input.nextInt();
            list.add(nck);
        }
        while (true) {
            System.out.println("选择要采用的适配方法：");
            System.out.println("  A:最先适应法");
            System.out.println("  B:最佳适应法");
            System.out.println("  C：最坏适应法");
            String str = input.next();
            MethodTest methid = new MethodTest();
            if (str.equals("A")) {
                methid.BubbleSort(list);
                MethodTest.Output(list);
                Access access = new Access();
                access.mainMethod(str, pcbs, list);
            } else if (str.equals("B")) {
                MethodTest.Output(list);
                Access access = new Access();
                access.mainMethod(str, pcbs, list);

            } else if (str.equals("C")) {
                MethodTest.Output(list);
                Access access = new Access();
                access.mainMethod(str, pcbs, list);
            }
        }
    }
}
