package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        // int totalPrice = 0;
        /*for (int i = 0; i < cart.size(); i++) {
            System.out.println("상품명: "+cart.get(i).getName()+", 합계: "+ cart.get(i).getTotalPrice());
            totalPrice += cart.get(i).getTotalPrice();
        }*/
        for (Item item : cart) {
            System.out.println("상품명: "+item.getName()+", 합계: "+item.getTotalPrice());
        }
        System.out.println("전체 가격 합: "+calculateTotalPrice());
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : cart) {
            totalPrice+= item.getTotalPrice();
        }
        return totalPrice;
    }
}
