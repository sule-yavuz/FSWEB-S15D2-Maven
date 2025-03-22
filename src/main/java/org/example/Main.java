package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("ProjectA", "Fix bug #123", "Ann", Priority.HIGH, Status.ASSIGNED);
        Task task2 = new Task("ProjectB", "Implement feature X", "Bob", Priority.MED, Status.IN_PROGRESS);
        Task task3 = new Task("ProjectC", "Write tests", "Carol", Priority.LOW, Status.IN_QUEUE);
        Task task4 = new Task("ProjectD", "Refactor code", "Ann", Priority.HIGH, Status.IN_PROGRESS);
        Task task5 = new Task("ProjectE", "Deploy update", null, Priority.MED, Status.IN_QUEUE);

        Set<Task> annsTasks = new HashSet<>(Set.of(task1, task4));
        Set<Task> bobsTasks = new HashSet<>(Set.of(task2));
        Set<Task> carolsTasks = new HashSet<>(Set.of(task3));
        Set<Task> unassignedTasks = new HashSet<>(Set.of(task5));

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);

        System.out.println("All tasks: " + taskData.getTasks("all"));
        System.out.println("Ann's tasks: " + taskData.getTasks("ann"));
        System.out.println("Bob's tasks: " + taskData.getTasks("bob"));
        System.out.println("Carol's tasks: " + taskData.getTasks("carol"));
        System.out.println("Unassigned tasks: " + unassignedTasks);
    }
}
