package step1_06.loop;
/*
 * while문 연습 예시
 * 
 */
public class LoopEx02 {

	public static void main(String[] args) {
		//예시1 )
		int i = 1;
		
		while (i<=10) {
			if(i>=5 && i<9) {
			
			System.out.println(i);
			}
			i++;			
		}
		//예시 2)
		i=10;
		while (i>=1) {
			if(i>=3 && i<=6) {
			System.out.println(i);
			}
			i--;
		}
		
		
		//예시3
		i=1 ;
		while (i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		
		
		
			}

}
