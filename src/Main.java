import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new SphereArea(),
			new CircleArea(),
			new SphereVolum(),
			new SphereCircumference(),
			new TwoPowerNSubscriber(),
			new CircleCircumference(),
			new Fibonacci(),
			new LucasSeries(), 
			new CircleVolume(),
                        new FactorialExample(),
                        new multiplicationseries(),

	};

	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		System.out.println("1-Sphere Area\n"
				+ "2-Circle Area\n"
				+"3-Sphere Volume\n"
				+"4-Sphere Circumference\n"
				+"5-2^n\n"
				+"6-Circle Circumference\n"
				+"7-Fibonacci\n"
				+"8-Lucas Series\n"
				+"9-Circle Volume\n"
				+"10-All the Previous\n"
				+"-----------------------------");
		System.out.print("Please Enter your Choice: ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		sc.reset();
		System.out.print("Please Enter your Input: ");
		String input = sc.next();
		System.out.println("-----------------------------");
		if(choice.equals("10"))
			mathTopic.dispatchEvent(input);
		else
			subscribers[Integer.parseInt(choice) - 1].notifySubscriber(input);;
		sc.close();
	}
}
