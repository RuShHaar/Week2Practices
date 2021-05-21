package PracticeOne;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Temperature {

    public static void temperatureConverter() {
        boolean input = false;
        Scanner scanner = new Scanner(System.in);
        BigDecimal result;

        System.out.println("Your Number: ");
        BigDecimal temperature = scanner.nextBigDecimal();
        System.out.println("What Temperature unit did you entered?: 1= Celsius, 2= Fahrenheit, 3=Kelvin ");


        while (!input) {
            int insert = scanner.nextInt();


            switch (insert) {
                case 1:
                    result = temperature.multiply(new BigDecimal(9));
                    result = result.divide(new BigDecimal(5));
                    result = result.add(new BigDecimal(32));
                    System.out.println("Celsius to Fahrenheit: "+temperature+ "° Celsius are " + result.setScale(2, RoundingMode.HALF_EVEN) + "° Fahrenheit");

                    result = temperature.add(new BigDecimal(273.15));
                    System.out.println("Celsius to Kelvin: "+temperature+ "° Celsius are " + result.setScale(2, RoundingMode.HALF_EVEN) + " Kelvin");
                    input = true;
                    break;

                case 2:
                    result = temperature.subtract(new BigDecimal(32));
                    result = result.multiply(new BigDecimal(5));
                    result = result.divide(new BigDecimal(9), 2,RoundingMode.HALF_DOWN);
                    System.out.println("Fahrenheit to Celsius: "+temperature+ "° Fahrenheit are " + result.setScale(2, RoundingMode.HALF_EVEN) + "° Celsius");

                    result = result.add(new BigDecimal(273.15));
                    System.out.println("Fahrenheit to Kelvin: " +temperature+ "° Fahrenheit are " + result.setScale(2, RoundingMode.HALF_EVEN) + " Kelvin ");
                    input = true;
                    break;

                case 3:
                    result = temperature.subtract(new BigDecimal(273.15));
                    System.out.println("Kelvin to Celsius: "+temperature+ " Kelvin are " + result.setScale(2, RoundingMode.HALF_EVEN) + "° Celsius");

                    result = result.multiply(new BigDecimal(9));
                    result = result.divide(new BigDecimal(5));
                    result = result.add(new BigDecimal(32));
                    System.out.println("Kelvin to Fahrenheit: "+temperature+ " Kelvin are " + result.setScale(2, RoundingMode.HALF_EVEN) + "° Fahrenheit");
                    input = true;
                    break;

                default:
                    System.out.println("Wrong Input. Please insert 1 , 2 or 3.");

                    break;


            }
        }


    }


}
