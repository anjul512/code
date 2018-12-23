package bigScreenGraph1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graphs {
	Map<String, LinkedList<String>> adj;
	int v;
	
	
	public Graphs(int v) {
		this.v=v;
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
	
	public void getKeyValuePairs(){
        Iterator iterator = adj.keySet().iterator();

        while (iterator.hasNext()) {
           String key = iterator.next().toString();
           LinkedList<String> value = adj.get(key); 
           System.out.println(key + " " + value);
        }
    }
}