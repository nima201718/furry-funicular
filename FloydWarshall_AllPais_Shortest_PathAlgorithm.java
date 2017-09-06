/*
 Created and developed by  :
 
 nima.nima.2008@gmail.com
 Base source : geeksforgeeks.org
 
 
 */

public class FloydWarshall_AllPais_Shortest_PathAlgorithm {

	static final int INFINITVE = 99999;
	static int V = 5;
	static final int Distance[][] = new int[V][V];
	static final int Path[][] = new int[V][V];
	static final int Middle = 0;

	public static void FloydWarshall(int graph[][]) {

		int i, j, k;
		for (i = 0; i < V; i++)
			for (j = 0; j < V; j++)
				Distance[i][j] = graph[i][j];

		for (k = 0; k < V; k++) {
			for (i = 0; i < V; i++) {
				for (j = 0; j < V; j++) {
					if (Distance[i][k] + Distance[k][j] < Distance[i][j]) {
						Distance[i][j] = Distance[i][k] + Distance[k][j];
						Path[i][j] = k;
					}
				}
			}
		}

	}

	static String getPath(int i, int l) {
		if (Path[i][l] == INFINITVE)
			return "No path";
		int middle = Path[i][l];
		if (middle == 0)
			return " >> ";
		middle++;
		return getPath(i, middle) + (middle + 1) + getPath(middle, l);
	}

	public static void printSolution(int dist[][]) {
		for (int i = 0; i < V; ++i) {
			for (int j = 0; j < V; ++j) {
				if (dist[i][j] == INFINITVE)
					System.out.print("INF ");
				else
					System.out.print(dist[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int graph[][] = { { 0, 5, INFINITVE, INFINITVE }, { 50, 0, 15, 5 }, { 30, INFINITVE, 0, 15 },
				{ 15, INFINITVE, 5, 0 } };
		V = graph.length;
		int x = 1;
		int y = 3;
		FloydWarshall(graph);
		System.out.println(x + getPath(x - 1, y - 1) + y + "  : with distances " + Distance[x - 1][y - 1]);
		System.out.println("Number of nodes : " + Middle);

	}
}
