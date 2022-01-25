package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있습니다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1으로 받아주세요.
		Animal c1 = new Cat("냥이",2);
		Animal d1 = new Dog("멍이",3);
		Animal a1 = new Animal("동글이",1);
		
		// c1, d1, a1에 대해서 .sit()을 각각 호출해주세요.
		c1.sit();
		d1.sit();
		a1.sit();
		
		// 각 자료형의 근본적 자료형에 맞춰서 되돌려보겠습니다.
		Cat cat = (Cat)c1;
		// c1은 Animal타입이나, 힙에 저장된 데이터가 Cat
		// 이므로 Cat으로 변환이 가능함.
		cat.jump();
		
		// a1은 힙/스택 모두에 Animal로만 저장되어 있어
		// 다른 자료형으로 변환이 불가능합니다.
		//Cat cat2 = (Cat)a1;
		//cat2.jump(); // 속이 비어있는 cat을 만들게 되는것
		
		// Dog로 보았을때
		Dog dog = (Dog)d1;
		dog.bark();
		
	}
}
