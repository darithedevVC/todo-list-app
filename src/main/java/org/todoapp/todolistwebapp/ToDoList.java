/**
 * This class is the ToDoList class that manages adding, deleting, and retrieving
 * tasks for a simple ToDo List Console program.
 *
 * @author Darimar Caceres
 */

package org.todoapp.todolistwebapp;

import jakarta.persistence.*;
import java.util.List;

public class ToDoList {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private static final EntityManager em = emf.createEntityManager();

    /**
     * Adds a descriptive task to the list
     */
    public static void add(String task) {
        Task taskToAdd = new Task(task);

        em.getTransaction().begin();
        em.persist(taskToAdd);
        em.getTransaction().commit();
    }

    /**
     * Deletes a task from the list by index number
     */
    public static void delete(int index) {
        Task taskToDelete = em.find(Task.class, index);

        if (taskToDelete != null) {
            em.getTransaction().begin();
            em.remove(taskToDelete);
            em.getTransaction().commit();
        } else
            System.out.println("Task not found");
    }

    /**
     * Retrieves the ToDo List
     * @return ToDo List
     */
    public static List<Task> getList() {
        return em.createQuery("SELECT t FROM Task t", Task.class).getResultList();
    }

    public static void deleteAllTasks() {
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Task t").executeUpdate();
        em.createNativeQuery("ALTER TABLE task AUTO_INCREMENT = 1").executeUpdate();
        em.getTransaction().commit();
    }

    public static void close() {
        if (em.isOpen()) em.close();
        if (emf.isOpen()) emf.close();
    }
}
