package warOfFlowers;

public class ASCII {

	public static String sign() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i< 39; i++) {
			sb.append("\n");
		}

		String a =sb
				+ "◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇\r\n"
				+ "◇                  _______. __    __  .___________.         _______       ___                      ◇\r\n"
				+ "◇                  /       ||  |  |  | |           |        |       \\     /   \\                    ◇\r\n"
				+ "◇                 |   (----`|  |  |  | `---|  |----` ______ |  .--.  |   /  ^  \\                   ◇\r\n"
				+ "◇                  \\   \\    |  |  |  |     |  |     |______||  |  |  |  /  /_\\  \\                  ◇\r\n"
				+ "◇              .----)   |   |  `--'  |     |  |             |  '--'  | /  _____  \\                 ◇\r\n"
				+ "◇              |_______/     \\______/      |__|             |_______/ /__/     \\__\\                ◇ \r\n"
				+ "◇                                                                                                  ◇\r\n"
				+ "◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇"
				+ ""
				+sb;

		return a;
	}
	
	public static String newSign2() {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i< 39; i++) {
			sb.append("\n");
		}

		String a =sb
				+"◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇\r\n"
				+ "◆                  _______. __    __  .___________.         _______       ___                      ◆\r\n"
				+ "◇                  /       ||  |  |  | |           |        |       \\     /   \\                    ◇\r\n"
				+ "◆                 |   (----`|  |  |  | `---|  |----` ______ |  .--.  |   /  ^  \\                   ◆\r\n"
				+ "◇                  \\   \\    |  |  |  |     |  |     |______||  |  |  |  /  /_\\  \\                  ◇\r\n"
				+ "◆              .----)   |   |  `--'  |     |  |             |  '--'  | /  _____  \\                 ◆\r\n"
				+ "◇              |_______/     \\______/      |__|             |_______/ /__/     \\__\\                ◇ \r\n"
				+ "◆                                                                                                  ◆\r\n"
				+ "◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇";

		return a;
		
	}
	
	

	public static String newSign() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i< 39; i++) {
			sb.append("\n");
		}
		
		String b =sb
				+"◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇\r\n"
				+ "◆                  _______. __    __  .___________.         _______       ___                      ◆\r\n"
				+ "◇                  /       ||  |  |  | |           |        |       \\     /   \\                    ◇\r\n"
				+ "◆                 |   (----`|  |  |  | `---|  |----` ______ |  .--.  |   /  ^  \\                   ◆\r\n"
				+ "◇                  \\   \\    |  |  |  |     |  |     |______||  |  |  |  /  /_\\  \\                  ◇\r\n"
				+ "◆              .----)   |   |  `--'  |     |  |             |  '--'  | /  _____  \\                 ◆\r\n"
				+ "◇              |_______/     \\______/      |__|             |_______/ /__/     \\__\\                ◇ \r\n"
				+ "◆                                                                                                  ◆\r\n"
				+ "◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇"
				+sb;
		return b;
	}
	
	public static void drawNewSign2() { 
		System.out.println(newSign2());
	

	}


	public static void drawNewSign() { 
		System.out.println(newSign());
	

	}

	public static void drawSign() {
		System.out.println(sign());
	
	}

//	public static void clearScreen() { // 화면을 새로고침하는 효과
//		 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
//		
//	}
	
	public static String rabbit() {
		
		return "   			  	   ┌─────────────────┐\r\n"
			+  "  	    			        GAME START!  \r\n"
			+  " 			   	   └─────────────────┘\r\n"
			+  "					  /) /) ||\r\n"
			+  "	 		        	 ( ´ω`||\r\n"
			+  "	 		       	 	 /　つ Φ    ";
	}




	public String win() {
		return "____    __    ____  __  .__   __. \r\n" + "\\   \\  /  \\  /   / |  | |  \\ |  | \r\n"
				+ " \\   \\/    \\/   /  |  | |   \\|  | \r\n" + "  \\            /   |  | |  . `  | \r\n"
				+ "   \\    /\\    /    |  | |  |\\   | \r\n" + "    \\__/  \\__/     |__| |__| \\__| \r\n"
				+ "                                  ";
	}

	public String lose() {
		return " __        ______        _______. _______ \r\n" + "|  |      /  __  \\      /       ||   ____|\r\n"
				+ "|  |     |  |  |  |    |   (----`|  |__   \r\n" + "|  |     |  |  |  |     \\   \\    |   __|  \r\n"
				+ "|  `----.|  `--'  | .----)   |   |  |____ \r\n" + "|_______| \\______/  |_______/    |_______|\r\n"
				+ "                                          ";

	}

	public String draw() {
		return "";
	}

}
