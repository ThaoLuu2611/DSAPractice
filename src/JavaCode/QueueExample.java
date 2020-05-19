package JavaCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    //Two class implement Queue interface: LinkedList and PriorityQueue
/*    add ,offer(return false if cannot add)
    remove/poll (return null if cannot remove)
    element/peek*/
    public void printQueue(){
        Queue<Integer> queue = new LinkedList();
        queue.add(24);
        queue.add(2353);
        queue.add(53);
        while(!queue.isEmpty()){
            var x = queue.remove();
            System.out.println(x);
        }
        queue.add(24);
        queue.add(2353);
        queue.add(53);
        Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.println(" i = "+iterator.next());
        }
    }

    public void printPriorityQueue(){
        Queue<Integer> priorityQueue = new PriorityQueue();
        priorityQueue.add(34);
        priorityQueue.add(2);
        priorityQueue.add(1);
/*        priorityQueue.add(32431);
        priorityQueue.add(234);
        priorityQueue.add(10);
        priorityQueue.add(3243);
        priorityQueue.add(32431);
        priorityQueue.add(32431);
        priorityQueue.add(32431);
        priorityQueue.add(45);*/
        priorityQueue.forEach(
                x -> System.out.println("x = "+x)
        );

        System.out.println("System.out.println first element = "+priorityQueue.peek());

    }

}
