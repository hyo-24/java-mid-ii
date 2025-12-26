package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Shuttle;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t) { // 메서드에서 쓰이는 t의 타입
        T unit = t.out();
        System.out.println("이름 : "+unit.getName()+", HP : "+unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t0) { // 인자의 타입을 알려줌 & 메서드에서 사용할 수 있는 인자의 조건
        BioUnit unit = t0.out();
        System.out.println("이름 : "+unit.getName()+", HP : "+unit.getHp());
    }
}
