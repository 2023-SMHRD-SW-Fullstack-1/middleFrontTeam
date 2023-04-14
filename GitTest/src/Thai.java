
public class Thai extends nation {

	public String name;      // 국가명
	public int population;   // 인구수
	public String capital;   //수도
	
	
	
	public Thai() {
		super();
		this.name = "Thai";
		this.population = 71600000;
		this.capital = "방콕";
	}

	@Override
	public void Hello() {
		// 태국말로 안녕하세요는 "'싸왔디- 크랍"
		System.out.println("싸왔디- 크랍");
	}

	@Override
	public void population() {
		// 태국 인구는 프린트
		System.out.println("태국 인구는" + population + " 입니다");
		
	}

	@Override
	public void capital() {
		// 태국수도 프린트
		System.out.println("태국의 수도는 " + capital + "입니다");
		
	}

	@Override
	public String nationToKorean() {
		// 나라이름 한국말로
		return name;
	}

}
