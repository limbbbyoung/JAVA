package overriding;

public class Dog extends Animal {
	public String use;
	// 추가적인 특성 : 용도를 가짐
	
	public void howl() {
		System.out.println("왈왈");
	}
    public void getInfo() { 
    	System.out.println("이름 : " + name + " , 나이 : "+ 
    		     age + ", 성별 : " + gender + " ,  용도 : " + use );
    }
}
