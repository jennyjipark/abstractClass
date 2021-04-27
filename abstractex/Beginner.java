package test;

import java.util.Scanner;

public class Beginner extends PlayerLevel {

	
	@Override
	//초급 클래스는 1~9까지 더하기 연산이 나옵니다.
	public void question() {
		int x = (int) (Math.random() * 9) + 1;
		int y = (int) (Math.random() * 9) + 1;
		
		System.out.printf("%d + %d = ?\n", x, y);
		System.out.print("정답: ");
		
		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();
		
		if(answer == x + y) {
			System.out.println("===== 중급 레벨로 넘어갑니다. =====");
			next();
		} else {
			System.out.println("정답이 아닙니다.");
			question();
		}
		
	}


	@Override
	public void next() {
		AdvancedLevel level = new AdvancedLevel();
		level.question();

	}


}
