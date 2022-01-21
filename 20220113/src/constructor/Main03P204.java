package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		// 웹툰 2개를 만들어서 연재 진행 및 완결까지 시켜보세요.
		// 연재 회차는 3~4회로 해주세요.
		Webtoon w1 = new Webtoon("임병영","여행");
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
        w1.completeWebtoon();
        w1.getInfo();
        
        Webtoon w2 = new Webtoon("임병영","숙제");
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.getInfo();
        w2.completeWebtoon();
        w2.getInfo();
	}

}
