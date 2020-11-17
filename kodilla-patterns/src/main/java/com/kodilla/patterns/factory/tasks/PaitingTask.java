package com.kodilla.patterns.factory.tasks;

public class PaitingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaitingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask(String taskname) {
        this.isCompleted.put(taskname, true);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(String taskName) {
        if (isCompleted.containsKey(taskName)) {
            return true;
        }
        return false;
    }
}