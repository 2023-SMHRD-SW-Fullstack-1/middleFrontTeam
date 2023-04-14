
public abstract class nation {

	
	public String name;      // 국가명
	public int population;   // 인구수
	public String capital;   //수도
	
	
	public abstract void Hello();     // 인사 명 출력

	public abstract void population();  // 인구 수 출력
	
	public abstract void capital();    // 수도명 출력
	
	public abstract String nationToKorean();   // 국가명 한글로 출력

}
