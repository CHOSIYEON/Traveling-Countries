package basedBacktracking;

import java.util.*;

class Path {
	int departure_index;
	int arrival_index;
	int edge_num;			//edge index of one to another node
}

public class FindSolution {
	int V;		//number of vertices
	ArrayList<ArrayList<ArrayList<Integer>>> graph;		//adjacency matrix
	Path[] path;		//the route
	HashSet<Integer> containedIndex;	//indices contained in path[]
	int budget = 100;					//the budget

	public FindSolution() {
		V = Demo.citys.length;
		path = new Path[V];
		for (int i = 0; i < V; i++) {	//initialize
			path[i] = new Path();
			path[i].departure_index = -1;
			path[i].arrival_index = -1;
			path[i].edge_num = -1;
		}
		graph = new ArrayList<>();
		graph = Demo.adjM;
		
		containedIndex = new HashSet<>();
	}
	
	
	//check the vertex is contained the path
	boolean isContainedPath(int v) {
		return containedIndex.contains(v);
	}
	
	//Check if sum of costs exceeds budget
	boolean notOverBudget(int position) {
		if (budget >= currentTotalPrice(position))
			return true;
		else
			return false;
	}
	//return the total sum of time in path[]
	int totalTime() {
		int sum = 0;
		for (int i = 0; i < V; i++) {
			String key = String.valueOf((char)(65 + path[i].departure_index))
					+ "_" + String.valueOf((char)(65 + path[i].arrival_index));
			ArrayList<ArrayList<Integer>> cost = Demo.edges.getEdge(key);
			sum += cost.get(path[i].edge_num).get(0);
		}
		return sum;
	}
	
	//return the sum of budget in path[]
	int currentTotalPrice(int position) {
		int sum = 0;
		for (int i = 0; i <= position; i++) {
			String key = String.valueOf((char)(65 + path[i].departure_index))
					+ "_" + String.valueOf((char)(65 + path[i].arrival_index));
			
			ArrayList<ArrayList<Integer>> cost = new ArrayList<>();
			cost = Demo.edges.getEdge(key);
			sum += cost.get(path[i].edge_num).get(1);
		}
		return sum;
	}

	//A recursive utility function to solve this problem
	boolean utilFunc(int position, int D) {		//position: index of path[]
		//base case: If all vertices are included in path[]
		if (position == V) {
			if (path[0].departure_index == path[position - 1].arrival_index)
				return true;
			else
				return false;
		}
		
		for (int v = 0; v < V; v++) {
			for (int e = 0; e < graph.get(D).get(v).size(); e++) {
				if (isContainedPath(v))
					continue;
				
				path[position].departure_index = D;
				path[position].arrival_index = v;
				path[position].edge_num = e;
				
				if (notOverBudget(position)) {
					
					//Since vertex v has been added to path [], add it to containedIndex hashSet.
					containedIndex.add(v);
					
					//recur to construct rest of the path
					if (utilFunc(position + 1, v) == true)
						return true;
					
					//If adding vertex v doesn't lead to a solution, then remove it
					containedIndex.remove(v);
				}
				path[position].departure_index = -1;
				path[position].arrival_index = -1;
				path[position].edge_num = -1;
			}
		}
		
		return false;
	}
	
	//run this algorithm - 0: solution does not exist, 1: solution exist
	public int run() {
		path[0].departure_index = 0;
		path[0].arrival_index = 0;
		path[0].edge_num = 0;
		if (utilFunc(0, 0) == false) {
			return 0;
		}
		
		System.out.println("path: ");
		for (int i = 0; i < V; i++) {
			System.out.print(String.valueOf((char)(65 + path[i].departure_index))
					+ "(" + (path[i].edge_num + 1) + ")->");
		}
		System.out.println(String.valueOf((char)(65 + path[V-1].arrival_index)));
		System.out.println("total cost(time): " + totalTime());
		System.out.println("total cost(price): " + currentTotalPrice(V - 1));
		
		return 1;
	}


}
