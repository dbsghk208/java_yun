package hongongja2023.chap03.exam01;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5); 
		//0.1f 는 0.1의 근사값 0.10000000149011612 로 표현됨
		//따라서 float 타입으로 변환해서 정수타입으로 변환해서 비교하기
	}

}
