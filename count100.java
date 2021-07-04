import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//JVM이 실행 할때 감지하게 해주게 하는 명령어
public @interface count100 {//어노테이션 앞에는 @가 붙는다.
	
}
