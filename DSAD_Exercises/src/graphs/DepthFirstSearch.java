package graphs;

import java.util.Iterator;

import graphs.GraphAdjacencyList2.*;
import queues.Queue;

public class DepthFirstSearch {

	public void DepthFirst(Graph graph ,int source) {
		boolean visited[] = new boolean[graph.v]; 
		//by default visited is all false
		
		// Call the recursive helper function to print DFS traversal 
        // starting from all vertices one by one 
		for(int i=0;i<graph.v;i++) {
			if(visited[i]==false) {
				DepthFirstUtil(graph,i,visited);
			}
		}
	}
	
	public void DepthFirstUtil(Graph graph ,int v ,boolean visited[]) {
		//mark the current node as visited and print it 
		visited[v]=true;
		System.out.println(v + "");
		
		//Repeat it for all the vertices adjacent to this vertex 
		Iterator<Integer> i = graph.adjListArray[v].listIterator();
		while(i.hasNext()) {
			int n = i.next();
			if(! visited[n])
				DepthFirstUtil(graph,n,visited);
		}
	}
}