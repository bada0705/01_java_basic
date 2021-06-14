package step1_02.variable;
/*
 * 
 *  상수 ( constant ) 
 * 
 * 	- 변경되면 안되는 데이터의 보호를 위해 사용한다.
 *  - final 키워드를 사용하여 만든다.
 * 
 * 
 * */


public class VarEx04 {

	public static void main(String[] args) {
		//변수 
		int topValue = 100;
		topValue = 99; // 변경 가능;
		
		//상수
		final int TOP_VALUE = 100;
		// TOP_VALUE = 999;   // 변경 불가능; 전부다 대문자 사용
		
		
		
		
		
	
	}

}
