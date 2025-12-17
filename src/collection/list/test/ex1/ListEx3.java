package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> box = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        int total = 0;
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else {
                box.add(input);
                total += input;
            }
        }

        double average = (double) total / box.size();
        System.out.println("입력한 정수의 합계: "+total);
        System.out.println("입력한 정수의 평균: "+average);
    }
}
