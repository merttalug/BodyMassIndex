package TemelVeriTipleriVeKullaniciGirisleri;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double weight, height, bmi;

        Scanner input =new Scanner(System.in);
        System.out.println("Please input your weight in kilograms: ");
        weight =input.nextDouble();
        System.out.println("Please input your height in meters: ");
        height = input.nextDouble();
        bmi=(weight/(height*height));

        System.out.println("Your BMI percentage is: " +bmi);
        





    }








}
