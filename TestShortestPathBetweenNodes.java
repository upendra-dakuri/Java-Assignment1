package com.omniwyse.assignment4;
import org.junit.Test;

public class TestShortestPathBetweenNodes {


	


		@Test
		public void test() {
			/* Let us create the example graph discussed above */
			int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
				                          { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
					                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
					                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
					                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
					                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
					                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
					                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
					                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
			ShortestPathBetweenNodes t = new ShortestPathBetweenNodes();
			t.dijkstra(graph, 0);
		}

	}



