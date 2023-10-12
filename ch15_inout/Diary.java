package ch15_inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Diary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//파일경로
		//날짜 포맷 정의
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//현재 날짜와 시간을 문자열로 변환
		String currentDate =sdf.format(new Date());
		String filePath = "diary.txt";
		File file = new File(filePath);
		try {
			FileOutputStream fos = new FileOutputStream(file,true);
			while(true) {
				System.out.println("오늘의 일기를 작성하세요. exit를 입력하면 종료됩니다.");
				String msg =sc.nextLine();
				
				if("exit".equalsIgnoreCase(msg)) {
					break;	
					
			
			}
			fos.write((msg+"\n").getBytes());
		  }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}
}
