
public class CompareExam {
	public static void exec(Compare compare) {
		int k = 10;
		int m = 10;
		int value = compare.compare2(k, m);
		System.out.println(value);
	}
	
	public static void main(String[] args) {		
		exec((a,b)->{
			return a - b;
		});

	}

}
