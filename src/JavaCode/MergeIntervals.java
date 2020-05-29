package JavaCode;
import java.util.*;
public class MergeIntervals {
        private Map<int[], List<int[]>> graph;
        private Map<Integer, List<int[]>> nodesInComp;
        private Set<int[]> visited;

        // return whether two intervals overlap (inclusive)
        private boolean overlap(int[] a, int[] b) {
            return a[0] <= b[1] && b[0] <= a[1];
        }

        // build a graph where an undirected edge between intervals u and v exists
        // iff u and v overlap.
        private void buildGraph(int[][] intervals) {

            graph = new HashMap<>();
            for (int[] interval : intervals) {
                graph.put(interval, new LinkedList<>());
            }

            for(int i = 0; i < intervals.length - 1 ; i++) {
                for(int j = i+1; j < intervals.length; j++){
                    if (overlap(intervals[i], intervals[j])) {
                        graph.get(intervals[i]).add(intervals[j]);
                        graph.get(intervals[j]).add(intervals[i]);
                    }
                }
            }
        }

        // merges all of the nodes in this connected component into one interval.
        private int[] mergeNodes(List<int[]> nodes) {
            int minStart = nodes.get(0
            )[0];
            for (int[] node : nodes) {
                minStart = Math.min(minStart, node[0]);
            }

            int maxEnd = nodes.get(0)[1];
            for (int[] node : nodes) {
                maxEnd = Math.max(maxEnd, node[1]);
            }

            return new int[] {minStart, maxEnd};
        }

        // use depth-first search to mark all nodes in the same connected component
        // with the same integer.
        private void markComponentDFS(int[] start, int compNumber) {
            Stack<int[]> stack = new Stack<>();
            stack.add(start);

            while (!stack.isEmpty()) {
                int[] node = stack.pop();
                if (!visited.contains(node)) {
                    visited.add(node);

                    if (nodesInComp.get(compNumber) == null) {
                        nodesInComp.put(compNumber, new LinkedList<>());
                    }
                    nodesInComp.get(compNumber).add(node);

                    for (int[] child : graph.get(node)) {
                        stack.add(child);
                    }
                }
            }
        }

        // gets the connected components of the interval overlap graph.
        private void buildComponents(int[][] intervals) {
            nodesInComp = new HashMap<>();
            visited = new HashSet<>();
            int compNumber = 0;

            for (int[] interval : intervals) {
                if (!visited.contains(interval)) {
                    markComponentDFS(interval, compNumber);
                    compNumber++;
                }
            }
        }

        public int[][] merge(int[][] intervals) {
            buildGraph(intervals);
            buildComponents(intervals);

            // for each component, merge all intervals into one interval.
            List<int[]> merged = new LinkedList<>();
            for (int comp = 0; comp < nodesInComp.size(); comp++) {
                merged.add(mergeNodes(nodesInComp.get(comp)));
            }

            return merged.toArray(new int[merged.size()][]);
        }

        public void printMergeIntervals(){
       //    int[][] intervals = new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}};
            int[][] intervals = new int [][] {{1,4},{0,2},{3,5}};

            for(int i = 0;  i < intervals.length; i++)
                System.out.println("interval = "+Arrays.toString(intervals[i]));


            int [][] mergeIntervals = merge(intervals);
            for(int i = 0;  i < mergeIntervals.length; i++)
                System.out.println("merge interval = "+ Arrays.toString(mergeIntervals[i]));
            int[][] intervals1 = new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}};
            Arrays.sort(intervals1, (a,b) -> Integer.compare(a[0], b[0]));
            for(int i = 0; i < intervals1.length; i++)
                System.out.println("after sort = "+Arrays.toString(intervals1[i]));
        }
    }

