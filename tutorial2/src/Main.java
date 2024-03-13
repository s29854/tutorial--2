import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate.now().getDayOfWeek().name();
            LocalDate today =  LocalDate.now();
            System.out.println(today.getDayOfWeek());

            Scanner scanner = new Scanner(System.in);
            double price = 40;
            System.out.println("Podaj wiek:");
            int age = scanner.nextInt();

            System.out.println("W jakim miescie mieszkasz?");
            String city = scanner.next();

            double discount = 0;
            if (age < 10 || LocalDate.now().getDayOfWeek().name().equals("THURSDAY")) {
                price = 0;
            } else if (10 <= age && age < 18) {
                discount = discount + 0.5;
                price = price*discount;
            }
            if (city.equals("Warszawa")) {
                discount = 0;

            }
            double discountedPrice = price*discount;
            System.out.println("Data: " +city+", "+age+" years old, " );
        }
    }
