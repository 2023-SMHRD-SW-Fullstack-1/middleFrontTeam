package warOfFlowers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	

	public static void main(String[] args) throws InterruptedException {
		PlayerDTO player = null;
		Scanner sc = new Scanner(System.in);
		PlayerDAO dao = new PlayerDAO();
		FrameController frame = null;
		Win_Lose winLose = new Win_Lose();
		SoundController sound = new SoundController();
		DieAlgorithm die = new DieAlgorithm();
		ASCII asc = new ASCII(new StringBuilder());

		int select;
		boolean check = false;
		int stop = -1;
		int user, user_1, user_score, com1, com1_score, com2, com2_score = 0;
		int com1_1 = 0;
		int com2_1 = 0;
		
		
		String a ="\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+"◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇\r\n"
				+ "◇                  _______. __    __  .___________.         _______       ___                      ◇\r\n"
				+ "◇                  /       ||  |  |  | |           |        |       \\     /   \\                    ◇\r\n"
				+ "◇                 |   (----`|  |  |  | `---|  |----` ______ |  .--.  |   /  ^  \\                   ◇\r\n"
				+ "◇                  \\   \\    |  |  |  |     |  |     |______||  |  |  |  /  /_\\  \\                  ◇\r\n"
				+ "◇              .----)   |   |  `--'  |     |  |             |  '--'  | /  _____  \\                 ◇\r\n"
				+ "◇              |_______/     \\______/      |__|             |_______/ /__/     \\__\\                ◇ \r\n"
				+ "◇                                                                                                  ◇\r\n"
				+ "◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇";
		System.out.println(a);
		System.out.println("게임을 시작하려면 1번을 누르세요");
		int start = sc.nextInt();
		if(start==1) {
			stop =0;
		}
		

		Label : while (stop == 0) {

			if (check == false) {
				sound.playStart();
				
				for (int i = 0; i < 6; i++) {

					asc.sign();
					Thread.sleep(5 * 50); // 일정기간동안 진행을 멈추어 반복 -> 반짝이는 효과
					asc.drawSign();
					Thread.sleep(5 * 50);
					asc.drawNewSign();
					if (i == 5) {
						asc.drawNewSign2();
					}
					
				}


				System.out.println("\n" +asc.rabbit());
				System.out.printf("%50s", "[1]로그인    [2]회원가입 ");
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < 31; i++) {
					sb.append("\n");
				}
				System.out.println(sb);
				select = sc.nextInt();
				if (select == 1) { // 로그인
					System.out.printf("%40s", "ID 입력 : ");
					String id = sc.next();
					System.out.printf("%40s", "PW 입력 : ");
					String pw = sc.next();
					
					player = dao.login(id, pw);
					if (player != null) {
						sound.playLogin();
						System.out.printf("\n%55s", player.getNickname() + "님이 로그인 되었습니다." + "\n");
						System.out.printf("%55s", player.getNickname() + "님 현재 포인트 : " + player.getPoint() + "\n\n\n");
						check = true;
						frame = new FrameController(player);
						frame.makePlayer();
						continue;
					} else {
						System.out.println("\n로그인 실패! 다시 입력 해주세요");
						Thread.sleep(40 * 50);
					}

				} else if (select == 2) {// 회원가입
					System.out.printf("%40s", "ID 입력 : ");
					String joinId = sc.next();
					System.out.printf("%40s", "PW 입력 : ");
					String joinPw = sc.next();
					System.out.printf("%40s", "NICK 입력 : ");
					String joinNick = sc.next();

					if (joinNick.length() > 7 || joinId.length() > 7 || joinNick.length() < 3 || joinId.length() < 3) {
						System.out.printf("\n%55s", "ID와 NICK은 3글자 이상 최대 7글자까지 가능합니다.\n");
						Thread.sleep(40 * 50);
						continue;
					}

					Boolean join = dao.signup(joinId, joinPw, joinNick);
					if (join == true) {
						sound.playLogin();
						System.out.printf("\n%50s", "회원가입 완료!\n");
						Thread.sleep(30 * 50);

					} else {
						System.out.printf("\n%55s", "중복된 아이디 입니다.\n");
						Thread.sleep(40 * 50);
					}

				} else {
					System.out.printf("\n%55s", "번호를 다시 입력해 주세요\n");
					Thread.sleep(40 * 50);
				}
			}

			if (check == true) {
				while (true) {
					System.out.printf(
							"------------------------------------------------------------------------------------------------------\n\n");
					System.out.printf("%55s", "[1]게임시작 [2]랭킹조회 [3]게임종료 ");
					int mode = sc.nextInt();

					frame.deleteFlower();
					frame.changeComDieImage(false, 1);
					frame.changeComDieImage(false, 2);
					if (mode == 1 && player.getPoint() > 0) {// 게임시작
						sound.playShuffle();

						user = frame.makeFlower();
						com1 = frame.makeFlower();
						com2 = frame.makeFlower();
						die.setC1(die.die(com1, user, com2));
						die.setC2(die.die(com2, user, com1));

						while(true) {
							System.out.printf("\n%55s", "[1]콜   [2]다이  [3]족보보기 ");
							select = sc.nextInt();
							
							if (select == 1) {// 콜
								sound.playDealing();

								if (die.getC1() && die.getC2()) {// 둘다 죽었을때
									frame.makeBlankFlower();
									frame.makeBlankFlower();
									frame.makeBlankFlower();
									frame.changeComDieImage(true, 1);//
									frame.changeComDieImage(true, 2);//
									System.out.printf("\n%50s", "컴퓨터 1, 컴퓨터 2 다이\n");
									continue;
									
								} else if (die.getC2()) {// 컴2이 죽었을때
									user_1 = frame.makeFlower();
									com1_1 = frame.makeFakeFlower();
									frame.makeBlankFlower();
									frame.changeComDieImage(true, 2);//
									System.out.printf("%50s", "컴퓨터 2 다이");
									
								} else if (die.getC1()) {// 컴1 죽었을때
									user_1 = frame.makeFlower();
									frame.makeBlankFlower();
									com2_1 = frame.makeFakeFlower();
									frame.changeComDieImage(true, 1); //
									System.out.printf("%50s", "컴퓨터 1 다이");
									
								}

								else {// 아무도 안죽었을때
									user_1 = frame.makeFlower();
									com1_1 = frame.makeFakeFlower();
									com2_1 = frame.makeFakeFlower();
									
								}
								System.out.printf("\n%52s", "[1]오픈 [2]하프 ");
								select = sc.nextInt();
								System.out.printf("------------------------------------------------------------------------------------------------------\n\n");
								
								if (select == 1) {// 오픈
									sound.playDealing();
									
									if (die.getC1() && die.getC2() == false) {// 컴1이 죽었을때
										frame.openFlower(1);
										user_score = winLose.score(user, user_1);
										com1_score = -1;
										com2_score = winLose.score(com2, com2_1);

										System.out.printf("%50s",
												player.getNickname() + "님의 패 : " + winLose.scoreLevel(user_score) + "\n");
										System.out.printf("%50s", "컴퓨터2의 패 : " + winLose.scoreLevel(com2_score) + "\n");

									} else if (die.getC2() && die.getC1() == false) {// 컴2이 죽었을때
										frame.openFlower(2);
										user_score = winLose.score(user, user_1);
										com2_score = -1;
										com1_score = winLose.score(com1, com1_1);
										System.out.printf("%50s",
												player.getNickname() + "님의 패 : " + winLose.scoreLevel(user_score) + "\n");
										System.out.printf("%50s", "컴퓨터1의 패 : " + winLose.scoreLevel(com1_score) + "\n");

									} else if (die.getC2() && die.getC1()) {
										frame.openFlower(3);
										user_score = winLose.score(user, user_1);
										com2_score = -1;
										com1_score = -1;
										System.out.printf("%50s",
												player.getNickname() + "님의 패 : " + winLose.scoreLevel(user_score) + "\n");
										System.out.printf("%50s", "컴퓨터1의 패 : " + winLose.scoreLevel(com1_score) + "\n");
										
									} else {// 아무도 안죽었을때
										frame.openFlower();
										user_score = winLose.score(user, user_1);
										com1_score = winLose.score(com1, com1_1);
										com2_score = winLose.score(com2, com2_1);

										System.out.printf("%50s",
												player.getNickname() + "님의 패 : " + winLose.scoreLevel(user_score) + "\n");
										System.out.printf("%50s", "컴퓨터1의 패 : " + winLose.scoreLevel(com1_score) + "\n");
										System.out.printf("%50s", "컴퓨터2의 패 : " + winLose.scoreLevel(com2_score) + "\n");
										
									}

									if (winLose.result(user_score, com1_score, com2_score) == 2) {
										System.out.println(asc.win());
										sound.playWin();
										player.setPoint(player.getPoint() + 200);
										dao.setPoint(player);
										System.out.printf("\n%55s", "+200 포인트 획득!\n");
										System.out.printf("%55s",
												player.getNickname() + "님 현재 포인트 : " + player.getPoint() + "\n");
										
									} else if (winLose.result(user_score, com1_score, com2_score) == 0) {
										System.out.println("\n" + asc.lose());
										sound.playLose();
										player.setPoint(player.getPoint() - 200);
										dao.setPoint(player);
										System.out.printf("\n%55s", "-200포인트 감점\n");
										System.out.printf("%55s",
												player.getNickname() + "님 현재 포인트 : " + player.getPoint() + "\n");

									} else {
										System.out.println("\n" + asc.draw());

									}

									frame.rePaintMoney(player);
									break;

								} else if (select == 2) {// 하프
									System.out.printf("%55s", "배팅포인트가 2배로 올라갑니다.\n\n");
									frame.openFlower();
									user_score = winLose.score(user, user_1);
									com1_score = winLose.score(com1, com1_1);
									com2_score = winLose.score(com2, com2_1);

									System.out.printf("%55s", "나의 패 : " + winLose.scoreLevel(user_score) + "\n");
									System.out.printf("%55s", "컴퓨터1의 패 : " + winLose.scoreLevel(com1_score) + "\n");
									System.out.printf("%55s", "컴퓨터2의 패 : " + winLose.scoreLevel(com2_score) + "\n");

									if (winLose.result(user_score, com1_score, com2_score) == 2) {
										System.out.println("\n" + asc.win());
										sound.playWin();
										player.setPoint(player.getPoint() + 400);
										dao.setPoint(player);
										System.out.printf("%55s", "+400 포인트 획득!\n");
										System.out.printf("%55s",
												player.getNickname() + "님 현재 포인트 : " + player.getPoint() + "\n");
										
									} else if (winLose.result(user_score, com1_score, com2_score) == 0) {
										System.out.println("\n" + asc.lose());
										sound.playLose();
										player.setPoint(player.getPoint() - 400);
										dao.setPoint(player);
										System.out.printf("\n%55s", "-400포인트 감점\n");
										System.out.printf("%55s",
												player.getNickname() + "님 현재 포인트 : " + player.getPoint() + "\n");

									} else {
										System.out.println("\n" + asc.draw());

									}

									frame.rePaintMoney(player);
									Thread.sleep(20 * 50);
									break;

								}

							} else if (select == 2) {// 첫번째패에서 다이
								frame.deleteFlower();
								player.setPoint(player.getPoint() - 50);
								dao.setPoint(player);
								System.out.printf("%55s", "포인트 점수가 -50 되었습니다\n");
								System.out.printf("%55s", "현재 나의 포인트 점수 : " + player.getPoint() + "\n");
								frame.rePaintMoney(player);
								break;

							} else if (select == 3) {// 족보보기
								frame.showPriority();
								continue;
							}

							else {
								System.out.printf("%55s", "번호를 다시 입력하세요\n");
							}
						}
						

					} else if (mode == 2) {// 랭킹조회
						ArrayList<PlayerDTO> playerList = dao.getRankedList();
						for (int i = 0; i < playerList.size(); i++) {
							String id = playerList.get(i).getId();
							String nick = playerList.get(i).getNickname();
							int point = playerList.get(i).getPoint();
//							System.out.printf("%60s",i + 1 + ". " + "ID : " + id + "\t NICK : " + nick + "\t POINT : " + point + "\n\n");
							System.out.printf("\t\t%3d.\tID : %-8s\t NICK : %-16s\t POINT : %9d\n\n",i + 1 ,id, nick, point);

						}

					} else if (mode == 3) {// 게임종료
						System.out.printf("%55s", "게임을 종료합니다\n");
						frame.deleteFlower();
						stop = 1;
						break Label;
					} else if (player.getPoint() <= 0) {
						System.out.printf("%55s", "포인트가 부족합니다. 충전하세요\n");
						check = false;
						break;
					} else {
						System.out.printf("%55s", "번호를 다시 입력해 주세요\n");
					}
					
				}
			}

		}

	}

}
