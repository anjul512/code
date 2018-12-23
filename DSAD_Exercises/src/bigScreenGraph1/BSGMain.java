package bigScreenGraph1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class BSGMain {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		int v =14;
		File inputFile = new File("resources/movies.txt");
		FileReader fr = new FileReader(inputFile);
		BufferedReader br = new BufferedReader(fr);
		String line;
		String tokens[];
		Graphs g = new Graphs(v);
		while( (line = br.readLine()) !=null) {
			tokens =line.split("/");
		    g.addNode( tokens[0]);
	        //g.addNode( tokens[1]);
	        //g.addNode( tokens[2]);
	        g.addNeighbor( tokens[0], tokens[1]);
	        g.addNeighbor( tokens[0], tokens[2]);
		}
		br.close();
		g.getKeyValuePairs();
		DepthFirstSearch dfs1 = new DepthFirstSearch();
		dfs1.DepthFirst(g, "Dangal");
}
}