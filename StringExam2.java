
public class StringExam2 {
 public static void main(String[] args) {
	 String str1 = "hello world";
     String str2 = str1.substring(5);
     System.out.println(str1);
     System.out.println(str2);
     
     String str3 = str1 + str2;
     System.out.println(str3);
     //���� ���� ������ �� �Ͼ�� ��
     String str4 = new StringBuffer().append(str1).append(str2).toString();
     System.out.println(str4);
     //���� ����.
     //�̷� ��Ȳ�� �ľ��ߴٸ� for���� �������� �� Ȯ���� ���ذ�
     
     String str5 = "";
     for(int i = 0; i < 100; i++) {
    	 str5 += "*";//��� new StringBuffer�� �����ؼ� append�� ���ϰ� �ְ� ��� �ݺ� 
    	 			 //���α׷��ֿ��� new�� ��� ��������� ���� ���� �ʴ�.
     }
     System.out.println(str5);

     //���� ���̶� ���� ���� �������� �ӵ��鿡���� �����鿡���� ���� ������ ����ϴ� ���� ����.
     StringBuffer sb = new StringBuffer();
  	
  	 for(int i = 0; i < 100; i++) {
  	 sb.append("*");
  	 }
  	 String str6 = sb.toString();
  	 System.out.println(str6);

 	}
 }
