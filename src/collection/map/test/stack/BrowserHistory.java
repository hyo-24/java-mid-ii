package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;


public class BrowserHistory {

    private Deque<String> histogy = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String page) {
        if (currentPage != null) {
            histogy.push(currentPage);
        }
        currentPage = page;
        System.out.println("방문: "+page);
    }

    public String goBack() {
        if (!histogy.isEmpty()) {
            currentPage= histogy.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }


}
