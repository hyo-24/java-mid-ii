package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

    public void add(Object object) {
        Node newNode = new Node(object);
        if (first == null) { // 마지막 노드면
            first = newNode; // 새로운 데이터를 넣은 노드를 현재 위치에 넣어두고
        } else {
            Node lastNode = getLastNode(); // 마지막 노드가 아니면 마지막 노드를 가져와서
            lastNode.next = newNode; // 새로 만든 노드의 참조값을 마지막 노드의 next 에 넣어준다.
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

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.next;
        x.item = element;
        return oldValue;
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
