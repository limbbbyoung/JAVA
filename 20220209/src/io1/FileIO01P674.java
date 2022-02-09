package io1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO01P674 {

	public static void main(String[] args) throws IOException {
		// 외부에 텍스트파일을 만들기 위해서 FileOutputStream을 사용합니다.
		// 변수를 만들고 거기에 파일 경로를 적습니다.
		// main메서드에 반드시 throws IOException을 작성해야 합니다.
		// FileOutputStream output =
		//		new FileOutputStream("c:/io/test.txt");
		
		// 간편한 사용을 위해 FileOutputStream 자료형 대신
		// FileWriter 자료형을 쓸 수도 있습니다.
		FileWriter output = new FileWriter("c:/io/test.txt"); // 추가적으로 폴더명과 파일명은 대소문자 구분을 따로 하지 않습니다.
		
		// .write("내용")을 이용해 메모장 내부에 필기할 수 있습니다.
		// 단, 줄바꿈이 자동으로 안되기 때문에 줄바꿈이 필요한 부분에
		// \n을 추가로 붙여주시면 됩니다.
		output.write("세줄 정도 되는 글을 작성하려고 합니다.\n오늘은 2022년 2월 9일 수요일 수업을 진행중입니다."
				+ "\n오늘 날씨는 흐릿하지만 오후에 화장한 때가 있겠습니다.");
		
		// 해당 텍스트를 파일에 반영하려면 .close()로 종료해주면 됩니다.
		output.close();

	}

}
