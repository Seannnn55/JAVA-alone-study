package sec04.exam05;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args)throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		String inputData1;
		String inputData2;
		String inputData3;

		
		inputData1=scanner.nextLine();
		inputData2=scanner.nextLine();
		inputData3=scanner.nextLine();

		
		System.out.printf("1. 이름: %15s\n",inputData1);
		System.out.printf("2. 주민번호 앞 6자리: %15s\n",inputData2);
		System.out.printf("3.전화번호: %15s\n",inputData3);
		
		
		
		

	}

}
