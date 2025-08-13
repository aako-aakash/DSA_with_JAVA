//package com.aako;
//
//import java.util.*;
//
///**
// * GraphsInJava.java
// *
// * Single-file collection of:
// *  - adjacency-list Graph (unweighted)
// *  - weighted graph (adj list + edge list)
// *  - BFS (with path reconstruction)
// *  - DFS (recursive + iterative)
// *  - Dijkstra
// *  - Bellman-Ford
// *  - Topological sort (Kahn)
// *  - Kruskal (with Union-Find)
// *  - Prim (heap-based)
// *
// * Meant for learning and demonstration.
// */
//public class GraphsInJava {
//
//    /* -----------------------
//       Basic unweighted graph
//       ----------------------- */
//    static class Graph {
//        int V;
//        ArrayList<ArrayList<Integer>> adj;
//        boolean directed;
//
//        Graph(int V, boolean directed) {
//            this.V = V;
//            this.directed = directed;
//            adj = new ArrayList<>(V);
//            for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
//        }
//
//        // add edge u -> v; if undirected, also adds v -> u
//        void addEdge(int u, int v) {
//            adj.get(u).add(v);
//            if (!directed) adj.get(v).add(u);
//        }
//
//        void printGraph() {
//            for (int i = 0; i < V; i++) {
//                System.out.print(i + " -> ");
//                for (int x : adj.get(i)) System.out.print(x + " ");
//                System.out.println();
//            }
//        }
//    }
//
//    /* -----------------------
//       Weighted graph classes
//       ----------------------- */
//    static class Edge {
//        int to;
//        int weight;
//        <V> Edge(V end, int weight) { this.to = end; this.weight = weight; }
//        public String toString() { return "(" + to + "," + weight + ")"; }
//		public Object getVertex() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//    }
//
//    // edge record: useful for Bellman-Ford & Kruskal
//    static class EdgeRecord {
//        int u, v, w;
//        EdgeRecord(int u, int v, int w) { this.u = u; this.v = v; this.w = w; }
//        public String toString() { return u + " - " + v + " (" + w + ")"; }
//    }
//
//    static class WeightedGraph {
//        int V;
//        ArrayList<ArrayList<Edge>> adj;
//        List<EdgeRecord> edges; // store each undirected edge once (or all directed edges)
//        boolean directed;
//
//        WeightedGraph(int V, boolean directed) {
//            this.V = V;
//            this.directed = directed;
//            adj = new ArrayList<>(V);
//            for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
//            edges = new ArrayList<>();
//        }
//
//        // adds u->v with weight w. For undirected graphs, adj contains both directions
//        // but edges list stores a single record (u,v,w)
//        void addEdge(int u, int v, int w) {
//            adj.get(u).add(new Edge(v, w));
//            edges.add(new EdgeRecord(u, v, w));
//            if (!directed) {
//                adj.get(v).add(new Edge(u, w)); // adjacency for traversal
//                // don't add duplicate EdgeRecord for undirected; leave single record
//            }
//        }
//    }
//
//    /* -----------------------
//       BFS (unweighted shortest path)
//       ----------------------- */
//    static class BFSResult {
//        int[] dist;
//        int[] parent;
//        BFSResult(int[] d, int[] p) { dist = d; parent = p; }
//    }
//
//    static BFSResult bfs(Graph g, int src) {
//        int V = g.V;
//        int[] dist = new int[V];
//        int[] parent = new int[V];
//        Arrays.fill(dist, -1); // -1 => unreachable
//        Arrays.fill(parent, -1);
//
//        Queue<Integer> q = new LinkedList<>();
//        dist[src] = 0;
//        q.add(src);
//
//        while (!q.isEmpty()) {
//            int u = q.poll();
//            for (int v : g.adj.get(u)) {
//                if (dist[v] == -1) {
//                    dist[v] = dist[u] + 1;
//                    parent[v] = u;
//                    q.add(v);
//                }
//            }
//        }
//        return new BFSResult(dist, parent);
//    }
//
//    static List<Integer> reconstructPath(BFSResult r, int target) {
//        if (r.dist[target] == -1) return Collections.emptyList();
//        LinkedList<Integer> path = new LinkedList<>();
//        for (int at = target; at != -1; at = r.parent[at]) path.addFirst(at);
//        return path;
//    }
//
//    /* -----------------------
//       DFS: recursive & iterative
//       ----------------------- */
//    static void dfsRecUtil(Graph g, int u, boolean[] vis, List<Integer> order) {
//        vis[u] = true;
//        order.add(u);
//        for (int v : g.adj.get(u)) if (!vis[v]) dfsRecUtil(g, v, vis, order);
//    }
//
//    static List<Integer> dfsRecursive(Graph g, int src) {
//        boolean[] vis = new boolean[g.V];
//        List<Integer> order = new ArrayList<>();
//        dfsRecUtil(g, src, vis, order);
//        return order;
//    }
//
//    static List<Integer> dfsIterative(Graph g, int src) {
//        boolean[] vis = new boolean[g.V];
//        List<Integer> order = new ArrayList<>();
//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.push(src);
//        while (!stack.isEmpty()) {
//            int u = stack.pop();
//            if (vis[u]) continue;
//            vis[u] = true;
//            order.add(u);
//            // push neighbours in reverse so that iteration order is similar to recursive
//            List<Integer> nbrs = g.adj.get(u);
//            for (int i = nbrs.size() - 1; i >= 0; i--) {
//                int v = nbrs.get(i);
//                if (!vis[v]) stack.push(v);
//            }
//        }
//        return order;
//    }
//
//    /* -----------------------
//       Dijkstra (non-negative weights)
//       ----------------------- */
//    static class Node implements Comparable<Node> {
//        int vertex;
//        long dist;
//        Node(int vertex, long dist) { this.vertex = vertex; this.dist = dist; }
//        public int compareTo(Node o) { return Long.compare(this.dist, o.dist); }
//    }
//
//    static long[] dijkstra(WeightedGraph g, int src) {
//        final long INF = Long.MAX_VALUE / 4;
//        long[] dist = new long[g.V];
//        Arrays.fill(dist, INF);
//        dist[src] = 0;
//
//        PriorityQueue<Node> pq = new PriorityQueue<>();
//        pq.add(new Node(src, 0));
//        boolean[] processed = new boolean[g.V];
//
//        while (!pq.isEmpty()) {
//            Node cur = pq.poll();
//            int u = cur.vertex;
//            if (processed[u]) continue; // skip stale entry
//            processed[u] = true;
//
//            for (Edge e : g.adj.get(u)) {
//                int v = e.to;
//                long w = e.weight;
//                if (dist[v] > dist[u] + w) {
//                    dist[v] = dist[u] + w;
//                    pq.add(new Node(v, dist[v]));
//                }
//            }
//        }
//        return dist;
//    }
//
//    /* -----------------------
//       Bellman-Ford (supports negative weights)
//       ----------------------- */
//    static long[] bellmanFord(WeightedGraph g, int src) {
//        final long INF = Long.MAX_VALUE / 4;
//        long[] dist = new long[g.V];
//        Arrays.fill(dist, INF);
//        dist[src] = 0;
//
//        for (int i = 0; i < g.V - 1; i++) {
//            boolean updated = false;
//            for (EdgeRecord er : g.edges) {
//                if (dist[er.u] < INF && dist[er.u] + er.w < dist[er.v]) {
//                    dist[er.v] = dist[er.u] + er.w;
//                    updated = true;
//                }
//            }
//            if (!updated) break;
//        }
//
//        // check negative-weight cycle
//        for (EdgeRecord er : g.edges) {
//            if (dist[er.u] < INF && dist[er.u] + er.w < dist[er.v]) {
//                System.out.println("Graph contains a negative-weight cycle");
//                return null;
//            }
//        }
//        return dist;
//    }
//
//    /* -----------------------
//       Topological sort (Kahn)
//       ----------------------- */
//    static List<Integer> topologicalSortKahn(Graph g) {
//        if (!g.directed) throw new IllegalArgumentException("Topological sort applies only to directed graphs.");
//        int[] indeg = new int[g.V];
//        for (int u = 0; u < g.V; u++) for (int v : g.adj.get(u)) indeg[v]++;
//
//        Queue<Integer> q = new LinkedList<>();
//        for (int i = 0; i < g.V; i++) if (indeg[i] == 0) q.add(i);
//
//        List<Integer> order = new ArrayList<>();
//        while (!q.isEmpty()) {
//            int u = q.poll();
//            order.add(u);
//            for (int v : g.adj.get(u)) {
//                indeg[v]--;
//                if (indeg[v] == 0) q.add(v);
//            }
//        }
//        if (order.size() != g.V) {
//            return null; // cycle exists
//        }
//        return order;
//    }
//
//    /* -----------------------
//       Kruskal (MST) + Union-Find
//       ----------------------- */
//    static class UnionFind {
//        int[] parent, rank;
//        UnionFind(int n) { parent = new int[n]; rank = new int[n]; for (int i = 0; i < n; i++) parent[i] = i; }
//        int find(int x) { return parent[x] == x ? x : (parent[x] = find(parent[x])); }
//        boolean union(int a, int b) {
//            a = find(a); b = find(b);
//            if (a == b) return false;
//            if (rank[a] < rank[b]) parent[a] = b;
//            else if (rank[b] < rank[a]) parent[b] = a;
//            else { parent[b] = a; rank[a]++; }
//            return true;
//        }
//    }
//
//    static class KruskalResult {
//        long totalWeight;
//        List<EdgeRecord> mstEdges;
//        KruskalResult(long w, List<EdgeRecord> e) { totalWeight = w; mstEdges = e; }
//        public String toString() { return "Weight=" + totalWeight + ", edges=" + mstEdges; }
//    }
//
//    static KruskalResult kruskalMST(WeightedGraph g) {
//        List<EdgeRecord> list = new ArrayList<>(g.edges);
//        // sort edges by weight (ascending)
//        Collections.sort(list, Comparator.comparingInt(er -> er.w));
//        UnionFind uf = new UnionFind(g.V);
//        List<EdgeRecord> mst = new ArrayList<>();
//        long total = 0;
//        for (EdgeRecord er : list) {
//            if (uf.union(er.u, er.v)) {
//                mst.add(er);
//                total += er.w;
//                if (mst.size() == g.V - 1) break;
//            }
//        }
//        if (mst.size() != g.V - 1) {
//            return null; // not connected
//        }
//        return new KruskalResult(total, mst);
//    }
//
//    /* -----------------------
//       Prim (heap-based) — returns MST edges and weight
//       ----------------------- */
//    static class EdgePair {
//        int u, v, w;
//        EdgePair(int u, int v, int w) { this.u = u; this.v = v; this.w = w; }
//    }
//
//    static KruskalResult primMST(WeightedGraph g) {
//        boolean[] inMST = new boolean[g.V];
//        PriorityQueue<EdgePair> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.w));
//        List<EdgeRecord> mst = new ArrayList<>();
//        long total = 0;
//        // handle empty graph
//        if (g.V == 0) return new KruskalResult(0, mst);
//
//        // start from node 0 (works if graph is connected)
//        inMST[0] = true;
//        for (Edge e : g.adj.get(0)) pq.add(new EdgePair(0, e.to, e.weight));
//
//        while (!pq.isEmpty() && mst.size() < g.V - 1) {
//            EdgePair ep = pq.poll();
//            if (inMST[ep.v]) continue;
//            inMST[ep.v] = true;
//            mst.add(new EdgeRecord(ep.u, ep.v, ep.w));
//            total += ep.w;
//            for (Edge ne : g.adj.get(ep.v)) {
//                if (!inMST[ne.to]) pq.add(new EdgePair(ep.v, ne.to, ne.weight));
//            }
//        }
//        if (mst.size() != g.V - 1) return null; // not connected
//        return new KruskalResult(total, mst);
//    }
//
//    /* -----------------------
//       Demo / main
//       ----------------------- */
//    public static void main(String[] args) {
//        // 1) Unweighted graph demo
//        System.out.println("=== Unweighted Graph (adj list) demo ===");
//        Graph g = new Graph(6, false); // 6 nodes, undirected
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 3);
//        g.addEdge(2, 3);
//        g.addEdge(3, 4);
//        g.addEdge(4, 5);
//        g.printGraph();
//
//        System.out.println("\nBFS from 0:");
//        BFSResult br = bfs(g, 0);
//        System.out.println("distances: " + Arrays.toString(br.dist));
//        System.out.println("path 0 -> 5: " + reconstructPath(br, 5));
//
//        System.out.println("\nDFS recursive from 0: " + dfsRecursive(g, 0));
//        System.out.println("DFS iterative from 0: " + dfsIterative(g, 0));
//
//        // 2) Weighted graph demo
//        System.out.println("\n=== Weighted Graph demo (for Dijkstra, Kruskal, Prim) ===");
//        WeightedGraph wg = new WeightedGraph(5, false); // 5 nodes, undirected
//        wg.addEdge(0, 1, 2);
//        wg.addEdge(0, 3, 6);
//        wg.addEdge(1, 2, 3);
//        wg.addEdge(1, 3, 8);
//        wg.addEdge(1, 4, 5);
//        wg.addEdge(2, 4, 7);
//        wg.addEdge(3, 4, 9);
//
//        System.out.println("Adjacency:");
//        for (int i = 0; i < wg.V; i++) System.out.println(i + " -> " + wg.adj.get(i));
//        System.out.println("\nDijkstra from 0:");
//        long[] dists = dijkstra(wg, 0);
//        System.out.println(Arrays.toString(dists));
//
//        System.out.println("\nKruskal MST:");
//        KruskalResult kr = kruskalMST(wg);
//        System.out.println(kr);
//
//        System.out.println("\nPrim MST:");
//        KruskalResult pr = primMST(wg);
//        System.out.println(pr);
//
//        // 3) Topological sort demo (directed)
//        System.out.println("\n=== Topological Sort demo ===");
//        Graph dag = new Graph(6, true);
//        dag.addEdge(5, 2);
//        dag.addEdge(5, 0);
//        dag.addEdge(4, 0);
//        dag.addEdge(4, 1);
//        dag.addEdge(2, 3);
//        dag.addEdge(3, 1);
//        List<Integer> topo = topologicalSortKahn(dag);
//        System.out.println("Topological order: " + topo);
//
//        // 4) Bellman-Ford demo with possible negative weight (no negative cycle)
//        System.out.println("\n=== Bellman-Ford demo ===");
//        WeightedGraph wg2 = new WeightedGraph(5, true);
//        wg2.addEdge(0, 1, -1);
//        wg2.addEdge(0, 2, 4);
//        wg2.addEdge(1, 2, 3);
//        wg2.addEdge(1, 3, 2);
//        wg2.addEdge(1, 4, 2);
//        wg2.addEdge(3, 2, 5);
//        wg2.addEdge(3, 1, 1);
//        wg2.addEdge(4, 3, -3);
//
//        long[] bf = bellmanFord(wg2, 0);
//        System.out.println("Bellman-Ford distances from 0: " + Arrays.toString(bf));
//    }
//}
//
