package pl.globallogic.sessions.s7.task_scheduler;

import java.util.ArrayDeque;

public class TaskSchedulerDemo {
    public static void main(String[] args) {
        TaskSchedulerService schedulerService = new TaskSchedulerService(new ArrayDeque<>());

        schedulerService.scheduleTask(new Task("Complete Java programming exercises", TaskPriority.HIGH));
        schedulerService.scheduleTask(new Task("Watch Java course videos", TaskPriority.LOW));
        schedulerService.scheduleTask(new Task("Participate in discussion", TaskPriority.MEDIUM));

        schedulerService.processTasks();
    }
}