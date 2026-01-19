package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>(); // 카드의 순서가 중요하니까 List 사용

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard() { // ✅ 카드를 생성하는 메서드 (핵심)
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) { // 카드 아이콘을 가져와서
                cards.add(new Card(i, suit)); // 하나의 숫자에 4개의 아이콘을 넣어서 카드 생성
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(0);
    }


}
