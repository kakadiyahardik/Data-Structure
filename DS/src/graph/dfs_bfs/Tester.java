package graph.dfs_bfs;

public class Tester {

	public static void main(String[] args) {
		
		Graph g=new Graph();
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
//		graph.addEdge(0, 1);
//		graph.addEdge(0, 4);
//		graph.addEdge(1, 2);
//		graph.addEdge(1, 3);
//		graph.addEdge(1, 4);
//		graph.addEdge(2, 3);
//		graph.addEdge(3, 4);
		g.print();
		g.dfs(2);
	}

}
