package JavaCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public void printQueue(){
        Queue queue = new LinkedList();
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
}
