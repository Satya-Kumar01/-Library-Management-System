import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Preload books
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Rich Dad Poor Dad", "Robert Kiyosaki"));
        library.addBook(new Book("Wings of Fire", "A.P.J Abdul Kalam"));

        System.out.println("Welcome to Library Management System!");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Show All Books");
            System.out.println("2. Show Available Books");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");

            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    library.showAvailableBooks();
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String titleToIssue = scanner.nextLine();
                    library.issueBook(titleToIssue);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = scanner.nextLine();
                    library.returnBook(titleToReturn);
                    break;
                case 5:
                    System.out.println("Thank you for using Library System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
