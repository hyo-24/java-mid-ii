package collection.map.test;

import java.util.*;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성
        Map<String, Integer> productMap = new HashMap<>(); // ➡️ 먼저 map을 만들고
        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1])); // ➡️ put() 메서드로
        }

        // Map의 모든 데이터 출력
        for (String key : productMap.keySet()) { // ➡️ 키로 찾아서
            System.out.println("제품: "+key+", 가격: "+productMap.get(key)); // ➡️ 해당하는 entry 를 get() 메서드로 가져온다.
        }
        /* ⚠️ key를 이미 알고 있으면 Iterator 가 없어도 된다. Iterator 는 순회중에 수정도 가능하지만 for-each 는 CME(예외) 가 발생 ‼️
              더 복잡한 제어/삭제 = Iterator, 단순 조회/출력 = for-each
         */
    }
}
