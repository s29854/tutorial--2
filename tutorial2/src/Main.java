import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            int age = getAgeFromTheUser();
            String city = getCityFromTheUser();
            double discount = discountCalculator(age, city);
            int price = (int) priceCalculator(discount);

            System.out.println("Data: " +city+ ", " +age+ " years old, "
                    +LocalDate.now().getDayOfWeek().name().toLowerCase()+
                    "\nTicket price: " +price+ " PLN"+
                    "\nDiscount: " +Math.round((1 - discount)*100)+ "%");
        }
    public static int getAgeFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek:");
        int age = scanner.nextInt();

        return age;}

    public static String getCityFromTheUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("W jakim miescie mieszkasz?");
        String city = scanner.next();

        return city;}

    public static double discountCalculator (int age, String city){
        double discount = 1;
        if (age < 10){
            discount *= 0;
        }
        else if (age <= 18){
            discount *= 0.5;
        }
        if (city.equalsIgnoreCase("warszawa")){
            discount *= 0.9;}
        if (LocalDate.now().getDayOfWeek().name().equalsIgnoreCase("tHURSDAY")){
            discount *= 0;
        }
    return discount;}

    public static double priceCalculator(double discount){
       double price = 40*discount;
    return price;}



}
