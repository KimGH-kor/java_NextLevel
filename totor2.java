import java.util.Random;
public class totor2 {
	public static String randomName(){
        StringBuffer sb = new StringBuffer();
        String[] firstNames = {"kim", "lee", "yang"};
        String[] lastNames = {"soul", "ent", "dogu"};
        
        // 0~2 ������ ������ ���ڸ� ��� �����ϰ� �̸��� �̴´�.
        int random1 = new Random().nextInt(3);
        String firstName = firstNames[random1];
                        
        int random2 = new Random().nextInt(3);
        String lastName = lastNames[random2];
        
        sb.append(firstName).append(" ").append(lastName);
        String str = sb.toString();
        return str;
    }
	
	public static void main(String[] args) {
		System.out.println(randomName());

	}

}
