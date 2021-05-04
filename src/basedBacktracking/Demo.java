package basedBacktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Demo {
	public static Edges edges;				//information of edges
	public static String[] citys;			//list of citys
	public static ArrayList<ArrayList<ArrayList<Integer>>> adjM;		//adjacency matrix
	
	public Demo() {
		edges = new Edges();
	}

	//create adjacency matrix
	public static void createAdjacencyMatrix() {
		adjM = new ArrayList<>();
		for (int i = 0; i < citys.length; i++) {
			adjM.add(new ArrayList<ArrayList<Integer>>());
			for (int j = 0; j < citys.length; j++) {
				adjM.get(i).add(new ArrayList<Integer>());

				if (i == j) {
					for (int k = 0; k < edges.getEdge(citys[i] + "_" + citys[j]).size(); k++) {
						adjM.get(i).get(j).add(0);
					}
				}

				else {
					for (int k = 0; k < edges.getEdge(citys[i] + "_" + citys[j]).size(); k++) {
						adjM.get(i).get(j).add(1);
					}

				}
			}

		}
		
	}
	
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		
		citys = new String[]{"A", "B", "C", "D", "E"};
		
		//file read: user가 입력한 도시(A, B, ...; sampelData에서의 예시)에 맞는 정보만 data file에서 읽어온다.
		String fileName = "sampleData.txt";			//file name을 입력
		ReadFile readFile = new ReadFile(fileName);
		
		//edges에 edge들의 정보 넣기
		String[] anEdgeData;
		ArrayList<String> edgeList = new ArrayList<String>();		//key list와 같다
		for (int i = 0; i < citys.length; i++) {
			for (int j = i; j < citys.length; j++) {
				anEdgeData = readFile.readEdges(citys[i], citys[j]);		//출발지(citys[i]), 도착지(citys[j])인 edge 정보를 String [] type으로 받아온다.
				edges.setEdge(anEdgeData);
				anEdgeData = readFile.readEdges(citys[j], citys[i]);		//출발지(citys[i]), 도착지(citys[j])인 edge 정보를 String [] type으로 받아온다.
				edges.setEdge(anEdgeData);
				
				edgeList.add(citys[i] + "_" + citys[j]);
				if (i==j)
					continue;
				edgeList.add(citys[j] + "_" + citys[i]);
			}
			
		}
		
		//만든 edge 사용법
//		for (int k = 0; k < edgeList.size(); k++) {
//			System.out.println("k = " + k +"____________//" + edgeList.get(k) +"//__________________________________________");
//			ArrayList<ArrayList<Integer>> cost = edges.getEdge(edgeList.get(k));
//			for (int i = 0; i < cost.size(); i++) {				//node의 수만큼 반복
//				for (int j = 0; j < cost.get(i).size(); j++) {		//node의 정보의 개수(2: 시간, 비용)만큼 반복
//					System.out.printf("cost.get(%d).get(%d) = %d\n", i, j, cost.get(i).get(j));
//				}
//			}
//		}
		
		createAdjacencyMatrix();			//create adjacency matrix
		FindSolution solution = new FindSolution();
		int result = solution.run();		//run the algorithm
		if (result == 1)					//print the result
			System.out.println("Find route!!");
		else
			System.out.println("No route...");
	}
	

}
