package step1_05.constrolStatement;

import java.util.Random;

/*
 * 
 * 랜덤 라이브러리 ( if와 관련 x )
 * 
 *  -  .nextInt(범위) : 0부터 ~ 범위-1 사이의 난수가 생성 된다.
 * 
 * */


public class IfEx13 {

	public static void main(String[] args) {
	
		Random ran = new Random ();
		// 0~ 9 사이의 난수  생성
		
		int rNum1 =	ran.nextInt(10);
		System.out.println(rNum1);
		
		//100~200 사이의 난수 생성
		int rNum2 = ran.nextInt(101)+100;//[0~100] + 100
		System.out.println(rNum2);
		
		// -3~ 3사이의 랜덤값
		int rNum3= ran.nextInt(7)-3; //[0~6]-3
	
		System.out.println(rNum3);
		
		
		
		
		
		
		
		
		
	}

}
