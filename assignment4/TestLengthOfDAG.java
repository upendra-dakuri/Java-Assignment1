package com.omniwyse.assignment4;
import org.junit.Test;

public class TestLengthOfDAG {
	


	

	public class TestLengthOfTheDAG {

		@Test
		public void test() {
			int n = 5;
			LengthOfDAG graph = new LengthOfDAG(n);

			graph.addEdge(1, 2);
			graph.addEdge(1, 3);
			graph.addEdge(3, 2);
			graph.addEdge(2, 4);
			graph.addEdge(3, 4);
			graph.findLongestPath(n);
			System.out.println(graph.findLongestPath(n));

		}

	}


}
