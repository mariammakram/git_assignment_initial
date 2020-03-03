public class CircleCircumference implements ISubscriber{
	
	public double circleCircumference(double radius) {
		double result = 0.0;
		result = 2 * Math.PI * radius;
		return result;
	}
	
	@Override
	public void notifySubscriber(String input) {
		double radius = Double.parseDouble(input);
		if (radius >= 0)
			System.out.println("circle circumference = " + circleCircumference(radius));
		else 
			System.out.println("Error, Radius can't be a negative number");	
		
	}
	
}