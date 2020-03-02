public class Fibonacci implements ISubscriber {
	
	public void fibonacci(int count) {
		int N1 = 0, N2 = 1, N3 = 0;
		System.out.print(N1+" "+N2);
		for(int i = 2; i < count; i++ ) {
			
			N3 = N1 + N2;
			System.out.print(" "+N3);
			N1 = N2;
			N2 = N3;
			
		}
	}
	public void notifySubscriber(String input) {
		double count = Double.parseDouble(input);
		if ((int)count >= 0) {
			System.out.print("Fibonacci result = ");
			fibonacci((int)count);
		}
		else 
			System.out.println("Error, count can't be negative.");	
		
	}
}