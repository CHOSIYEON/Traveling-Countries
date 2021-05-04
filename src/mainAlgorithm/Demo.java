package mainAlgorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Demo {
	public static int[] N;
	public static int allCaseN = 0;
	public static int num = 0;
	public static int num2 = 0;
	public static String[] route;
	public static String[] route_check;
	public static char[] words;
	public static String[] charData;
	static String start_city;
	static int cityNumber;
	public static String[] real_route;
	ArrayList<String> can_route2 = new ArrayList<>();
	public static String[] can_route = new String[100000];
	static String fileName = "sampleData2.txt"; // file name을 입력
	static ReadFile readFile = new ReadFile(fileName);
	static int[][] route_num;
	static int[][] route_cost;
	static int money = 70;
	public static int can_route_num = 0;
	public static String visitCity;
	public static Map<String, Integer> map = new HashMap<String, Integer>();

	private static char[] getRemainChar(char[] source, int removeIdx) {

		if (removeIdx == -1) {
			return source;
		}

		char[] result = new char[source.length - 1];
		int index = 0;
		for (int i = 0; i < source.length; i++) {

			if (i != removeIdx) {

				result[index] = source[i];
				index++;
			}
		}
		return result;
	}

	public static void makeWord(int n, int depth, char[] remainWords) {

		String root2 = "";
		for (int i = 0; i < n; i++) {

			words[depth] = remainWords[i];

			if (remainWords.length == 1) {

				for (int j = 0; j < charData.length; j++) {

					root2 = root2 + String.valueOf(words[j]);
				}

				route[num] = String.valueOf(root2);
				// System.out.println(route[num]);
				num++;

			}
			makeWord(n - 1, depth + 1, getRemainChar(remainWords, i));
		}
	}

	public static void branch(int index, String route2) {

		int time = 0;
		int cost = 0;
		int rest_money = money;// 처음에 rest_money에 예산을 집어 넣는다.
		System.out.println("m" + money);
		String a = "";
		for (int j = 0; j < cityNumber - 1; j++) {
			if (j == 0) {// 시작지점과의 금액과 시간을 가져온다.
				// System.out.println(start_city+" "+route[index].substring(j, j + 1)+"
				// "+Integer.parseInt(route2.substring(j, j + 1)));
				cost = cost + get_value_cost(start_city, route[index].substring(j, j + 1),
						Integer.parseInt(route2.substring(j, j + 1)));
				time = time + get_value_time(start_city, route[index].substring(j, j + 1),
						Integer.parseInt(route2.substring(j, j + 1)));
				rest_money = rest_money - get_value_cost(start_city, route[index].substring(j, j + 1),
						Integer.parseInt(route2.substring(j, j + 1)));
				if (rest_money < 0)// 만약 남은 금액이 0보다 작다면 예산을 초과했다는 의미, break
					break;
			}
			if (j >= 1) {// j번째 지점과 그 다음 지점의 금액과 시간을 가져온다.
				// System.out.println("11111 "+route2+" "+route[index].substring(j - 1, j)+"
				// "+route[index].substring(j, j + 1)+" "+Integer.parseInt(route2.substring(j, j
				// + 1)));
				cost = cost + get_value_cost(route[index].substring(j - 1, j), route[index].substring(j, j + 1),
						Integer.parseInt(route2.substring(j, j + 1)));
				time = time + get_value_time(route[index].substring(j - 1, j), route[index].substring(j, j + 1),
						Integer.parseInt(route2.substring(j, j + 1)));
				rest_money = rest_money - get_value_cost(route[index].substring(j - 1, j),
						route[index].substring(j, j + 1), Integer.parseInt(route2.substring(j, j + 1)));
				if (rest_money < 0)// 만약 남은 금액이 0보다 작다면 예산을 초과했다는 의미, break
					break;
			}
		}
		// 마지막 지점과의 금액과 시간을 가져온다.
		cost = cost + get_value_cost(route[index].substring(cityNumber - 2), start_city,
				Integer.parseInt(route2.substring(cityNumber - 1)));
		time = time + get_value_time(route[index].substring(cityNumber - 2), start_city,
				Integer.parseInt(route2.substring(cityNumber - 1)));
		rest_money = rest_money - get_value_cost(route[index].substring(cityNumber - 2), start_city,
				Integer.parseInt(route2.substring(cityNumber - 1)));
		;

		if (rest_money > 0) {// 예산이 0보다 크다면

			for (int j = 0; j < cityNumber - 1; j++) {
				if (j == 0) {
					a = a + start_city + route2.substring(j, j + 1);

				}
				if (j == 1) {
					a = a + route[index].substring(j - 1, j) + route2.substring(j, j + 1)
							+ route[index].substring(j, j + 1);
				}
				if (j > 1) {

					a = a + route2.substring(j, j + 1) + route[index].substring(j, j + 1);

				}
			}

			a = a + route2.substring(cityNumber - 1) + start_city;
			// System.out.println("route num : "+can_route_num);
			can_route[can_route_num] = a;
			// System.out.println(can_route[can_route_num]);
			System.out.println("time: " + time + " cost: " + cost + " " + route2 + " " + a);
			can_route_num++;
			map.put(a, time);

		}

	}

	public static int get_value_cost(String start, String end, int index) {// start지점과 end 지점 index번째 금액을 받아온다.
		String[] anEdgeData = readFile.readEdges(start, end);
		Edges AC = new Edges(anEdgeData);
		HashMap<String, ArrayList<ArrayList<Integer>>> example = AC.getEdge();
		ArrayList<ArrayList<Integer>> cost = example.get(start + "_" + end);

		return cost.get(index).get(1);
	}

	public static int get_value_time(String start, String end, int index) {// start지점과 end 지점 index번째 시간을 받아온다.
		String[] anEdgeData = readFile.readEdges(start, end);
		Edges AC = new Edges(anEdgeData);
		HashMap<String, ArrayList<ArrayList<Integer>>> example = AC.getEdge();
		ArrayList<ArrayList<Integer>> cost = example.get(start + "_" + end);

		return cost.get(index).get(0);
	}

	public static int get_value(String start, String end) {// start지점과 end 지점사이의 루트 개수 받아온다.
		String[] anEdgeData = readFile.readEdges(start, end);
		Edges AC = new Edges(anEdgeData);
		HashMap<String, ArrayList<ArrayList<Integer>>> example = AC.getEdge();
		ArrayList<ArrayList<Integer>> cost = example.get(start + "_" + end);

		return cost.size();

	}

	public static List sortByValue(final Map map) {

		List<String> list = new ArrayList();

		list.addAll(map.keySet());

		Collections.sort(list, new Comparator() {

			public int compare(Object o1, Object o2) {

				Object v1 = map.get(o1);

				Object v2 = map.get(o2);

				return ((Comparable) v2).compareTo(v1);

			}

		});

		Collections.reverse(list); // 주석시 오름차순

		return list;

	}
	public static void execute()
	{
		int routeN = 1;
		int pos = 0;
		/*
		 * Scanner kb = new Scanner(System.in);
		 * 
		 * System.out.println("Enter start city's name : ");// 출발 도시를 입력 받는다. start_city
		 * = kb.nextLine(); System.out.println("Enter cities to visit at one line");
		 * visitCity = kb.nextLine();
		 * 
		 * while (visitCity.contains(start_city)) { System.out.println(); System.out.
		 * println("You have also entered your destination in the visiting city. Please re-enter"
		 * ); System.out.println(); System.out.println("Enter start city's name : ");//
		 * 출발 도시를 입력 받는다. start_city = kb.nextLine();
		 * System.out.println("Enter cities to visit at one line"); visitCity =
		 * kb.nextLine(); }
		 */

		cityNumber = visitCity.length();

		for (int i = cityNumber; i > 0; i--) {
			routeN = routeN * i;
		}
		cityNumber++;// 출발지점추가
		route = new String[routeN];// 가능한 조합 ex)출발지가 A고 방문할 도시가 B,C면 cityNumber는 2가 될건데 BC의 가능한 조합의 수 BC,CB - 2개

		char[] arr = visitCity.toCharArray();
		words = new char[arr.length];
		charData = new String[arr.length];

		makeWord(arr.length, 0, getRemainChar(arr, -1));// 가능한 조합을 구하는 함수 BC/CB

		N = new int[num];
		route_num = new int[num][cityNumber];
		route_cost = new int[num][cityNumber];
		// System.out.println(num);
		for (int i = 0; i < num; i++)// 총 route의 개수를 구한다.
		{
			N[i] = 0;
			int count = 0;
			for (int j = 0; j < cityNumber - 1; j++) {
				if (j == 0) {
					N[i] = N[i] + get_value(start_city, route[i].substring(j, j + 1));// start지점에서 그 다음지점까지의 가능한 루트 수
					route_num[i][count] = get_value(start_city, route[i].substring(j, j + 1));
					count++;
				}
				if (j >= 1) {
					N[i] = N[i] * get_value(route[i].substring(j - 1, j), route[i].substring(j, j + 1));// j번째 index에 있는
																										// 도시에서 그 다음도시까지
																										// 가능한 루트 수
					route_num[i][count] = get_value(route[i].substring(j - 1, j), route[i].substring(j, j + 1));
					count++;
				}

			}
			N[i] = N[i] * get_value(route[i].substring(cityNumber - 2, cityNumber - 1), start_city);// 곱해야함 ex)A에서 B//다시
																									// 시작지점으로 돌아가는 루트 수
			// System.out.println(N[i]);
			route_num[i][count] = get_value(route[i].substring(cityNumber - 2, cityNumber - 1), start_city);
			count++;

			allCaseN = allCaseN + N[i];// 총 가능한 route 수가 나온다.
			real_route = new String[allCaseN];
			num2 = 0;

			real_route real_route = new real_route();
			real_route.all_route(i, cityNumber);
			// all_route(i);

		}

		Iterator iterator;
		Iterator it;

		if (can_route_num == 0) {
			System.out.println();
			System.out.println("There's no way we can get to the budget.");
			newWindow alert = new newWindow();
			
		} else {
			iterator = map.keySet().iterator();
			it = sortByValue(map).iterator();
			
			System.out.println();
			String temp = (String) it.next();
			showWindow result = new showWindow();
			result.info(temp, map.get(temp));
			
			System.out.println("The shortest time in the budget range is " + temp + " : " + map.get(temp));
		}

		/*
		 * try { BufferedWriter bos = new BufferedWriter(new
		 * FileWriter("TravelRoute.txt", false)); iterator = map.keySet().iterator(); it
		 * = sortByValue(map).iterator();
		 * 
		 * while (it.hasNext()) {
		 * 
		 * 
		 * String temp = (String) it.next(); bos.write("얍");
		 * bos.write("Route: "+temp+" Time: "+map.get(temp));
		 * 
		 * 
		 * }
		 * 
		 * 
		 * } catch (Exception e) {
		 * 
		 * System.out.println("ERROR!"); }
		 */

		FileWriter fw = null;

		BufferedWriter bw = null;

		try {

			// 파일 쓰기

			fw = new FileWriter("TRAVEL_INFO.txt");

			bw = new BufferedWriter(fw);

			iterator = map.keySet().iterator();
			it = sortByValue(map).iterator();

			while (it.hasNext()) {

				String temp = (String) it.next();
				bw.write("Route: " + temp + " Time: " + map.get(temp));
				bw.newLine();

				bw.flush(); // 버퍼의 내용을 파일에 쓰기

			}

		} catch (IOException e) {

			System.out.println(e);

		} finally {

			try {
				fw.close();
			} catch (IOException e) {
			}

			try {
				bw.close();
			} catch (IOException e) {
			}

		}
	}
	public static void main(String[] args) {

		country frame = new country();
		
		
	}

}
