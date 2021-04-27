package test;

import java.util.Scanner;

public class AdvancedLevel extends PlayerLevel {

	@Override
	//중급 클래스는 곱하기와 더하기 연산이 나옵니다.
	public void question() {
		int x = (int) (Math.random() * 10) + 1;
		int y = (int) (Math.random() * 9) + 1;
		int z = (int) (Math.random() * 100) + 1;
		
		System.out.printf("%d * %d + %d = ?\n", x, y, z);
		System.out.print("정답: ");
		
		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();
		
		if(answer == x * y + z) {
			System.out.println("===== 고급 레벨로 넘어갑니다. =====");
			next();
		} else {
			System.out.println("정답이 아닙니다.");
			question();
		}
			
	}
	

	@Override
	public void next() {
		SuperLevel level = new SuperLevel();
		level.question();
	}


}
