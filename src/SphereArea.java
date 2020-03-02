
public class SphereArea implements ISubscriber{
	public double sphereArea(double r) {
		double area = 4.0 * Math.PI * r * r;
		return area;
	}
	@Override
	public void notifySubscriber(String input) {
		double r = Double.parseDouble(input);
		System.out.print("Sphere Area: ");
		if (r >= 0)
			System.out.println(sphereArea(r));
		else
			System.out.println("The radius is negative!");
	}
}
