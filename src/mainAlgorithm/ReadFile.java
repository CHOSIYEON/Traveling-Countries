package mainAlgorithm;

import java.util.*;
import java.io.*;

public class ReadFile {
	private static String fileName;			//file name to read
	private static Scanner inputStream = null;

	public ReadFile(String fileName) {
		this.fileName = fileName;
	}

	//출발지와 도착지에 해당하는 edge 정보를 읽어온다.
	public static String[] readEdges(String departure, String destination) {
		try {
			inputStream = new Scanner(new File(fileName));
		} catch(FileNotFoundException e) {
			System.out.println("Error opening the file: " + fileName);
			System.exit(0);
		}
		//파일에서 정보 읽어와서 저장
		String[] dataArray = null;
		while(inputStream.hasNextLine()) {
			String temp = inputStream.nextLine();		//file에서 data를 한 줄씩 읽어옴
			dataArray = temp.split(" ");		//" "을 기준으로 split
			if (dataArray[0].equalsIgnoreCase(departure) && dataArray[1].equalsIgnoreCase(destination))		//departure, destination과 일치하는 정보면 break
				break;			
		}
		inputStream.close();
		
		return dataArray;
	}
}
