package lambda;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Implementacao com  lambda  */
		MyNumber mynumber;
		
		mynumber = () -> 123.45;
		
		System.out.println(mynumber.getValue());
		
		
		/* Implementacao sem lambda  */
		
		MyNumber number = new MyNumber() {
			@Override
			public double getValue() {
				return 123;
			}
		};
		
		System.out.println(number.getValue());

//		List<Integer> numbers = Arrays.asList(1,2,3);
//		
//		numbers.forEach(x -> System.out.println(x));
//		
//		List<Integer> newList = numbers.stream()
//				.map(x -> x * 2)
//				.collect(Collectors.toList());
//		
//		newList.forEach(x -> System.out.print(x));

	}
	
	interface MyNumber {
		double getValue();
	}


}
