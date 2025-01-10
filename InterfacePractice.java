/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacepractice;

/**
 *
 * @author edevine2025
 */
public class InterfacePractice {
    public static void main(String[] args) {
        // Create an array of tasks
        Task[] tasks = new Task[] {
            new Task("Do laundry", 3, 5),
            new Task("Write report", 1, 8),
            new Task("Buy groceries", 2, 3),
            new Task("Study for exam", 1, 10),
            new Task("Clean room", 3, 2)
        };

        // Print tasks before sorting
        System.out.println("Tasks before sorting:");
        for(int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);
        }

        // Sort tasks by priority and complexity using Comparable
        java.util.Arrays.sort(tasks);

        // Print tasks after sorting
        System.out.println("\nTasks after sorting by priority, then complexity:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}

// Interface for Priority
interface Priority {
    void setPriority(int priority);
    int getPriority();
}

// Interface for Complexity
interface Complexity {
    void setComplexity(int complexity);
    int getComplexity();
}

// Task class implementing Priority, Complexity, and Comparable
class Task implements Priority, Complexity, Comparable<Task> {
    private String name;          // Name of the task
    private int priority;         // Priority of the task
    private int complexity;       // Complexity of the task

    // Constructor to initialize task details
    public Task(String name, int priority, int complexity) {
        this.name = name;
        this.priority = priority;
        this.complexity = complexity;
    }

    // Implementation of Priority methods
    
    public void setPriority(int priority) {
        this.priority = priority;
    }

    
    public int getPriority() {
        return this.priority;
    }

    // Implementation of Complexity methods
    
    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    
    public int getComplexity() {
        return this.complexity;
    }

    // Implementation of Comparable interface
    
    public int compareTo(Task other) {
        // Compare by priority first
        if (this.priority != other.priority) {
            return Integer.compare(this.priority, other.priority);
        }
        // If priorities are the same, compare by complexity
        return Integer.compare(this.complexity, other.complexity);
    }

    // Override toString for easy printing
    
    public String toString() {
        return "Task[name=" + name + ", priority=" + priority + ", complexity=" + complexity + "]";
    }
}

// Driver class with main method

