package warOfFlowers;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static PlayerDTO player = null;

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		PlayerDAO dao = new PlayerDAO();
		FrameController frame = new FrameController();
		Win_Lose winLose = new Win_Lose();
		SoundController sound = new SoundController();
		DieAlgorithm die = new DieAlgorithm();
		ASCII asc = new ASCII();

		int select;
		boolean check = false;
		int stop = 0;
		int user = 0;
		int user_1 = 0;
		int user_score = 0;
		int com1 = 0;
		int com1_1 = 0;
		int com1_score = 0;
		int com2 = 0;
		int com2_1 = 0;
		int com2_score = 0;

		while (stop == 0) {

			if (check == false) {

				for (int i = 0; i < 6; i++) {

					asc.sign();
					Thread.sleep(5 * 50); // 일정기간동안 진행을 멈추어 반복 -> 반짝이는 효과
					// asc.clearScreen();
					asc.drawSign();
					// asc.clearScreen();
					Thread.sleep(5 * 50);
					// asc.clearScreen();
					asc.drawNewSign();
					// asc.clearScreen();

					if (i == 5) {
						asc.drawNewSign2();
					}
				}

				System.out.println();
				System.out.println(asc.rabbit());
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
					System.out.println("\n");

					player = dao.login(id, pw);
					if (player != null) {
						System.out.printf("%55s", player.getNickname() + "님이 로그인 되었습니다." + "\n");
						System.out.printf("%55s", player.getNickname() + "님 현재 포인트 : " + player.getPoint() + "\n");
						System.out.println("\n");
						check = true;
						frame.makePlayer();
						continue;
					} else {
						System.out.println();
						System.out.println("로그인 실패! 다시 입력 해주세요");
						Thread.sleep(40 * 50);
					}

				} else if (select == 2) {// 회원가입
					System.out.printf("%40s","ID 입력 : ");
					String joinId = sc.next();
					System.out.printf("%40s","PW 입력 : ");
					String joinPw = sc.next();
					System.out.printf("%40s","NICK 입력 : ");
					String joinNick = sc.next();

					if (joinNick.length() > 7 || joinId.length() > 7 || joinNick.length() < 3 || joinId.length() < 3) {
						System.out.println();
						System.out.printf("%55s","ID와 NICK은 3글자 이상 최대 7글자까지 가능합니다.\n");
						Thread.sleep(40 * 50);
						continue;
					}

					Boolean join = dao.signup(joinId, joinPw, joinNick);
					if (join == true) {
						System.out.println();
						System.out.printf("%50s","회원가입 완료!\n");
						Thread.sleep(30 * 50);
					} else {
						System.out.println();
						System.out.printf("%55s","중복된 아이디 입니다.\n");
						Thread.sleep(40 * 50);
					}

				} else {
					System.out.println();
					System.out.printf("%55s","번호를 다시 입력해 주세요\n");
					Thread.sleep(40 * 50);
				}
			}

			if (check == true) {
				while (true) {
					System.out.printf("------------------------------------------------------------------------------------------------------\n\n");
					System.out.printf("%55s", "[1]게임시작 [2]랭킹조회 [3]게임종료 ");
					int mode = sc.nextInt();
					System.out.println("\n");

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

						System.out.printf("%55s", "[1]콜   [2]다이  [3]족보보기 ");
						select = sc.nextInt();
						System.out.println();
						if (select == 1) {// 콜
							sound.playDealing();

							if (die.getC1() && die.getC2()) {// 둘다 죽었을때
								frame.makeBlankFlower();
								frame.makeBlankFlower();
								frame.makeBlankFlower();
								frame.changeComDieImage(true, 1);//
								frame.changeComDieImage(true, 2);//

								System.out.printf("%50s", "컴퓨터 1, 컴퓨터 2 다이");
								System.out.println();
								continue;
							} else if (die.getC2()) {// 컴2이 죽었을때
								user_1 = frame.makeFlower();
								com1_1 = frame.makeFakeFlower();
								frame.makeBlankFlower();
								frame.changeComDieImage(true, 2);//

								System.out.printf("%50s", "컴퓨터 2 다이");
								System.out.println();
								System.out.printf("%52s", "[1]오픈 [2]하프 ");
							} else if (die.getC1()) {// 컴1 죽었을때
								user_1 = frame.makeFlower();
								frame.makeBlankFlower();
								com2_1 = frame.makeFakeFlower();
								frame.changeComDieImage(true, 1); //

								System.out.printf("%50s", "컴퓨터 1 다이");
								System.out.println();
								System.out.printf("%52s", "[1]오픈 [2]하프 ");
							}

							else {// 아무도 안죽었을때
								user_1 = frame.makeFlower();
								com1_1 = frame.makeFakeFlower();
								com2_1 = frame.makeFakeFlower();

								System.out.println();
								System.out.printf("%50s", "[1]오픈 [2]하프 ");
							}

							select = sc.nextInt();
							System.out.printf("------------------------------------------------------------------------------------------------------\n\n");
							if (select == 1) {// 오픈

								if (die.getC1() && die.getC2() == false) {// 컴1이 죽었을때
									sound.playDealing();
									frame.openFlower(1);
									user_score = winLose.score(user, user_1);
									com1_score = -1;
									com2_score = winLose.score(com2, com2_1);

									System.out.printf("%50s",
											player.getNickname() + "님의 패 : " + winLose.scoreLevel(user_score) + "\n");
									System.out.printf("%50s", "컴퓨터2의 패 : " + winLose.scoreLevel(com2_score) + "\n");

								} else if (die.getC2() && die.getC1() == false) {// 컴2이 죽었을때
									sound.playDealing();
									frame.openFlower(2);
									user_score = winLose.score(user, user_1);
									com2_score = -1;
									com1_score = winLose.score(com1, com1_1);
									System.out.printf("%50s",
											player.getNickname() + "님의 패 : " + winLose.scoreLevel(user_score) + "\n");
									System.out.printf("%50s", "컴퓨터1의 패 : " + winLose.scoreLevel(com1_score) + "\n");

								} else if (die.getC2() && die.getC1()) {
									sound.playDealing();
									frame.openFlower(3);
									user_score = winLose.score(user, user_1);
									com2_score = -1;
									com1_score = -1;
									System.out.printf("%50s",
											player.getNickname() + "님의 패 : " + winLose.scoreLevel(user_score) + "\n");
									System.out.printf("%50s", "컴퓨터1의 패 : " + winLose.scoreLevel(com1_score) + "\n");
								}

								else {// 아무도 안죽었을때
									sound.playDealing();
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

									System.out.println();

									player.setPoint(player.getPoint() + 200);
									dao.setPoint(player);
									System.out.printf("%55s","+200 포인트 획득!\n");
									System.out.printf("%55s",player.getNickname() + "님 현재 포인트 : " + player.getPoint()+"\n");
								} else if (winLose.result(user_score, com1_score, com2_score) == 0) {
									System.out.println();
									System.out.println(asc.lose());

									System.out.println();
									player.setPoint(player.getPoint() - 200);
									dao.setPoint(player);
									System.out.printf("%55s","-200포인트 감점\n");
									System.out.printf("%55s",player.getNickname() + "님 현재 포인트 : " + player.getPoint()+"\n");

								} else {
									System.out.println();
									System.out.println(asc.draw());

								}

								frame.rePaintMoney(player);

							} else if (select == 2) {// 하프

								System.out.printf("%55s","배팅포인트가 2배로 올라갑니다.\n");

								sound.playDealing();
								frame.openFlower();
								user_score = winLose.score(user, user_1);
								com1_score = winLose.score(com1, com1_1);
								com2_score = winLose.score(com2, com2_1);

								System.out.printf("%55s","나의 패 : " + winLose.scoreLevel(user_score)+"\n");
								System.out.printf("%55s","컴퓨터1의 패 : " + winLose.scoreLevel(com1_score)+"\n");
								System.out.printf("%55s","컴퓨터2의 패 : " + winLose.scoreLevel(com2_score)+"\n");

								if (winLose.result(user_score, com1_score, com2_score) == 2) {
									System.out.println();
									System.out.println(asc.win());

									System.out.println();

									player.setPoint(player.getPoint() + 400);
									dao.setPoint(player);
									System.out.printf("%55s","+400 포인트 획득!\n");
									System.out.printf("%55s",player.getNickname() + "님 현재 포인트 : " + player.getPoint()+"\n");
								} else if (winLose.result(user_score, com1_score, com2_score) == 0) {
									System.out.println();
									System.out.println(asc.lose());

									System.out.println();
									player.setPoint(player.getPoint() - 400);
									dao.setPoint(player);
									System.out.printf("%55s","-400포인트 감점\n");
									System.out.printf("%55s",player.getNickname() + "님 현재 포인트 : " + player.getPoint()+"\n");

								} else {
									System.out.println();
									System.out.println(asc.draw());

								}

								frame.rePaintMoney(player);

							}

						} else if (select == 2) {// 첫번째패에서 다이
							frame.deleteFlower();
							player.setPoint(player.getPoint() - 50);
							dao.setPoint(player);
							System.out.printf("%55s","포인트 점수가 -50 되었습니다\n");
							System.out.printf("%55s","현재 나의 포인트 점수 : " + player.getPoint()+"\n");
							frame.rePaintMoney(player);

						} else if (select == 3) {// 족보보기
							frame.showPriority();
						}

						else {
							System.out.printf("%55s","번호를 다시 입력하세요\n");
						}

					} else if (mode == 2) {// 랭킹조회
						ArrayList<PlayerDTO> playerList = dao.getRankedList();
						for (int i = 0; i < playerList.size(); i++) {
							String id = playerList.get(i).getId();
							String nick = playerList.get(i).getNickname();
							int point = playerList.get(i).getPoint();
							System.out.printf("%60s",i + 1 + ". " + "ID : " + id + "\t NICK : " + nick + "\t POINT : " + point+"\n");
							System.out.println();
						}

					} else if (mode == 3) {// 게임종료
						System.out.printf("%55s","게임을 종료합니다\n");
						frame.deleteFlower();
						stop = 1;
						break;
					} else if (player.getPoint() <= 0) {
						System.out.printf("%55s","포인트가 부족합니다. 충전하세요\n");
						check = false;
						break;
					} else {
						System.out.printf("%55s","번호를 다시 입력해 주세요\n");
					}

				}
			}

		}

	}

}
