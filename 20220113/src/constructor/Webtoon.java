package constructor;

public class Webtoon {
	// 웹툰 이름, 연재횟수 series, 작가 painter, 완결여부 complete를 가집니다.
	public String name;
	public int series;
	public String painter;
	public boolean complete;

	// 생성자를 활용해 주세요.
	// 모든 웹툰의 연재횟수는 1로 시작합니다.
	// 모든 연재작은 처음에 완결되지 않은 상태로 시작합니다.(완결 : true, 미완결 : false)
	// 작가와 제목은 그때그때 입력받아 생성합니다.
	public Webtoon( String p, String n ) {
		painter = p;
		name = n;
		series = 1;
		complete = false;
		}
	
	// 웹툰 정보 조회하기 getInfo()를 만들어주세요.
	public void getInfo() { 
		System.out.println("웹툰 이름은 : " + name +
				" ,연재 횟수는 : "+ series + ", 완결 여부는 : " +
				complete + ", 작가 이름은 : " + painter + "입니다.");
	}
	
	// 웹툰 회차를 연재시켜줄(회차를 1씩 증가시켜줄) uploadWetoon()을 만들어주세요.
	public void uploadWebtoon() {
		series += 1;
	}
	
	// 웹툰 완결짓기를 수행할 completeWetoon()을 만들어주세요.
	public void completeWebtoon() { 
		complete = true;
	}
	
}
