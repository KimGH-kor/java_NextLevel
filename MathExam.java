
public class MathExam {

	public static void main(String[] args) {
		int value1 = Math.max(5, 10);//2개의 값 중 더 큰 값
		System.out.println(value1);//10
		
		int value2 = Math.min(5, 10);//2개의 값 중 더 작은 값
		System.out.println(value2);//5
		
		System.out.println(Math.abs(-10));;//절대값 10
		
		System.out.println(Math.random());//랜덤값 구해주는 Math타입은 double타입이다. -> 0~1.0 사이의 값을 구해준다.
		System.out.println(Math.sqrt(25));//제곱근을 구해준다. 5출력
		
		System.out.println(Math.pow(2, 10));//2의 10승
        System.out.println(Math.pow(16, 0.5));//16의 1/2승
        System.out.println(Math.log10(200));//log200
		
		//Math는 결국 수학적 계산을 편하게 해준다.
	}

}
