package collection.map.test;

import java.util.*;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> dictionary = new HashMap<>();

        System.out.println("==단어 입력 단계==");

        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String word = scanner.nextLine();
            if (word.equals("q")) {
                break;
            }else {
                System.out.print("한글 뜻을 입력하세요: ");
                String mean = scanner.nextLine();
                dictionary.put(word, mean);
            }
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String word = scanner.nextLine();
            if (word.equals("q")) {
                break;
            }
            if (dictionary.containsKey(word)) {
                String koreanMean = dictionary.get(word);
                System.out.println(word+"의 뜻: "+koreanMean);
            } else {
                System.out.println(word+"은(는) 사전에 없는 단어입니다.");
            }
        }
        /*
        key로 값 찾을 때는 get(key)로 찾고, 값으로 뭔가 찾을 때는 순회가 필요하다.
        Map은 key 기준 자료구조라서 value는 인덱스도 해시도 없다.
        하나만 찾을 때 : getValue().equals()
        여러 개 찾을 때 : List 를 만들어서 getValue().equals() 가 참이면 getKey() 로 리스트에 add

        String value = map.get(key); 로 값을 반환한다는 걸 기억하기!
         */
    }
}
