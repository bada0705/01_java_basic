package step1_03.operator;
/*
 * 
 * 
 * 증감 연산자
 * += , -=,*=/=%=,++,--
 * 
 */
public class OpEx07 {

	public static void main(String[] args) {
	int tempData1 = 100;
	tempData1 -= 3; //tempData1 = tempData1- 3;
	
	System.out.println(tempData1);
	 
	int tepmData2 = 10;
	tepmData2  += 100; //tepmData2 =tepmData2+100;
	System.out.println(tepmData2 );
	
	int tepmData3 = 100;
	tepmData3 *= 7; //tempData3 =tempData3 *7;
			System.out.println(tepmData3);
	/* 
	 ++연산자와 --연사자는 +1,-1만 존재하며 곱하기 나눕셈 연산기능은 존재하지 않는다
	 
	++변수, 변수++의 연산자는 명령어가 독립적으로 수행되면 
	똑같은 기능을 하지만 앞의 명령어의 여부에 따라서 
	++의 기능이 적용되는 시점의 차이가 생긴다.
	
	
	x=x+1;
	x +=1;
	x++; //++은 +1만 가능
	++x;
	
	x=x-1;
	x-= 1;
	x--;
	--x;   
	
	
	
	*/
			int x = 0;	
			System.out.println(x++);
			System.out.println(x);
          
			
		    int y = 0;

			System.out.println(++y);
			System.out.println(y);
		    
	}

}
