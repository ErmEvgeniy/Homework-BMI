public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double Bmi = bmiService.calculate(49,  1.56);

        System.out.println(Bmi);
    }
}
