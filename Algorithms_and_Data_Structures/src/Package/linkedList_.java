package Package;
import java.util.*;

public class linkedList_ {
	public static void main(String[] args) {
	  LinkedList<String> linkedList = new LinkedList<String>();
	  
	  linkedList.push("A");		// Head
	  linkedList.push("B");
	  linkedList.push("C");
	  linkedList.push("D");
	  linkedList.push("F");		// Tail
	  
	  //linkedList.pop(); 		// remove last
	  //linkedList.poll();		// remove first
	  System.out.println(linkedList);
		  
	}
  
}
