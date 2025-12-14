package collection.list;

public class BatchProcessor {

    // private final MyArrayList<Integer> list = new MyArrayList<>(); -> 앞에 추가는 연결 리스트가 더 빠름
    //private final MyLinkedList<Integer> list = new MyLinkedList<>();

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i); // 앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: "+size+", 계산 시간: "+(endTime-startTime)+"ms");
    }
}
