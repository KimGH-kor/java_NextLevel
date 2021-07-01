//제너릭 사용하는 법 <> = 가상의 타입을 설정하고 쓸 때 바꿔주면 된다.
public class Box<E> {
//	public Object obj;
	public E obj;
	
//	public void setObj(Object obj) {
	public void setObj(E obj) {
		this.obj = obj;
	}
//	public Object getObj() {
	public E getObj() {
		return obj;
	}
	
}
