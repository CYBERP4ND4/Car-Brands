import java.util.Arrays;
import java.util.Scanner;

public class CarBrands {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] japan = { "Toyota", "Honda", "Subaru", "Mitsubishi", "Nissan", "Lexus", "Acura", "Mazda", "Suzuki",
                "Isuzu" };
        String[] china = { "Geely", "BYD - Build Your Dreams", "Changan", "NIO", "Jetour" };
        String[] korea = { "Hyundai", "Kia", "Genesis" };
        String[] italy = { "Lamborghini", "Ferrari", "Alfa Romeo", "Fiat", "Maserati", "Pagani", "Lancia",
                "Pininfarina" };
        String[] germany = { "Mercedes-Benz", "Porsche", "BMW", "Audi", "Volkswagen" };
        String[] france = { "Renault", "Bugatti", "Alpine", "Peugeot", "Citroen" };
        String[] uk = { "Jaguar", "Land Rover", "Aston Martin", "Bentley", "McLaren", "Rolls-Royce", "Lotus", "MINI",
                "Morgan", "MG", "Vauxhall" };
        String[] usa = { "Ford", "Chevrolet", "Dodge", "GMC", "Tesla", "RAM", "Jeep", "Lincoln", "Rivian", "Lucid",
                "Cadillac", "Chrysler" };

        System.out.println("Welcome to Car Brand Generator!");
        System.out.print("Enter a country: ");
        String country = input.nextLine();

        System.out.println("\nCar Brands from " + country + ":");

        if (country.equalsIgnoreCase("Japan")) {
            printBrands(japan);

        } else if (country.equalsIgnoreCase("China")) {
            printBrands(china);

        } else if (country.equalsIgnoreCase("Korea")) {
            printBrands(korea);

        } else if (country.equalsIgnoreCase("Italy")) {
            printBrands(italy);

        } else if (country.equalsIgnoreCase("germany")) {
            printBrands(germany);

        } else if (country.equalsIgnoreCase("france")) {
            printBrands(france);

        } else if (country.equalsIgnoreCase("UK")) {
            printBrands(uk);

        } else if (country.equalsIgnoreCase("USA")) {
            printBrands(usa);

        } else {
            System.out.println("Country not updated in system");
        }

        input.close();

    }

    public static void printBrands(String[] brands) {
        Arrays.sort(brands);

        for (int i = 0; i < brands.length; i++) {
            System.out.println("- " + brands[i]);
        }
    }
}
