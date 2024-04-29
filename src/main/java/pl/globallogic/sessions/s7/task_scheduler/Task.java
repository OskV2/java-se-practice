package pl.globallogic.sessions.s7.task_scheduler;

import java.util.Objects;

public class Task implements Comparable<Task>{
    private String taskName;
    private TaskPriority priority;

    public Task(String taskName, TaskPriority priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public void complete() {
        System.out.printf("Task '%s' has been completed! %n", this.taskName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskName, task.taskName) && priority == task.priority;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.priority.ordinal(), o.priority.ordinal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", priority=" + priority +
                '}';
    }
}
