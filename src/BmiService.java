public class BmiService {

    public int calculate(double body, int mass) {
        double result = mass / (body * body);
        return (int) result;
    }

}
