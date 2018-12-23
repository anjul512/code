package bigScreenGraph1;

import java.util.Iterator;


public class DepthFirstSearch {

	public void DepthFirst(Graphs graph ,String source) {
		boolean visited[] = new boolean[graph.v]; 
		//by default visited is all false
		System.out.println(graph.v);
		// Call the recursive helper function to print DFS traversal 
        // starting from all vertices one by one 
		for(int i=0;i<graph.v;i++) {
			System.out.println(source.indexOf(source));
			if(visited[source.indexOf(source)]==false) {
				System.out.println("hello");
				DepthFirstUtil(graph,(String) graph.adj.keySet().toArray()[i],visited);
			}
		}
	}
	public void DepthFirstUtil(Graphs graph ,String v ,boolean visited[]) {
		//mark the current node as visited and print it 
		visited[v.indexOf(v)]=true;
		System.out.println(v + "");
		Iterator<String> iterator = graph.adj.get(v).listIterator();
		//Iterator iterator =  graph.adj.get(v);
		//Repeat it for all the vertices adjacent to this vertex 
		//Iterator<Integer> i = graph.adjListArray[v].listIterator();
		while(iterator.hasNext()) {
			String n = (String) iterator.next();
			if(! visited[n.indexOf(n)])
				DepthFirstUtil(graph,n,visited);
		}
	}
	
}