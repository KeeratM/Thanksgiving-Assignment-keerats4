import java.util.Scanner;
class Main {
  static double kilograms;
  static double pounds;
  static double feet;
  static double meters;
  static double gallons;
  static double liters;
  public static void main(String[] args) {
    System.out.println("Unit converter");
    Scanner scan = new Scanner(System.in);
    int choice;
    do {
      // Print menu
      System.out.println("Please select a number 1-3 to apply the action written!");
      System.out.println("Menu:");
      System.out.println("1. Convert pounds to kilograms");
      System.out.println("2. Convert feet to meters");
      System.out.println("3. Convert gallons to liters");
      System.out.println("Enter your choice: ");
      choice = Integer.parseInt(scan.nextLine());
      switch (choice) {
        case 1:
          kilograms = inputPounds(scan);
          System.out.println("You entered " + pounds + " pounds, which is " + kilograms + " kilograms.");
          break;
        case 2:
          meters = inputFeet(scan);
          System.out.println("You entered " + feet + " feet, which is " + meters + " meters.");
          break;
        case 3:
          liters = inputGallons(scan);
          System.out.println("You entered " + gallons + " gallons, which is " + liters + " liters.");
          break;
      }
    } while (choice != 0);
  }
  public static double inputPounds(Scanner input) {
    System.out.println("Enter a weight in pounds:");
    try {
      pounds = input.nextDouble();
      double kilograms = pounds * 0.45359237;
      return kilograms;
    } catch (Exception e) {
      System.out.println("Invalid input.");
    }
    return 0;
  }
  public static double inputFeet(Scanner input) {
    System.out.println("Enter a length in feet:");
    try {
      feet = input.nextDouble();
      double meters = feet * 0.3048;
      return meters;
    } catch (Exception e) {
      System.out.println("Invalid input.");
    }
    return 0;
  }
  public static double inputGallons(Scanner input) {
    System.out.println("Enter a volume in gallons:");
    try {
      gallons = input.nextDouble();
      double liters = gallons * 3.78541;
      return liters;
    } catch (Exception e) {
      System.out.println("Invalid input.");
    }
    return 0;
  }
}