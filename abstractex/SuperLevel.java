package test;

import java.util.Scanner;

public class SuperLevel extends PlayerLevel {
	
	@Override
	//고급 클래스는 곱하기 연산이 나옵니다.
	public void question() {
		int x = (int) (Math.random() * 10) + 1;
		int y = (int) (Math.random() * 10) + 1;
		int z = (int) (Math.random() * 100) + 1;
		
		System.out.printf("%d * %d * %d = ?\n", x, y, z);
		System.out.print("정답: ");
		
		Scanner scan = new Scanner(System.in);
		int answer = scan.nextInt();
		
		if(answer == x * y * z) {
			System.out.println("===== 미션 완료! =====");
			System.out.println("게임 다시 하기");
			System.out.println("yes: 0, no: 1");
			
			int answer2 = scan.nextInt();
			
			if(answer2 == 0) {
				System.out.println("===== 게임을 다시 시작합니다. =====");
				Beginner begin = new Beginner();
				begin.question();
			}
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
