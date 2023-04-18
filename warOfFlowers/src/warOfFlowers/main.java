package warOfFlowers;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PlayerDAO dao = new PlayerDAO();
		CardController cardController = new CardController();
		Frame frame = new Frame();
		
		PlayerDTO player;
		int select;
		while(true) {
			System.out.print("[1]로그인 [2]회원가입 >> ");
			select = sc.nextInt();
			if(select==1) { //로그인
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				
				player = dao.login(id, pw);
				if(player != null) {
					System.out.println(player.getNickname()+"님이 로그인 되었습니다");
				}else {
					System.out.println("로그인 실패! 다시 입력 해주세요");
				}
				

				while(true) {
					System.out.print("[1]게임시작 [2]랭킹조회 [3]게임종료 >> ");
					int mode = sc.nextInt();
					if(mode == 1) {//게임시작
						Card card1 = cardController.getRandomCard();
						Card card2 = cardController.getRandomCard();
						Card card3 = cardController.getRandomCard();
						
						frame.makeFlower(card1.getNumber());
						frame.makeFlower(card2.getNumber());
						frame.makeFlower(card3.getNumber());
						System.out.print("[1]콜 [2]다이 >> ");
						select = sc.nextInt();
						if(select==1) {
							
							frame.makeFlower(card1.getNumber());
							frame.makeFlower(card2.getNumber());
							frame.makeFlower(card3.getNumber());
							
						}else if(select==2) {
							frame.deleteFlower();
							
						}else {
							System.out.println("번호를 다시 입력하세요");
						}
						
						
					}else if(mode == 2) {
						
						
					}else if(mode == 3) {
						System.out.println("게임을 종료합니다");
						break;
					}else {
						System.out.println("번호를 다시 입력해 주세요");
					}
				}
				
				
				
			}else if(select==2) {//회원가입
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("NICK 입력 : ");
				String nick = sc.next();
				
				Boolean join = dao.signup(id, pw, nick);
				if(join==true) {
					System.out.println("회원가입 완료!");
				}else {
					System.out.println("중복된 아이디 입니다.");
				}
				
				
				
		
			}else {
				System.out.println("번호를 다시 입력해 주세요");
			}
		}
		
		
		
		
		
	}

}
