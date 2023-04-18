package warOfFlowers;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PlayerDAO jdbc = new PlayerDAO();
		CardController cardController = new CardController();
		Frame frame = new Frame();
		
		
		int select;
		while(true) {
			System.out.print("[1]로그인 [2]회원가입 >> ");
			select = sc.nextInt();
			if(select==1) { //로그인
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.println("NICK 입력 : ");
				String nick = sc.next();

				
				System.out.print("[1]게임시작 [2]랭킹조회 [3]게임종료 >> ");
				int mode = sc.nextInt();
				if(mode == 1) {
					Card card1 = cardController.getRandomCard();
					Card card2 = cardController.getRandomCard();
					Card card3 = cardController.getRandomCard();
					
					frame.makeFlower(card1.getNumber());
					frame.makeFlower(card2.getNumber());
					frame.makeFlower(card3.getNumber());
				}
				
				
			}else if(select==2) {//회원가입
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.println("NICK 입력 : ");
				String nick = sc.next();
				
				
				
		
			}else {
				System.out.println("번호를 다시 입력해 주세요");
			}
		}
		
		
		
		
		
	}

}
