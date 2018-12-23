package bigScreenGraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class BigScreenGraph {

	Graph  readActMovfile(String inputFile) throws IOException {
		FileReader fr = new FileReader(inputFile);
		BufferedReader br = new BufferedReader(fr);
		String line;
		String tokens[];
		Graph g = new Graph();
		while( (line = br.readLine()) !=null) {
			tokens =line.split("/");
		    g.addNode( tokens[0]);
	        //g.addNode( tokens[1]);
	        //g.addNode( tokens[2]);
	        g.addNeighbor( tokens[0], tokens[1]);
	        g.addNeighbor( tokens[0], tokens[2]);
		}
		br.close();
		/*
		g.displayActMov();
		System.out.println("\n");
		
		g.displayMoviesOfActor("aamir Khan");
		g.displayMoviesOfActor("Sanjay Dutt");
		g.displayMoviesOfActor("Sunil Dutt");
		g.displayActorsOfMovie("sanju");
		g.displayActorsOfMovie("MIB");
		g.findMovieRelation("Dangal","PK");
		g.findMovieRelation("Dangal","Sanju");
		*/
		return g;
		
	} 
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		//System.out.println(currentDir);
		File file = new File("resources/movies.txt");
		BigScreenGraph bsGraph = new BigScreenGraph();
		Graph g=bsGraph.readActMovfile(file.toString());
		g.displayActMov();
		System.out.println("\n");
		
		g.displayMoviesOfActor("aamir Khan");
		g.displayMoviesOfActor("Sanjay Dutt");
		g.displayMoviesOfActor("Sunil Dutt");
		g.displayActorsOfMovie("sanju");
		g.displayActorsOfMovie("MIB");
		g.findMovieRelation("Dangal","PK");
		g.findMovieRelation("Dangal","Sanju");

	}

}