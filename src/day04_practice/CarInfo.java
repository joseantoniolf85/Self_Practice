package day04_practice;

public class CarInfo {

    public static void main(String[] arg) {

        int year = 2023;
        String  make = "Tesla",
                model = "ModelY",
                color = "White";
        int miles = 40_000;
        int  price = 20_000;

        System.out.println("Car information is:");
        System.out.println("\t" + year +" "+ make +" "+ model +" "+ miles +" miles, "+ color + ". $" + price + ".");


    }
}
