package hongongja2023.chap05.exam02;

public class Exam04 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for (int i=0; i<array.length; i++ ) {
			if(max < array[i]) {  
				max = array[i];
			}
			// max 배열 값이 들어가는데 max 보다 클때만 if 문을 탄다. 
			// 따라서 for 문이 끝날때 max 는 8이 됨		
		}
		
		System.out.println("max : "+ max);
	}

}
