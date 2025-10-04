import java.util.*;

public class GraphZeroIndex {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{3,1}}; // 0-based indexing ke edges

        // Step 1: Max vertex nikal lo
        int n = 0;
        for (int i = 0; i < edges.length; i++) {
            n = Math.max(n, Math.max(edges[i][0], edges[i][1]));
        }

        // Step 2: Graph banao
        ArrayList<Edge>[] graph = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Step 3: Add edges (directed)
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(new Edge(u, v));
        }

        // Step 4: Print
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print(e.dest + " ");
            }
            System.out.println();
        }
    }
}
