package step1_05.constrolStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int coin = ran.nextInt(2);
		
		
		System.out.println("동전의 앞면(0),동전의 뒷면(1)   :   ");
		
		int me = scan.nextInt();
		
		if(coin == me);         System.out.println("정답입니다");
		if(coin!=me);  			System.out.println("틀렸습니다");
			
		scan.close();
		


	}

}
