package basedBacktracking;

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
	
	//set edge: file에서 data를 한 줄 읽어오면 그 data를 HashMap형태로 저장
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
			value.get(i).add(Integer.parseInt(data[dataIndex++]));		//value[i][0]에 각 node의 시간 정보 저장
		}
		for (int i = 0; i < value.size(); i++) {
			value.get(i).add(Integer.parseInt(data[dataIndex++]));		//value[i][1]에 각 node의 비용 정보 저장
		}
		
		edge.put(key, value);
	}
	
	//return an edge
	public ArrayList<ArrayList<Integer>> getEdge(String key) {
		return edge.get(key);
	}

}
