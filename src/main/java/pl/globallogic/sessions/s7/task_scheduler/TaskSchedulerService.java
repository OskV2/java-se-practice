package pl.globallogic.sessions.s7.task_scheduler;

import java.util.Queue;

public class TaskSchedulerService {

    private Queue<Task> tasks;

    public TaskSchedulerService(Queue<Task> tasks) {
        this.tasks = tasks;
    }

    public void scheduleTask(Task task) {
        tasks.offer(task);
        System.out.printf("'%s' has been scheduled %n", task.getTaskName());
    }

    public void processTasks() {
        while(!tasks.isEmpty()) {
            tasks.poll().complete();
        }
        System.out.println("All tasks have been processed");
    }
}
