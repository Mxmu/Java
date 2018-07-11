import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Access {

    Scanner input = new Scanner(System.in);
    MethodTest method = new MethodTest();

    public void mainMethod(String str, Vector<ProcedureTest2> pcbs, ArrayList<MemoryTest> list) {

        while (true) {
            System.out.println("请输入所需操作:");
            System.out.println("1:运行进程");
            System.out.println("2:结束进程");
            System.out.println("3:结束当前算法");
            System.out.print("请输入：");
            int p = input.nextInt();
            if (p == 1) {
                System.out.println("请输入当前要运行的进程名");
                String name = input.next();
                for (int i = 0; i < pcbs.size(); i++) {
                    if (name.equals(pcbs.get(i).procedureName)) {
                        if (str.equals("A")) {
                            for (int j = 0; j < list.size(); j++) {
                                if (list.get(j).memorySize >= pcbs.get(i).procedureSize
                                        && list.get(j).station.equals("空闲")) {
                                    MemoryTest memorys = new MemoryTest();
                                    list.get(j).setStation(name + "正在运行");
                                    double remainder = 0;
                                    remainder = list.get(j).memorySize - pcbs.get(i).procedureSize;
                                    if (remainder != 0) {
                                        list.get(j).setMemorySize(pcbs.get(i).procedureSize);
                                        list.add(j + 1, memorys);
                                        list.get(j + 1).setName("剩余存储块大小");
                                        list.get(j + 1).setMemorySize(remainder);
                                    }
                                    MethodTest.Output(list);
                                    break;
                                }
                            }
                        }

						/*最佳适应算法是从全部空闲区中找出能满足作业要求的、且大小最小的空闲分区的一种计算方法，
						使碎片尽量小。*/

                        else if (str.equals("B")) {
                            MemoryTest memorys = new MemoryTest();
                            double remainder = 100;
                            int ss = -1;
                            for (int j = 0; j < list.size(); j++) {
                                if (list.get(j).memorySize >= pcbs.get(i).procedureSize
                                        && list.get(j).station.equals("空闲")) {
                                    if ((list.get(j).memorySize - pcbs.get(i).procedureSize) < remainder) {
                                        remainder = (list.get(j).memorySize - pcbs.get(i).procedureSize);
                                        ss = j;
                                    }
                                }
                            }
                            if (remainder != -1) {
                                list.get(ss).setStation(name + "正在运行");
                                list.get(ss).setMemorySize(pcbs.get(i).procedureSize);
                                if (remainder != 0) {
                                    list.add(ss + 1, memorys);
                                    list.get(ss + 1).setName("剩余存储块大小");
                                    list.get(ss + 1).setMemorySize(remainder);
                                }
                            }
                            MethodTest.Output(list);
                            break;
                        }

                        //最坏适应分配算法要扫描整个空闲分区或链表，总是挑选一个最大的空闲分区分割给作业使用。

                        else if (str.equals("C")) {
                            MemoryTest memorys = new MemoryTest();
                            double remainder = -1;
                            int ss = -1;
                            for (int j = 0; j < list.size(); j++) {
                                if (list.get(j).memorySize > pcbs.get(i).procedureSize
                                        && list.get(j).station.equals("空闲")) {
                                    if ((list.get(j).memorySize - pcbs.get(i).procedureSize) > remainder) {
                                        remainder = list.get(j).memorySize - pcbs.get(i).procedureSize;
                                        ss = j;
                                    }
                                }

                            }
                            if (ss != -1) {
                                list.get(ss).setStation(name + "正在运行");
                                list.get(ss).setMemorySize(pcbs.get(i).procedureSize);
                                if (remainder != 0) {
                                    list.add(ss + 1, memorys);
                                    list.get(ss + 1).setName("剩余存储块大小");
                                    list.get(ss + 1).setMemorySize(remainder);
                                }
                            }
                            MethodTest.Output(list);
                            break;
                        }
                    }
                }
            } else if (p == 2) {
                System.out.println("请输入要结束的进程名");
                String name = input.next();
                String names = name + "正在运行";
                for (int i = 0; i < list.size(); i++) {
                    if (names.equals(list.get(i).station)) {
                        list.get(i).setStation("空闲");
                        if (list.get(i + 1).memoryName.equals("字存储块")) {
                            list.get(i).memorySize = list.get(i).memorySize + list.get(i + 1).memorySize;
                            list.remove(i + 1);
                        }
                        MethodTest.Output(list);
                        break;
                    }
                }
            } else if (p == 0) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getStation() != "空闲") {
                        list.get(i).setStation("空闲");
                        if (list.get(i + 1).memoryName.equals("字存储块")) {
                            list.get(i).memorySize = list.get(i).memorySize + list.get(i + 1).memorySize;
                            list.remove(i + 1);
                        }
                    }
                }
                break;
            }
        }
    }
}




