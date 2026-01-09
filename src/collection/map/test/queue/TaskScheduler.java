package collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> server = new ArrayDeque<>();

    public void addTask(Task task) {
        server.offer(task);
    }

    public int getRemainingTasks() {
        return server.size();
    }

    public void processNextTask() {
       Task task = server.poll(); // 조회가 아니라 꺼내는거라서 다 꺼내면 null된다.
        if (task != null) {
            task.execute();
        }
    }
}
