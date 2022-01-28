package system1;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		// try~catch구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요
		// throw로 발생시키면 됩니다.
		
		// 시작시간 측정
		long start = System.currentTimeMillis();
		System.out.println("시작 시간 : " + start);
		
	    try {
	    	throw new ArrayIndexOutOfBoundsException();
	    } catch(Exception e) { 
	    	System.out.println("없던 예외를 만들었습니다.");
	    	e.printStackTrace();
	    }
		
	    // 끝나는 시간 측정
		long end = System.currentTimeMillis();
		System.out.println("끝나는 시간 : " + end);
		System.out.println("소요 시간 : " + (end - start));

	}

}
