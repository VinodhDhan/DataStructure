package Graph;

import java.util.*;

public class Graph<T> {

    public Graph() {};

    public enum GraphType{UNDIRECTED, DIRECTED, WEIGHTED};

    private GraphType graphType = GraphType.UNDIRECTED;

    public GraphType getGraphType(){
        return graphType;
    }

    public Graph(GraphType graphType){
        this.graphType = graphType;
    }

    static class Node<T>{
        T value;
        int weight;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return weight == node.weight && Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, weight);
        }
    }

    Map<Node<T>, List<Node<T>>> graph = new HashMap<>();

    public void addVertex(Node<T> node){
        graph.put(node, new LinkedList<>());
    }

    public void addEdge(T src, T dest){
        Node<T> srcNode = new Node<T>(src);
        Node<T> destNode = new Node<T>(dest);

        if(!graph.containsKey(srcNode))
            addVertex(srcNode);

        if(!graph.containsKey(destNode))
            addVertex(destNode);

        graph.get(srcNode).add(destNode);

        if(graphType.equals(GraphType.UNDIRECTED)){
            graph.get(destNode).add(srcNode);
        }
    }

    public int getVertexCount(){
        return graph.keySet().size();
    }

    public int getEdgesCount(){
        int count = 0;
        for(Node<T> v :graph.keySet()){
            count += graph.get(v).size();
        }

        if(graphType.equals(GraphType.UNDIRECTED)){
            count = count/2;
        }
        return count;
    }

    public boolean hasEdge(T src, T dest){
        Node<T> srcNode = new Node<T>(src);
        Node<T> destNode = new Node<T>(dest);
        return graph.get(srcNode).contains(destNode);
    }

    public boolean hasVertex(T src){
        Node<T> srcNode = new Node<T>(src);
        return graph.containsKey(srcNode);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Node<T> key : graph.keySet()){
            stringBuilder.append(key.value);
            stringBuilder.append(" : ");
            for(Node valueNode : graph.get(key)){
                stringBuilder.append(valueNode.value);
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public List<T> dfs(T start){
        Node<T> src = new Node<T>(start);
        Set<T> visited = new LinkedHashSet<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(src);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            if(!visited.contains(node.value)){
                visited.add((T)node.value);
                for(Node nodes : graph.get(node)){
                    stack.push(nodes);
                }
            }
        }
        return new ArrayList<>(visited);
    }

    public List<T> bfs(T start){
        Node<T> src = new Node<T>(start);
        Set<T> visited = new LinkedHashSet<>();
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(src);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(!visited.contains(node.value)){
                visited.add((T)node.value);
                for(Node nodes : graph.get(node)){
                    queue.add(nodes);
                }
            }
        }
        return new ArrayList<>(visited);
    }
}
