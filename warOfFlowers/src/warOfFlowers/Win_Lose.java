package warOfFlowers;

import java.util.StringTokenizer;

import javax.print.attribute.standard.Destination;
public class Win_Lose {
	
	
	// 랜덤 받은 숫자 -> 몇월인지 확인
    public int flowerNum(int num) {
       if(num==1) {
          return 11;
       }else if(num==15) {
          return 88;
       }else if (num==5) {
          return 33;
       }else if(num == 2) {
          return 1;
       }else if (num==3||num==4) {
          return 2;
       }else if (num==6) {
          return 3;
       }else if (num==7||num==8) {
          return 4;
       }else if (num==9||num==10) {
          return 5;
       }else if (num==11||num==12) {
          return 6;
       }else if (num==13||num==14) {
          return 7;
       }else if (num==16) {
          return 8;
       }else if (num==17||num==18) {
          return 9;
       }else {
          return 10;
       }
    }
    
    int num = 0;
    // 받은 패별 점수
    public int score(int numA, int numB) {
       int num1 = flowerNum(numA);
       int num2 = flowerNum(numB);
       
       
       if (num1==33 && num2==88||num1==88 && num2==33) {//38광땡
          num=38000;
          return num;
       }else if (num1==11 && num2==88||num1==88 && num2==11){//18광땡
          num=28000;
          return num;
       }else if (num1==11 && num2==33||num1==33 && num2==11){//13광땡
          num=13000;
          return num;
       }else if ((num1==num2)
    		   ||((num1==33 && num2==3)||(num1==3 && num2==33))
    		   ||((num1==11 && num2==1)||(num1==1 && num2==11))
    		   ||((num1==88 && num2==8)||(num1==8 && num2==88))) {//땡 1-10땡
    	   
    	   int min=num1 ;
    	   if(num1>num2) {
    		   min=num2;
    	   }
    	   num = min*1000;
          return num;
       }else if (num1==11 && num2==2||num1==2 && num2==11
    		   ||(num1==1 && num2==2)||(num1==2 && num2==1)) {//알리 1월2월
          num=900;
          return num;
       }else if (num1==11 && num2==4||num1==4 && num2==11
    		   ||(num1==1 && num2==4)||(num1==4 && num2==1)) {//독사 1월4월
          num=800;
          return num;
       }else if (num1==11 && num2==9||num1==9 && num2==11
    		   ||(num1==1 && num2==9)||(num1==9 && num2==1)) {//구삥 1월9월
          num=700;
          return num;
       }else if (num1==11 && num2==10||num1==10 && num2==11
    		   ||(num1==1 && num2==10)||(num1==10 && num2==1)) {//장삥 1월10월
          num=600;
          return num;
       }else if (num1==4 && num2==10||num1==10 && num2==4) {//장사 4월10일
          num=500;
          return num;
       }else if (num1==4 && num2==6||num1==6 && num2==4) {//세륙(사육)4월6월
          num=400;
          return num;
          
       }else if ((num1==3 && num2==7)||(num1==7 && num2==3)
    		   	||(num1==33 && num2==7)||(num1==7 && num2==33)) {//땡잡이
           num=0;
           return num;
       }else if ((num1+num2)%10 ==9) {//갑오 9
          num=90;
          return num;
       }else if ((num1+num2)%10 ==8) {//끗
          num=80;
          return num;
       }else if ((num1+num2)%10 ==7) {
          num=70;
          return num;
       }else if ((num1+num2)%10 ==6) {
          num=60;
          return num;
       }else if ((num1+num2)%10 ==5) {
          num=50;
          return num;
       }else if ((num1+num2)%10 ==4) { 
          num=40;
          return num;
       }else if ((num1+num2)%10 ==3) {
          num=30;
          return num;
       }else if ((num1+num2)%10 ==2) {
          num=20;
          return num;
       }else if ((num1+num2)%10 ==1) {
          num=10;
          return num;
       }else {
          num=1;
          return num;
       }
    }
    
    public String scoreLevel(int num) {
       
       if(num==38000) {
          return "삼팔광땡"; 
       }else if(num ==28000 ) {
          return "일팔광땡";
       }else if(num==13000) {
          return "일삼광땡";
       }else if(num==10000) {
          return "10땡";
       }else if (num==9500) {
    	   return "땡잡이";
       }else if(num==9000) {
          return "9땡";
       }else if(num==8000) {
          return "8땡";
       }else if(num==7000) {
          return "7땡";
       }else if(num==6000) {
          return "6땡";
       }else if(num==5000) {
          return "5땡";
       }else if(num==4000) {
          return "4땡";
       }else if(num==3000) {
          return "3땡";
       }else if(num==2000) {
          return "2땡";
       }else if(num==1000) {
          return "1땡";
       }else if(num==900) {
          return "알리";
       }else if(num==800) {
          return "독사";
       }else if(num==700) {
          return "구삥";
       }else if(num==600) {
          return "장삥";
       }else if(num==500) {
          return "장사";
       }else if(num==400) {
          return "세륙(사육)";
       }else if(num==90) {
          return "갑오";
       }else if(num==80) {
          return "8끗";
       }else if(num==70) {
          return "7끗";
       }else if(num==60) {
          return "6끗";
       }else if(num==50) {
          return "5끗";
       }else if(num==40) {
          return "4끗";
       }else if(num==30) {
          return "3끗";
       }else if(num==20) {
          return "2끗";
       }else if(num==10) {
          return "1끗";
       }else if(num==1){
          return "망통";
       }else if(num==0) {
    	  return "땡잡이(망통)";
       }else {
    	   return "망통";
	}
    }
    
    // 점수 비교후 이겼으면 true 졌으면 false
    public int result (int user, int computer1, int computer2) {
    	
       int max=0;
       if(user==0 && ((computer1==9000||computer2==9000)
    		   		||(computer1==8000||computer2==8000)
    		   		||(computer1==7000||computer2==7000)
    		   		||(computer1==6000||computer2==6000)
    		   		||(computer1==5000||computer2==5000)
    		   		||(computer1==4000||computer2==4000)
    		   		||(computer1==3000||computer2==3000)
    		   		||(computer1==2000||computer2==2000)
    		   		||(computer1==1000||computer2==1000))) {
    	   user=9500;
       }
       if(computer1==0 && ((user==9000||computer2==9000)
		   		||(user==8000||computer2==8000)
		   		||(user==7000||computer2==7000)
		   		||(user==6000||computer2==6000)
		   		||(user==5000||computer2==5000)
		   		||(user==4000||computer2==4000)
		   		||(user==3000||computer2==3000)
		   		||(user==2000||computer2==2000)
		   		||(user==1000||computer2==1000))) {
    	   computer1=9500;
       }
       if(computer2==0 && ((user==9000||computer1==9000)
		   		||(user==8000||computer1==8000)
		   		||(user==7000||computer1==7000)
		   		||(user==6000||computer1==6000)
		   		||(user==5000||computer1==5000)
		   		||(user==4000||computer1==4000)
		   		||(user==3000||computer1==3000)
		   		||(user==2000||computer1==2000)
		   		||(user==1000||computer1==1000))) {
    	   computer2=9500;
       }
       if(computer1<computer2) {
          max=computer2;
       }else {
          max=computer1;
       }
       if(user>max) {
          return 2;
       }else if(user==max){
          return 1;
       }else {
    	   return 0;
       }
       
    }
		
	

}

