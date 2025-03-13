package lambda;



interface MyFunc6<T> {
	MyClass6<T> func(T n);
}

class MyClass6<T> {
	private T val;
	MyClass6(T v) {this.val = v;}
	MyClass6() {val = null;}
	
	T getVal() {
		return val;
	}
}

/*
 * Demonstrate a constructor reference with a generic class.
 */
public class ConstructorRefDemo2 {

	public static void main(String[] args) {
		MyFunc6<Integer> myClassCons = MyClass6<Integer>::new;
	}

}
