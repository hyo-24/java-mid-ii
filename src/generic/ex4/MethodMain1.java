package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10; // 이 코드를 보고 i 가 Integer 인걸 컴파일러가 추론 가능하다.
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
    }
}
