package test;

import java.util.Scanner;

public class Player {

	private PlayerLevel level;
	private String id;
	private String pw;
	
	public Player() {
		level = new Beginner();
	}
	
	
	public Player regist() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		this.id = scan.nextLine();
	
		System.out.print("비밀번호: ");
		this.pw = scan.nextLine();
		
		System.out.println(id + "님 환영합니다. 플레이를 시작합니다.");
		
		Beginner begin = new Beginner();
		begin.question();
		
		//플레이어 객체 만들기
		Player name = new Player();
		
		return name;
	}


	public void levelUp(PlayerLevel level) {
		System.out.println("==== Level UP!! =====");
		this.level = level;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	

}
