package graphs;

import java.util.LinkedList;

public class GraphAdjacencyList2 {
	
	static class Graph{
		int v ;
		LinkedList<Integer> adjListArray[];
		//constructor of the graph 
		Graph(int v){
			this.v = v;
			//size of array defined as number of vertices 
			adjListArray = new LinkedList[v];
			
			//create a new list for each vertex to store the adjacent nodes  
			for (int i=0;i<v;i++) {
				adjListArray[i] = new LinkedList<>();
			}			
		}
	}
	
	//add an edge to an undirected graph 
	 static void addEdge(Graph graph,int src,int dest) {
		//add an edge from source to destination
		graph.adjListArray[src].add(dest);
		//since graph is undirected add an edge from destination to source 
		graph.adjListArray[dest].add(src);
	}
	
	// A utility function to print the adjacency list  
    // representation of graph
	 
	 static void showGraph(Graph graph) {
		 for (int v=0 ; v < graph.v ; v++) {
			 System.out.println("Adjacency List for vertex " + v);
			 System.out.println("Print head");
			 for(Integer pCrawl : graph.adjListArray[v]) {
				 System.out.println(" -> " + pCrawl);
			 }
			 System.out.println("\n");
		 }
	 }
}
