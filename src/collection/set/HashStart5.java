package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; // 하나의 연결리스트에
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>(); // 배열마다 또 다른 연결리스트를 하나씩 만들어둔다
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 3);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 나머지 연산 중복! 배열 안에 리스트를 또 넣어둬서 데이터가 겹치지 않고 둘 다 들어간다.
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 10;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);

    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
