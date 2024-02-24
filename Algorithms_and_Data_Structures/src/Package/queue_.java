package Package;
import java.util.*;

public class queue_ {
	
	
  /*
   * To add or Enqueue, offer()
   * To remove or Dequeue, poll()
   * 
   * Higher priority is first
   * 
   * First in, First out
   * 
   */
	
	
	public static void main(String[] args) {
	  Queue<String> queue = new LinkedList<String>();
	  
	  queue.offer("Spongebob");
	  queue.offer("Patrick");
	  queue.offer("Squidward");
	  
	  System.out.println(queue.size());
	  System.out.println(queue);
	  
	  queue.poll();
	  
	  System.out.println(queue); 
	  
	  
	  Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder()); // will sort
	  
	  queue2.offer(3.0);
	  queue2.offer(2.5);
	  queue2.offer(4.0);
	  queue2.offer(1.5);
	  queue2.offer(2.0);
	  
	  while (!queue2.isEmpty()) {
		  System.out.println(queue2.poll());
	  }
	  
	  
	}
	
	
	
}
