package step1_02.variable;


public class VarEx02_문제 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int salary = 100;
		System.out.println(salary*12*0.9+"원");		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int score1=30;
		int score2	=50;
		int score3=4;
		int average = score1+score2+score3/3 ;
		System.out.println(average +"원");
		
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int width =3;
		int height =6;
		System.out.println(width*height /2);
		
		//문제4) 100초를 1분 40초로 출력
		int time=100;
		System.out.println(time/60+"분"+time%60+"초");
		
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		//정답5) 500원(1개), 100원(3개) 
        int money = 800;
        int fivehund = money/500;
        int onehund = money%500;
        
        System.out.println("500원"+fivehund+"100원"+onehund);
        }

}
