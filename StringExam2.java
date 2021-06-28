
public class StringExam2 {
 public static void main(String[] args) {
	 String str1 = "hello world";
     String str2 = str1.substring(5);
     System.out.println(str1);
     System.out.println(str2);
     
     String str3 = str1 + str2;
     System.out.println(str3);
     //위의 값을 돌렸을 때 일어나는 일
     String str4 = new StringBuffer().append(str1).append(str2).toString();
     System.out.println(str4);
     //값은 같다.
     //이런 상황을 파악했다면 for문을 돌려보면 더 확실히 이해감
     
     String str5 = "";
     for(int i = 0; i < 100; i++) {
    	 str5 += "*";//계속 new StringBuffer를 생성해서 append를 더하고 넣고가 계속 반복 
    	 			 //프로그래밍에서 new가 계속 만들어지는 것은 좋지 않다.
     }
     System.out.println(str5);

     //위에 값이랑 같은 값이 나오지만 속도면에서나 오류면에서나 밑의 형식을 사용하는 것이 좋다.
     StringBuffer sb = new StringBuffer();
  	
  	 for(int i = 0; i < 100; i++) {
  	 sb.append("*");
  	 }
  	 String str6 = sb.toString();
  	 System.out.println(str6);

 	}
 }
