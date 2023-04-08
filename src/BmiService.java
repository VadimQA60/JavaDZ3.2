public class BmiService {

    public int calculate(double height, int mass) {
        double result = mass / (height * height);
        return (int) result;
    }
}
