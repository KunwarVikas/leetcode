package main.com.kv.datastructures.stackandqueue.priorityblockingqueue;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueComparatorOrderingExample {
    public static void main(String[] args) {
        comparatorOrdering();
    }

    /**
     * Ordering based on Comparator Ordering
     */
    private static void comparatorOrdering() {
        Comparator<Employee> nameSorter = Comparator.comparing(Employee::getEmpName);
        PriorityBlockingQueue<Employee> priorityBlockingQueue = new PriorityBlockingQueue<Employee>(10,nameSorter);
        priorityBlockingQueue.add(new Employee(1231l, "Aditya", LocalDate.now()));
        priorityBlockingQueue.add(new Employee(2432l, "Mike", LocalDate.now()));
        priorityBlockingQueue.add(new Employee(9999l, "Robert", LocalDate.now()));
        priorityBlockingQueue.add(new Employee(3213l, "George", LocalDate.now()));
        priorityBlockingQueue.add(new Employee(5634l, "Ravi", LocalDate.now()));
        priorityBlockingQueue.add(new Employee(6123l, "Sheldon", LocalDate.now()));
        priorityBlockingQueue.add(new Employee(321l, "Penny", LocalDate.now()));
        priorityBlockingQueue.add(new Employee(8723l, "Rachel", LocalDate.now()));
        priorityBlockingQueue.add(new Employee(1964l, "Neha", LocalDate.now()));

        System.out.println("Printing the priority blocking queue in comparator Ordering of name");
        while(priorityBlockingQueue.size()>0)
        {
            Employee e = priorityBlockingQueue.poll();
            System.out.println(e);
        }
    }
}
