
public class MyThread1 extends Thread {
	String str;
	public MyThread1(String str) {
		this.str = str;
	}
	
	
	@Override
	public void run() {//다른 흐름의 main메소드라고 생각하는 편이 편함
		for(int i = 0; i < 10; i++) {
			System.out.println(str);
			
//			Thread.sleep((int)(Math.random()*1000)); 너무 순식간에 끝나니깐
												//   시간을 지연시키기위한 식
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
