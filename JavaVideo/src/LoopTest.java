public class LoopTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) sum += i;
        }
        System.out.println(sum);
        System.out.println();
        sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);

    }
}
