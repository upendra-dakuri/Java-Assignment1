package com.omniwyse.assignment4;
import org.junit.Test;

public class TestMinimumSpanningTree {

	@Test
		public void test() {
			int V = 4; // Number of vertices in graph
			int E = 5; // Number of edges in graph
			MininumSpanningOfTree graph = new MininumSpanningOfTree(V, E);

			// add edge 0-1
			graph.edge[0].src = 0;
			graph.edge[0].dest = 1;
			graph.edge[0].weight = 10;

			// add edge 0-2
			graph.edge[1].src = 0;
			graph.edge[1].dest = 2;
			graph.edge[1].weight = 6;

			// add edge 0-3
			graph.edge[2].src = 0;
			graph.edge[2].dest = 3;
			graph.edge[2].weight = 5;

			// add edge 1-3
			graph.edge[3].src = 1;
			graph.edge[3].dest = 3;
			graph.edge[3].weight = 15;

			// add edge 2-3
			graph.edge[4].src = 2;
			graph.edge[4].dest = 3;
			graph.edge[4].weight = 4;

			graph.KruskalMST();

		}

	}


