package week9;

public class tester {
    public static void main(String[] args) {
        WeightedGraph<String, Integer> G1 = new WeightedGraph<>();
        G1.addVertex("A");
        G1.addVertex("B");
        G1.addVertex("C");
        G1.addVertex("D");
        G1.addEdge("A", "B", 3);
        G1.addEdge("D", "A", 1);
        G1.addEdge("A", "C", 4);
        G1.addEdge("C", "C", 2);
        G1.addUndirectedEdge("D", "B", 2);
        G1.printEdges();

        System.out.println("\n\n\n");
        UnweightedGraph<String> G2 = new UnweightedGraph<>();
        G2.addVertex("A");
        G2.addVertex("B");
        G2.addVertex("C");
        G2.addVertex("D");
        G2.addEdge("A", "B");
        G2.addEdge("D", "A");
        G2.addEdge("A", "C");
        G2.addEdge("C", "C");
        G2.addUndirectedEdge("D", "B");
        G2.printEdges();
    }
}
