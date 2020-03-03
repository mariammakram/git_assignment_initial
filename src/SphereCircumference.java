
public class SphereCircumference implements ISubscriber{
	 
	public double sphereCircumference(double r) {
		double area = 0.0;
		area = 2.0 * Math.PI * r;
		return area;
	}
	
	@Override
	public void notifySubscriber(String input) {
		double r = Double.parseDouble(input);
		System.out.print("Sphere Circumference: ");
		if (r >= 0)
			System.out.println(sphereCircumference(r));
		else
			System.out.println("The radius is negative!");
	}
	

}
