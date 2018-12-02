package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import graphs.GraphAdjacencyList2.*;
import queues.Queue;

public  class BreadthFirstSearch {
	String color;
	int distance ,parent;
	int restVertices[] ;
	List<Integer> bfsItems = new ArrayList<Integer>();
	
	
	
	public List<Integer> BreadthFirst(Graph graph ,int source) {
		
		boolean visited[] = new boolean[graph.v]; 
		//bydefault visited is all false
		/* 
		for (int j =0;j<graph.v;j++)
			System.out.println("visited " + visited[1]);
		*/
		visited[source]=true; 
		// Create a queue for BFS 
        //LinkedList<Integer> queue = new LinkedList<Integer>();
        Queue que = new Queue(graph.v);     
        	que.enqueue(source);
        	while(!que.isEmpty(que)) {
        		int u = que.dequeue();
        		System.out.println("dequeued is "+ u);   
        		bfsItems.add(u);
        		Iterator<Integer> i = graph.adjListArray[u].listIterator();         		
        		System.out.println("=================");
        		
        		while(i.hasNext()) {
        			int n = i.next(); 
        			System.out.println("next item to:" + u + " is :"+ n + " visited :"+ visited[n]);
                    if (!visited[n]) { 
                        visited[n] = true; 
                        que.enqueue(n);
                    }      			
        			}        			
        		
        		}
        	//System.out.println(bfsItems);
        	return bfsItems;
     }
	   	
}	

