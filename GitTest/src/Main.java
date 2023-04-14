
public class Main {
	
	public void run() {
		
		
		// 각자의 이름에 맞게 객체 생성해주세요.

		Thai a = new Thai(); // 정용
		China b = new China(); // 소희
		Switzerland c = new Switzerland(); // 다운
		ddd d = new ddd(); // 영석
		
		a.Hello();
		a.population();
		a.capital();
		System.out.println(a.nationToKorean());
		
		System.out.println("------구분선------");
		
		b.Hello();
		b.population();
		b.capital();
		System.out.println(a.nationToKorean());
		
		System.out.println("------구분선------");
		
		c.Hello();
		c.population();
		c.capital();
		System.out.println(a.nationToKorean());
		
		System.out.println("------구분선------");
		
		d.Hello();
		d.population();
		d.capital();
		System.out.println(a.nationToKorean());
		
		System.out.println("------구분선------");
		
	}
	
	

	public static void main(String[] args) {
		Main main = new Main();
		
		main.run();
		

	}

}
