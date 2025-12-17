package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else {
                number.add(n);
            }
        }

        System.out.println("출력");
        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i));
            if (i < number.size() - 1) {
                System.out.print(", ");
            }

            /* int result = number.get(i);
            int end = number.size() -1;
            if (i == end) {
                System.out.print(result);
            } else {
                System.out.print(result+", ");
            }*/
        }
    }
}
