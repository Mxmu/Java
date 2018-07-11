import java.util.ArrayList;

public class MethodTest {

    public void BubbleSort(ArrayList<MemoryTest> array) {
        System.out.println("将存储块大小进行排序之后：");
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = i; j < array.size(); j++) {
                if (array.get(i).memorySize > array.get(j).memorySize) {
                    Object obj = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, (MemoryTest) obj);
                }
            }
        }
    }

    public static void Output(ArrayList<MemoryTest> array2) { // 输出
        System.out.println("\t存储块名\t存储大小\t存储状态");
        for (int i = 0; i < array2.size(); i++) {
            System.out.println(
                    "\t" + array2.get(i).memoryName + "\t" + array2.get(i).memorySize + "\t" + array2.get(i).station);
        }
    }

}
