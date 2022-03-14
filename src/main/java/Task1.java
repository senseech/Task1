import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();

        boolean flag = false;
        int temp = 1;

        while (!flag) {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            for (int i = 1; i <= m; i++) {

                while (temp > n) {
                    temp -= n;
                }
                arrayList1.add(temp);
                if (i != m) {
                    temp += 1;
                }

            }
            System.out.print(arrayList1.get(0));
            if (arrayList1.get(arrayList1.size() - 1) == 1) {
                flag = true;
            }
        }
    }
}
