import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCalories = 0;

        while (true) {
            
            System.out.println("1. Bread - 25 calories");
            System.out.println("2. Egg - 45 calories");
            System.out.println("3. Dal - 65 calories");
            System.out.println("4. Chicken - 85 calories");
            System.out.println("5. View total calories");
            System.out.println("6. Exit");

            // Take menu input from user
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    
                    totalCalories += 25;
                    System.out.println("Bread added! Total calories: " + totalCalories);
                    break;
                case 2:
                
                    totalCalories += 45;
                    System.out.println("Egg added! Total calories: " + totalCalories);
                    break;
                case 3:
                   
                    totalCalories += 65;
                    System.out.println("Dal added! Total calories: " + totalCalories);
                    break;
                case 4:
                
                    totalCalories += 85;
                    System.out.println("Chicken added! Total calories: " + totalCalories);
                    break;
                case 5:
                   
                    System.out.println("Total calories: " + totalCalories);
                    break;
                case 6:
                    
                    System.out.println("Exiting...");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
