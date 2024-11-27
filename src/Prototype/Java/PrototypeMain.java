import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrototypeMain {
    private static List<Recommendation> recommendations = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nRecommendation System Menu:");
            System.out.println("1. View Recommendations");
            System.out.println("2. Clone and Modify Recommendation");
            System.out.println("3. Add New Recommendation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewRecommendations();
                    break;
                case 2:
                    cloneAndModifyRecommendation(scanner);
                    break;
                case 3:
                    addNewRecommendation(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void viewRecommendations() {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations available.");
        } else {
            for (int i = 0; i < recommendations.size(); i++) {
                System.out.println((i + 1) + ". " + recommendations.get(i));
            }
        }
    }

    private static void cloneAndModifyRecommendation(Scanner scanner) {
        viewRecommendations();
        if (recommendations.isEmpty()) {
            return;
        }

        System.out.print("Enter the number of the recommendation to clone: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        if (index < 0 || index >= recommendations.size()) {
            System.out.println("Invalid recommendation number.");
            return;
        }

        Recommendation clonedRecommendation = recommendations.get(index).clone();
        System.out.print("Enter new target audience: ");
        String newTargetAudience = scanner.nextLine();
        clonedRecommendation.setTargetAudience(newTargetAudience);

        System.out.print("Enter new book details (author, title, genre, year) separated by commas: ");
        String[] bookDetails = scanner.nextLine().split(",");
        Book newBook = new Book(bookDetails[0].trim(), bookDetails[1].trim(), bookDetails[2].trim(), Integer.parseInt(bookDetails[3].trim()));
        clonedRecommendation.addBook(newBook);

        recommendations.add(clonedRecommendation);
        System.out.println("Cloned and modified recommendation added.");
        System.out.println("____________________________________________________");
    }

    private static void addNewRecommendation(Scanner scanner) {
        System.out.print("Enter target audience: ");
        String targetAudience = scanner.nextLine();
        Recommendation newRecommendation = new Recommendation(targetAudience);

        System.out.print("Enter book details (author, title, genre, year) separated by commas: ");
        String[] bookDetails = scanner.nextLine().split(",");
        Book newBook = new Book(bookDetails[0].trim(), bookDetails[1].trim(), bookDetails[2].trim(), Integer.parseInt(bookDetails[3].trim()));
        newRecommendation.addBook(newBook);

        recommendations.add(newRecommendation);
        System.out.println("New recommendation added.");
        System.out.println("____________________________________________________");
    }
}