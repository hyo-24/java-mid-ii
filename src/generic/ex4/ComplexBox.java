package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> { // T는 반드시 Animal 이거나, Animal의 자식 클래스여야 한다.

    private T animal;

    public void set(T t) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) { // <T> 는 메서드에서 사용할 타입을 선언한 것! T는 반환타입!
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        return t;
    }
}
