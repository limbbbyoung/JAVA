import java.util.Scanner;

public class MethodQ3P204 {

	// 화씨온도를 입력하면 섭씨온도로 바꿔주는 메서드를 작성해보겠습니다.
	// 메서드 이름은 FtoC이고, double을 리턴합니다.
	// 리턴 받은 결과값은 main메서드에서 System.out.println();으로 출력해주세요.
	// 섭씨온도를 화씨로 바꾸는 공식
	// 화씨 = ( 섭씨 * 1.8) + 32
	public static double FtoC (double f){
		return (f-32)/1.8;
     }
	
	
	public static void main(String[] args) {
    // 스캐너를 이용해서 
	// 화씨온도를 nextDouble()로 입력 받은 다음 
    // 섭씨온도를 출력해주시면 됩니다.
		
	Scanner scan = new Scanner(System.in);
	System.out.println("화씨온도를 입력해주세요.");
	double f = scan.nextDouble();
    
	double result = FtoC(f);
    System.out.println("화씨 " + f + "도를 섭씨 온도로 바꾸면 ");
    System.out.println(result + "도 입니다.");
		
	}
}
