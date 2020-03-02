public class TwoPowerNSubscriber implements ISubscriber {


    int twoPowerN(int n) {

        int res = 1, value = 2;

        while (n > 0) {
            if (n % 2 == 1)
                res *= value;

            n >>= 1; //dividing n by 2
            value *= value;
        }

        return res;
    }

    @Override
    public void notifySubscriber(String input) {
        try {
            int val = Integer.parseInt(input);
            if (val == 0)
                System.out.println("2 power (" + val + ") = 1");
            else {
                int res = twoPowerN(val);
                System.out.println("2 power (" + val + ") = " + res);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Operation, your input is NaN.");
        }
    }
}
