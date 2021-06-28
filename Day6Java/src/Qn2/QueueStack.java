package Qn2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {

	public static void main(String[] args) {
        Queue<Integer> q  = new LinkedList<>();
        for (int i = 5; i < 10; i++)
        q.add(i);
    System.out.println("Elements of queue "
                       + q);
    int removedele = q.remove();
    System.out.println("removed element-"
                       + removedele);

    System.out.println(q);
    int head = q.peek();
    System.out.println("head of queue-"
                       + head);
    int size = q.size();
    System.out.println("Size of queue-"
                       + size);
   }
}


