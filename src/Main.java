import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
			new SphereArea(),
			new CircleArea(),
			new SphereVolum(),
			new TwoPowerNSubscriber(),
			new SphereVolum(),
			new CircleCircumference(),
			new Fibonacci(),
      new LucasSeries(), 
			new CircleVolume(),

	};

	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		System.out.println("Please Enter your Input:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
		sc.close();
	}
}
