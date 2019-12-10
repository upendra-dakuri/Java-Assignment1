package com.omniwyse.assignment4;
import org.junit.Test;



public class TestGraphRepresentation {

		@Test
		public void test() {
			// Create a graph given in the above diagram
			GraphRepresentation g = new GraphRepresentation(4);
			g.addEdge(0, 1);
			g.addEdge(0, 2);
			g.addEdge(1, 2);
			g.addEdge(2, 0);
			g.addEdge(2, 3);
			g.addEdge(3, 3);

			int u = 1;
			int v = 3;
			if (g.isReachable(u, v))
				System.out.println("There is a path from " + u + " to " + v);
			else
				System.out.println("There is no path from " + u + " to " + v);
			;

			u = 3;
			v = 1;
			if (g.isReachable(u, v))
				System.out.println("There is a path from " + u + " to " + v);
			else
				System.out.println("There is no path from " + u + " to " + v);
			System.out.println("");
			
			// printing the BFT traversal
			System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
	           g.BFS(2);
	       	System.out.println("");
	    	System.out.println("");
			// printing the DFT traversal
			System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
			   g.DFS(2);

		}
	}



