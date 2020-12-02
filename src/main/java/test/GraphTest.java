package test;

import Graph.Graph;

public class GraphTest {
    public static void main(String[] args) {
//        Graph<String> graph = new Graph<String>(Graph.GraphType.UNDIRECTED);
//        graph.addEdge("Bob","Alice");
//        graph.addEdge("Bob","Rob");
//        graph.addEdge("Alice","Mark");
//        graph.addEdge("Rob","Mark");
//        graph.addEdge("Alice","Maria");
//        graph.addEdge("Rob","Maria");
//        System.out.println(graph);
//        System.out.println("Depth First");
//        graph.dfs("Bob").stream().forEach(System.out::println);
//
//        System.out.println("Breadth First");
//        graph.bfs("Bob").stream().forEach(System.out::println);

        Graph<String> graph = new Graph<String>(Graph.GraphType.DIRECTED);
        graph.addEdge("FCS","OS");
        graph.addEdge("DS","Algo");
        graph.addEdge("CN","CA");
        graph.addEdge("Algo","FCS");
        graph.addEdge("CA","DS");
        graph.addEdge("SD","CN");
        System.out.println(graph);
        graph.topologicalSort().stream().forEach(System.out::println);

//        System.out.println("Depth First");
//        graph.dfs("Bob").stream().forEach(System.out::println);
//
//        System.out.println("Breadth First");
//        graph.bfs("Bob").stream().forEach(System.out::println);

    }

}
