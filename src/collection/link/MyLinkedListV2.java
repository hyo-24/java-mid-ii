package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object object) {
        Node newNode = new Node(object);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next; // 다음 노드로 넘어가기
        }
        return x;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 추가 코드
    public void add(int index, Object object) {
        Node newNode = new Node(object);
        if (index == 0) {
            newNode.next = first; // 새로운 노드에 현재 인덱스 0 인 노드 참조값을 넣어줌
            first = newNode; // 처음 노드를 새로운 노드로 변경해줌
        } else {
            Node prev = getNode(index - 1); // 직전의 노드를 가져옴
            newNode.next = prev.next; // 직전의 노드가 가진 next 를 새로운 노드에 넣어줌
            prev.next = newNode; // 이전의 노드 next 값을 새로운 노드 참조값으로 변경
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.next;
        x.item = element;
        return oldValue;
    }

    // 추가 코드
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next; // 다음 노드를 첫번쨰 노드로 변경
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)){
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1 {" +
                "first = " + first +
                ", size = " + size +
                '}';
    }
}
