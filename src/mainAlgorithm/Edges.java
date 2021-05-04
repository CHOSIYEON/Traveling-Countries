package mainAlgorithm;

import java.util.*;

public class Edges {
	private HashMap<String, ArrayList<ArrayList<Integer>>> edge;
	
	public Edges() {
		edge = new HashMap<String, ArrayList<ArrayList<Integer>>>();		//initialize HashMap<String, ArrayList<ArrayList<Integer>>> edge
	}
	public Edges(String[] data) {
		edge = new HashMap<String, ArrayList<ArrayList<Integer>>>();		//initialize HashMap<String, ArrayList<ArrayList<Integer>>> edge
		setEdge(data);
	}
	
	//return edge
	public HashMap<String, ArrayList<ArrayList<Integer>>> getEdge() {
		return edge;
	}
	
	//set edge: file���� data�� �� �� �о���� �� data�� HashMap���·� ����(data example: A B 3 10 8 6 60 45 20)
	public void setEdge(String[] data) {
		String key = data[0] + "_"+ data[1];		//ex. A_B
		ArrayList<ArrayList<Integer>> value = new ArrayList<>();	//create a new 2D ArrayList
		
		//initialize each element of ArrayList with another ArrayList
		int sizeOfArrayList = (data.length - 2) / 2;		//size of ArrayList is (data.lenth - 2)/2
		for (int i = 0; i < sizeOfArrayList; i++) {
			value.add(new ArrayList());
		}
		
		int dataIndex = 2;
		for (int i = 0; i < value.size(); i++) {
				value.get(i).add(Integer.parseInt(data[dataIndex++]));		//value[i][0]�� �� node�� �ð� ���� ����
		}
		for (int i = 0; i < value.size(); i++) {
				value.get(i).add(Integer.parseInt(data[dataIndex++]));		//value[i][1]�� �� node�� ��� ���� ����
		}
		
		edge.put(key, value);
	}

}
