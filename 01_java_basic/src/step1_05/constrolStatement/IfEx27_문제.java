package step1_05.constrolStatement;

import java.util.Scanner;

/*
 * # 달력 일수 출력
 * 
 * 키보드로 월을 입력받아서 월에 해당하는 일수를 화면에 출력
 * 
 * 참고)
 * 1월  : 31일
 * 2월  : 28일
 * 3월  : 31일
 * 4월  : 30일
 * 5월  : 31일
 * 6월  : 30일
 * 7월  : 31일
 * 8월  : 31일
 * 9월  : 30일
 * 10월 : 31일
 * 11월	: 30일
 * 12월 : 31일
 * 
 * */

public class IfEx27_문제 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.print("월 입력: ");
		int getMonth = scan.nextInt();
		switch(getMonth) {
		case 2 :
			System.out.println("28일");
			break ;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("30일");
		default: 
			System.out.println("31 일 입니다.");
			
		
		}
	
		scan.close();

	}

}
