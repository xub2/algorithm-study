package greedy;

import java.util.*;

public class Until1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int calCount = 0 ;

        //-1을 최대한 적게 해줘야 한다

        while (true) {
            int target = (n / k) * k;
            calCount += (n - target);
            n = target;

            if (n < k) {
                break;
            }

            calCount++;
            n /= k;
        }
        System.out.println(calCount);
    }
}