package bigScreenGraph;
import java.util.*;
import java.util.Map.Entry;
 

public class Graph {
	// symbol table: key = string vertex, value = set of neighboring vertices
	Map<String, LinkedList<String>> adj;
	int v;
	
	
	public Graph() {
        adj = new HashMap<String, LinkedList<String>>();
    }
	
	public void addNode(String node) {
		adj.putIfAbsent(node,new LinkedList<String>());
	}
	
	public void addNeighbor(String v1,String v2) {
		adj.get(v1).add(v2);
	}
	
	public List<String> getNeighbors(String v){
		return adj.get(v);
	}
	
	public void displayActMov(){
        Iterator iterator = adj.keySet().iterator();

        while (iterator.hasNext()) {
           String key = iterator.next().toString();
           LinkedList<String> value = adj.get(key); 
           System.out.println(key + " " + value);
           //System.out.println(key + " " + value.size());
        }
    }
	
	void displayMoviesOfActor(String actor) {
		Iterator iterator = adj.keySet().iterator();
		Integer flag = null;
        while (iterator.hasNext()) {
           String key = iterator.next().toString();
           LinkedList<String> value = adj.get(key); 
           for(int i=0; i< value.size();i++){
        	   		if( (  value.get(i).toUpperCase().trim().contains(actor.trim().toUpperCase())  ) ) {
        	   			flag=1; 
        	   			System.out.println(value.get(i).trim()+" --> "+ key);
        	   		}
           }
        }
        if(flag==null)
    	   	System.out.println(actor+" doesn't have any movie ");		
	}

	void displayActorsOfMovie(String movie) {
		Iterator iterator = adj.keySet().iterator();
		Integer flag = null;
        while (iterator.hasNext()) {        	   
           String key = iterator.next().toString();
           LinkedList<String> value = adj.get(key); 
           if(key.toUpperCase().trim().contains(movie.toUpperCase().trim())) {
        	   flag=1;
        	   System.out.println(key + "--->" + value);
           }       	   		
        }
        if(flag==null)
    	   	System.out.println("Movie "+ movie+" doesn't exist ");	
	}
	
	public void findMovieRelation(String node1, String node2) {
		Iterator iterator = adj.keySet().iterator();
		Integer flag=null;
		LinkedList<String> value1 = null;
		LinkedList<String> value2=null ;
		boolean exist = false;
		while (iterator.hasNext() && !exist ) {        	   
	           String key = iterator.next().toString();           
	           if(key.toUpperCase().trim().contains(node1.toUpperCase().trim())) {
	        	   value1 = adj.get(key); 
	           }
	           else if (key.toUpperCase().trim().contains(node2.toUpperCase().trim())) {
	        	   	value2 = adj.get(key); 
	           }
	    }
		 
		for(int i =0 ;i<value1.size();i++) {
			for(int j=0;j<value2.size();j++) {
				if(value1.get(i).trim().contains(value2.get(j).trim())) {
					flag=1;
					System.out.println(node1+" and " + node2 +" has common actor:" + value2.get(j));
				}
			}
		}
		if(flag==null)
			System.out.println(node1+" and " + node2 +" has no common actor");
	}
	
	

	
}