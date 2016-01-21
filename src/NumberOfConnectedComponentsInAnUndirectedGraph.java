/**
 * Created by hazai on 20/01/16.
 */

/*Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes),
        write a function to find the number of connected components in an undirected graph.

        Example 1:
        0          3
        |          |
        1 --- 2    4
        Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], return 2.

        Example 2:
        0           4
        |           |
        1 --- 2 --- 3
        Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [3, 4]], return 1.

        Note:
        You can assume that no duplicate edges will appear in edges.
        Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.*/

public class NumberOfConnectedComponentsInAnUndirectedGraph {


    //TODO
    public static int countComponents(int n, int[][] edges) {
        if (n <= 0 || edges == null){
            return 0;
        }

        if (n == 1 && edges.length == 0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int [][] one = {{0, 1},{1, 2},{3, 4}};
        int [][] two = {{0, 1},{1, 2},{2, 3},{3, 4}};
        System.out.println(countComponents(5, one));
        System.out.println(countComponents(5, two));
    }
}
