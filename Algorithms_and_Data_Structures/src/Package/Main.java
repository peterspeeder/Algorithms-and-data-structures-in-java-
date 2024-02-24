package Package;

public class Main {
	public static void main(String[] args) {
		  graph_ graph = new graph_(5);
		  graph.addNode(new node_('A'));
		  graph.addNode(new node_('B'));
		  graph.addNode(new node_('C'));
		  graph.addNode(new node_('D'));
		  graph.addNode(new node_('E'));
		  
		  graph.addEdge(0, 1);
		  graph.addEdge(1, 2);
		  graph.addEdge(2, 3);
		  graph.addEdge(2, 4);
		  
		  graph.print();
		
		  System.out.println(" ");
		  
		  //graph.depthFirstSearch(0);
		  graph.breadthFirstSearch(0);	
		  
		  
		  /*
		  algos algorithm = new algos();
		  int[] array = {5, 3, 4, 1, 2};
		  int n = array.length;
		  
		  algorithm.insertion(array, n);
		  
		  for(int i = 0; i < n; i++)
		  {
			  System.out.print(array[i]);
		  }
		  System.out.println();
		  algorithm.binary_search(array, n, 1);
		  */
	}
}
