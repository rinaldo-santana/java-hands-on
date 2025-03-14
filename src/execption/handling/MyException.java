package execption.handling;

class MyException extends Exception {
	
	private int detail;
	
	MyException(int a) {
		detail = a;
	}

	public String toString() {
		return "MyException[" + detail + "]";
	}
	
}

class ExceptionDemo() {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
