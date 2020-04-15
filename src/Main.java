public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double Bmi = bmiService.calculate(70,  1.7);

        System.out.println(Bmi);
    }
}
