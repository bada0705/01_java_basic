package step1_05.constrolStatement;
/*
 * 
 * 
 * 
 *  # 조건문 if 
 * 
 *  조건식이 true이면 실행되는 구문 ( false면 실행 x )
 *  
 *  [ 형식 ]
 *  
 *  if (조건식) {
 *  
 *  	조건식이 true일때 실행할 명령어;
 *  
 *  }
 * 
 * 
 * */

public class IfEx01 {

	public static void main(String[] args) {
		
		if (true) {//if문 안에 종속된 명령어는 tab으로 들여쓰기 한 후에 작성한다.		
			System.out.println("실행 0");}
			
		int number = 12;
		
		if (number % 2 == 0) {
			System.out.println("짝수"); 
			System.out.println("짝수"); 
			System.out.println("짝수"); 
		}
		if (number % 2 == 1) {
				System.out.println("홀수");
				}
		
		System.out.println();
		if (number == 9)
			System.out.println("데이터는 9입니다");
		
	    
}

}
	
		



