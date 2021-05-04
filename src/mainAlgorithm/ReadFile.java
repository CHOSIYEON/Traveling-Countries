package mainAlgorithm;

import java.util.*;
import java.io.*;

public class ReadFile {
	private static String fileName;			//file name to read
	private static Scanner inputStream = null;

	public ReadFile(String fileName) {
		this.fileName = fileName;
	}

	//������� �������� �ش��ϴ� edge ������ �о�´�.
	public static String[] readEdges(String departure, String destination) {
		try {
			inputStream = new Scanner(new File(fileName));
		} catch(FileNotFoundException e) {
			System.out.println("Error opening the file: " + fileName);
			System.exit(0);
		}
		//���Ͽ��� ���� �о�ͼ� ����
		String[] dataArray = null;
		while(inputStream.hasNextLine()) {
			String temp = inputStream.nextLine();		//file���� data�� �� �پ� �о��
			dataArray = temp.split(" ");		//" "�� �������� split
			if (dataArray[0].equalsIgnoreCase(departure) && dataArray[1].equalsIgnoreCase(destination))		//departure, destination�� ��ġ�ϴ� ������ break
				break;			
		}
		inputStream.close();
		
		return dataArray;
	}
}
