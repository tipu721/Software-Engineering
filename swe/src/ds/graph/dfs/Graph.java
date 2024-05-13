package ds.graph.dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    LinkedList<Integer> linkedList[];
    boolean visited[];

    Graph(int nodes) {
        this.linkedList = new LinkedList[nodes];
        this.visited = new boolean[nodes];
        for (int i = 0; i < nodes; i++) {
            linkedList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int srs, int dest) {
        linkedList[srs].add(dest);
    }

    void DFS(int node) {

        visited[node] = true;
        System.out.println(node);
        Iterator it = linkedList[node].iterator();
        while (it.hasNext()){
            int adj = (int) it.next();
            if(!visited[adj]){
                DFS(adj);
            }

        }

    }

    public static void main(String[] args) {

        Graph graph = new Graph(6);
        System.out.println(graph);
        graph.addEdge(4, 1);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);

        graph.DFS(1);

    }

}
