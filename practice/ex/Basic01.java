package practice.ex;

public class Basic01 {

	public static void main(String[] args) {
		// 1.다음 출력과는 ?
		
		int [] values = {1, 2, 3, 4};
		int param1, param2;
		param1 = values[0] < values[1] ? values[1] : values[0];
		System.out.println(param1);
		
		// 2.다음 배열의 4에 접근하려면 인덱스를 어떻게 써야할까요??
		int [][][] arr3 = {{{1, 2, 3},{4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
		System.out.println(arr3[0][1][0]);
		
		// 3.data 배열에 담겨있는 이름 중에 "수"가 포함되어 있는 학생의 수는?
		String [] data = {"팽수", "길수", "수잔", "수촨", "길동", "동길","호섭"};
		int cnt = 0;
		for(int i = 0 ;i < data.length; i++) {
			if(data[i].indexOf("수") >=0) {
				cnt++;
			}
		}
		System.out.println("수가 포함된 이름의 수는:"+cnt);
		// 아래 배열에서 짝수의 개수를 카운팅 하시오 
		int [] arr = {1, 2, 3, 4, 5, 8, 9, 12, 13, 16, 19};
		int count = 0;
		for(int num : arr) {
			if( num % 2 ==0) {
				count++;
			}
		}
		System.out.println("짝수는 :"+ count);
		
		
		
		
		
		
		
		
		
		
	}

}
