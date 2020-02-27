
public class SphereArea implements ISubscriber{
	public double sphereArea(double r) {
		double area = 0.0;
		area = 4.0 * Math.PI * Math.pow(r, 2.0);
		return area;
	}
	@Override
	public void notifySubscriber(String input) {
		double r = Double.parseDouble(input);			
		System.out.println("Sphere Area = " + sphereArea(r));
	}

}
