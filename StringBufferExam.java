
public class StringBufferExam {

	public static void main(String[] args) {//��Ʈ���� �ڱ� �ڽ��� ������ �ʴ� �Һ� Ÿ��
		StringBuffer sb = new StringBuffer();//��Ʈ�� ���� Ŭ������ ���� �� �ִ�. 
		sb.append("hello");//append�� ���ڿ��� �߰� �� �� �ִ�.
		sb.append(" ");
		sb.append("world");
		String str = sb.toString();//���� Ÿ���� ��Ʈ���� toString();���� ��ȯ ���� �� �ִ�.
		System.out.println(str);//hello world
		
		//��Ʈ�� ���۰� �ڱ��ڽ��� ��ȯ�ϴ� ������ Ȯ��
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3) {
		System.out.println("sb2 == sb3");
		}//sb2 == sb3 ��� �� => ��Ʈ�� ���۴� �ڱ� �ڽ�(this)�� ��ȯ�� �ϱ� �����̴�. 
		//�̷��� �ڱ� �ڽ��� �޼ҵ带 ȣ���Ͽ� �ڱ� �ڽ��� ���� �ٲ㳪���� ���� �޼ҵ�ü�̴��̶�� �Ѵ�.
		
		
		//��� .�� �־ �߰��ؼ� ���� �� �ִ�.
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);

	}

}
