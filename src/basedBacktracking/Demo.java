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
		
		//file read: user�� �Է��� ����(A, B, ...; sampelData������ ����)�� �´� ������ data file���� �о�´�.
		String fileName = "sampleData.txt";			//file name�� �Է�
		ReadFile readFile = new ReadFile(fileName);
		
		//edges�� edge���� ���� �ֱ�
		String[] anEdgeData;
		ArrayList<String> edgeList = new ArrayList<String>();		//key list�� ����
		for (int i = 0; i < citys.length; i++) {
			for (int j = i; j < citys.length; j++) {
				anEdgeData = readFile.readEdges(citys[i], citys[j]);		//�����(citys[i]), ������(citys[j])�� edge ������ String [] type���� �޾ƿ´�.
				edges.setEdge(anEdgeData);
				anEdgeData = readFile.readEdges(citys[j], citys[i]);		//�����(citys[i]), ������(citys[j])�� edge ������ String [] type���� �޾ƿ´�.
				edges.setEdge(anEdgeData);
				
				edgeList.add(citys[i] + "_" + citys[j]);
				if (i==j)
					continue;
				edgeList.add(citys[j] + "_" + citys[i]);
			}
			
		}
		
		//���� edge ����
//		for (int k = 0; k < edgeList.size(); k++) {
//			System.out.println("k = " + k +"____________//" + edgeList.get(k) +"//__________________________________________");
//			ArrayList<ArrayList<Integer>> cost = edges.getEdge(edgeList.get(k));
//			for (int i = 0; i < cost.size(); i++) {				//node�� ����ŭ �ݺ�
//				for (int j = 0; j < cost.get(i).size(); j++) {		//node�� ������ ����(2: �ð�, ���)��ŭ �ݺ�
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
