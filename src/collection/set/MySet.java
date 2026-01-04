package collection.set;

public interface MySet<E> {

    boolean add(E element);

    boolean remove(E value);

    boolean contains(E value);

    // 구현 강제, 하나의 부모로 구현하는 모든 클래스를 다형성으로 활용 가능
}
