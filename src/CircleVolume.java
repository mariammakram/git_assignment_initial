public class CircleVolume implements ISubscriber{

    public double calcVolume(double radius){
        double res = 0.0;
        res = (4.0 / 3.0) * Math.PI * Math.pow(radius,3.0);
        return res;
    }
    @Override
    public void notifySubscriber(String input) {
        double radius = Double.parseDouble(input);
        if(radius > 0.0){
            System.out.println("Circle Volume = " + calcVolume(radius));
        }
        else {
            System.out.println("Radius can't be a negative number.");
        }
    }
}
