package warOfFlowers;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static PlayerDTO player = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PlayerDAO dao = new PlayerDAO();
		CardController cardController = new CardController();
		Frame frame = new Frame();
		Win_Lose winLose = new Win_Lose();

		
		int select;
		boolean check = false;
		int stop = 0;

		while (stop==0) {

			if (check == false) {
				System.out.print("[1]로그인 [2]회원가입 >> ");
				select = sc.nextInt();
				if (select == 1) { // 로그인
					System.out.print("ID 입력 : ");
					String id = sc.next();
					System.out.print("PW 입력 : ");
					String pw = sc.next();

					player = dao.login(id, pw);
					if (player != null) {
						System.out.println(player.getNickname() + "님이 로그인 되었습니다. 현재 포인트 : "+player.getPoint());
						check = true;
						continue;
					} else {
						System.out.println("로그인 실패! 다시 입력 해주세요");
					}

				} else if (select == 2) {// 회원가입
					System.out.print("ID 입력 : ");
					String joinId = sc.next();
					System.out.print("PW 입력 : ");
					String joinPw = sc.next();
					System.out.print("NICK 입력 : ");
					String joinNick = sc.next();
					
					if(joinNick.length()>7 || joinId.length()>7) {
						System.out.println("ID와 NICK은 최대 7글자까지 가능합니다.");
						continue;
					}

					Boolean join = dao.signup(joinId, joinPw, joinNick);
					if (join == true) {
						System.out.println("회원가입 완료!");
					} else {
						System.out.println("중복된 아이디 입니다.");
					}

				} else {
					System.out.println("번호를 다시 입력해 주세요");
				}
			}

			if (check == true) {
				while (true) {
					
					frame.makePlayer();
					System.out.print("[1]게임시작 [2]랭킹조회 [3]게임종료 >> ");
					int mode = sc.nextInt();

					frame.deleteFlower();
					if (mode == 1) {// 게임시작

						int user = frame.makeFlower();
						int com1 = frame.makeFlower();
						int com2 = frame.makeFlower();

						System.out.print("1.콜 2.다이 3.족보보기 >> ");
						select = sc.nextInt();
						if (select == 1) {// 콜

							int user_1 = frame.makeFakeFlower();
							int com1_1 = frame.makeFakeFlower();
							int com2_1 = frame.makeFakeFlower();

							System.out.print("1.오픈 2.다이 >> ");
							select = sc.nextInt();
							if (select == 1) {//오픈
								frame.openFlower();
								int user_score = winLose.score(user, user_1);
								int com1_score = winLose.score(com1, com1_1);
								int com2_score = winLose.score(com2, com2_1);

								System.out.println("나의 패 : " + winLose.scoreLevel(user_score));
								System.out.println("컴퓨터1의 패 : " + winLose.scoreLevel(com1_score));
								System.out.println("컴퓨터2의 패 : " + winLose.scoreLevel(com2_score));
								if (winLose.result(user_score, com1_score, com2_score)) {
									System.out.println("           _        " + "");
									System.out.println("          (_)       " + "");
									System.out.println("__      __ _  _ __  " + "");
									System.out.println("\\ \\ /\\ / /| || '_ \\ " + "");
									System.out.println(" \\ V  V / | || | | |" + "");
									System.out.println("  \\_/\\_/  |_||_| |_|" + "");

									player.setPoint(player.getPoint() + (user_score*10));
									dao.setPoint(player);
									System.out.println("+"+user_score*10 +"포인트 획득!");
									System.out.println(player.getNickname() + "님 현재 포인트 : "+player.getPoint());
								} else {
									System.out.println(" _                   ");
									System.out.println("| |                  " + "");
									System.out.println("| |  ___   ___   ___ " + "");
									System.out.println("| | / _ \\ / __| / _ \\" + "");
									System.out.println("| || (_) |\\__ \\|  __/" + "");
									System.out.println("|_| \\___/ |___/ \\___|" + "");
									player.setPoint(player.getPoint() - (user_score*10));
									dao.setPoint(player);
									System.out.println("-"+user_score*10 +"포인트 감점");
									System.out.println(player.getNickname() + "님 현재 포인트 : "+player.getPoint());
								

								}
							}else if(select==2) {//두번째패에서 다이
								frame.deleteFlower();
								player.setPoint(player.getPoint() - 100);
								dao.setPoint(player);
								System.out.println("포인트 점수가 -100 되었습니다");
								System.out.println("현재 나의 포인트 점수 : "+player.getPoint());
								break;
							}
							

						} else if (select == 2) {//첫번째패에서 다이
							frame.deleteFlower();
							player.setPoint(player.getPoint() - 50);
							dao.setPoint(player);
							System.out.println("포인트 점수가 -50 되었습니다");
							System.out.println("현재 나의 포인트 점수 : "+player.getPoint());

						} else if (select == 3) {// 족보보기
							frame.showPriority();
						}

						else {
							System.out.println("번호를 다시 입력하세요");
						}

					} else if (mode == 2) {// 랭킹조회
						ArrayList<PlayerDTO> playerList = dao.getRankedList();
						for (int i = 0; i < playerList.size(); i++) {
							String id = playerList.get(i).getId();
							String nick = playerList.get(i).getNickname();
							int point = playerList.get(i).getPoint();
							System.out.print(i + 1 + ". " + "ID : " + id + "\t NICK : " + nick + "\t POINT : " + point);
							System.out.println();
						}

					} else if (mode == 3) {// 게임종료
						System.out.println("게임을 종료합니다");
						frame.deleteFlower();
						stop = 1;
						break;
					} else {
						System.out.println("번호를 다시 입력해 주세요");
					}

				}
			}

		}

	}

}
