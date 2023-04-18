package warOfFlowers;

import java.util.StringTokenizer;

import javax.print.attribute.standard.Destination;
public class Win_Lose {

		
		// 랜덤 받은 숫자 -> 몇월인지 확인
		public int flowerNum(int num) {
			if(num==1||num==2) {
				return 1;
			}else if (num==3||num==4) {
				return 2;
			}else if (num==5||num==6) {
				return 3;
			}else if (num==7||num==8) {
				return 4;
			}else if (num==9||num==10) {
				return 5;
			}else if (num==11||num==12) {
				return 6;
			}else if (num==13||num==14) {
				return 7;
			}else if (num==15||num==16) {
				return 8;
			}else if (num==17||num==18) {
				return 9;
			}else {
				return 10;
			}
		}
		// 패 점수
		public int score(int num1, int num2) {
			if(num1==num2) {
				return num1;
			}else if(num1==3&&num2==8) {
				return 3800;
			}else if(num1==1&&num2==8) {
				return 1800;
			}else if(num1==1&&num2==3) {
				return 1300;
			}else if (num1==1&&num2==4) {
				return 1400;
			}else if (num1==1&&num2==9) {
				return 1900;
			}else if (num1==1&&num2==10) {
				return 1100;
			}else if (num1==4&&num2==10) {
				return 410;
			}else if (num1==4&&num2==6) {
				return 460;
			}else if ((num1+num2)%10 ==9) {
				return 90;
			}else if ((num1+num2)%10 ==8) {
				return 80;
			}else if ((num1+num2)%10 ==7) {
				return 70;
			}else if ((num1+num2)%10 ==6) {
				return 60;
			}else if ((num1+num2)%10 ==5) {
				return 50;
			}else if ((num1+num2)%10 ==4) { 
				return 40;
			}else if ((num1+num2)%10 ==3) {
				return 30;
			}else if ((num1+num2)%10 ==2) {
				return 20;
			}else if ((num1+num2)%10 ==1) {
				return 10;
			}else {
				return 0;
			}
		}
		// 점수 비교후 이겼으면 true 졌으면 false 반환 
		public boolean result (int user, int computer1, int computer2) {
			int max=0;
			if(computer1<computer2) {
				max=computer2;
			}else {
				max=computer1;
			}
			if(user>max) {
				return true;
			}else{
				return false;
			}
			
		}
		
		
	

}

