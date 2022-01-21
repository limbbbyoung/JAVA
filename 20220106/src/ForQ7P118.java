
public class ForQ7P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		// ****
		// ***
		// ** 
		// * 
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 4줄이므로 i반복문을 4번 반복하게 해야하는데
	    for(int i=1; i<5; i++) {
	    	// 별 갯수는 점점 줄어드므로 i포문은 큰 수에서 점점 작아지도록하고
	    	// j의 반복횟수는 처음엔 컸다가 점점 작아지는 i변수를 받아서
	    	// 줄어들게 세팅합니다.
	    	for(int j=0; j<5-i; j++) {
	    		System.out.print("*");
	    	}
	    	    System.out.println();
	        }
	    // 해답지가 두가지이다.i이 값이 증가하면서 값이 나오는 case,(위 코드는 증가하면서 값이 나오는)
	    // i값이 감소하면서 값이 나오는 case.
	    // for(int i = 4; i>0; i--) {
	    // for(int j = 0; j<i; j++) {
	    // System.out.print("*"); }
	    // System.out.println(); }
	}
}
