import java.util.Scanner;
public class Lab1JavaReview {

static String[] bookTitles = new String[5];
static String[] bookStatus = new String[5]; 
static int bookCount=0; 

public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
int choice;
boolean exitProgram=false;

do {
// Display menu
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ⣠⣤⣶⣶⣶⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢦⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣤⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⠟⠁⢀⣈⠙⢿⣿⣿⣿⠟⠁⢀⣈⠙⢿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⠀⢻⣿⡿⠂⣸⣿⣿⣿⠀⢻⣿⡿⠀⣸⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣷⣤⣄⣤⣴⣿⠁⠀⣻⣷⣤⣄⣤⣴⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣧⢠⣿⣿⣿⣿⣿⣿⣿⣿⣝⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⠟⣭⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣻⣻⣿⣿⠇⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠿⢟⠿⢿⣿⡄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⡿⢿⣿⣿⣷⡈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣾⣷⣾⣿⣿⣷⣄⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣮⣶⣭⣭⣛⣽⣿⣿⣦⣈⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀");
System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⣭⣯⣻⣝⣛⣿⣿⣿⣿⣶⣤⣉⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀");
System.out.println("⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣛⣛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣉⡛⠿⣿⣿⣿⣿⣿⣿⣇⠀");
System.out.println("⠀⠀⠀⠀⠈⠙⠷⣶⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣯⣽⣿⣿⣿⣿⡄");
System.out.println("⠀⠀⠀⠀⠀⠰⣄⠀⣀⠉⠉⠛⠛⠷⠶⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠙⢿⣧");
System.out.println("⠀⠀⠀⠘⠛⠓⢉⡄⡹⠆⠀⠀⠀⠀⠀⠉⠛⠿⢷⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⡏⠛⠛⠛⠛⠛⠊⢿⣿⣿⠀⠀⠙");
System.out.println("⠀⠀⠀⠀⠀⠀⠉⠛⠋⠢⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣷⣦⣄⣀⡀⠀⠀⢀⣀⣼⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠈⢻⣿⡀⠀⠀");
System.out.println("⠈⠉⠙⠒⠲⠶⠶⢶⣶⣤⣬⣽⣶⣦⣤⣤⣤⣶⣶⣿⡿⠿⠿⠟⠛⠿⠿⠏⣴⣿⣿⠟⣛⣛⣋⣀⣀⡀⠀⠀⡀⠀⠀⠀⠀⠹⡇⠀⠀");
System.out.println("⠀⠀⠀⠀⢀⣠⠶⠛⠋⠉⠉⠁⠀⠈⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⢏⠈⡏⠈⠛⠛⠻⠿⢿⣿⣿⣿⣿⣿⣶⣦⣤⣤⠑⠀⠀");
System.out.println("⠀⠀⠀⠐⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠻⠿⣿⡇⠀⠀    ");
System.out.println("\n════════════════════⊹⊱≼≽⊰⊹════════════════════");
System.out.println("               Feather & Scroll");
System.out.println("        Library Book Management System");
System.out.println("════════════════════⊹⊱≼≽⊰⊹════════════════════\n");
System.out.println("1. Add a New Book");
System.out.println("2. Update Book Status (Available/Borrowed)");
System.out.println("3. Display All Books");
System.out.println("4. Generate Book Report");
System.out.println("5. Exit");
System.out.print("Enter choice: ");

while (!scanner.hasNextInt()) {
System.out.println("Error: Please enter a number between 1 and 5.");
System.out.print("Enter choice: ");
scanner.next();
}
choice = scanner.nextInt();
scanner.nextLine(); 
switch (choice) {
case 1: addBook(scanner); break;
case 2: updateBookStatus(scanner); break;
case 3: showBooks(); break;
case 4: generateReport();break;
case 5: exitProgram = confirmExit(scanner); break;
default:
System.out.println("Error: Invalid menu option. Please select between 1 and 7.");
}} while (!exitProgram);
scanner.close();
}
public static void addBook(Scanner scanner) {
if (bookCount >= bookTitles.length) {
System.out.println("Library storage is full. Maximum of 5 books allowed.");
return; }
System.out.print("Enter book title: ");
bookTitles[bookCount] = scanner.nextLine();
bookStatus[bookCount] = "Available"; // default status
bookCount++;
System.out.println("Book added successfully!");}
public static void updateBookStatus(Scanner scanner) {
if (bookCount == 0) {
System.out.println("No books available to update.");
return;}
showBooks();
System.out.print("Enter book number to update: ");

while (!scanner.hasNextInt()) {
System.out.println("Error: Please enter a valid book number.");
System.out.print("Enter book number to update: ");
scanner.next(); 
}
int index = scanner.nextInt() - 1;

if (index < 0 || index >= bookCount) {
System.out.println("Error: Invalid book number. Please try again.");
return;
}

if (bookStatus[index].equals("Available")) {
bookStatus[index] = "Borrowed";
System.out.println("Book \"" + bookTitles[index] + "\" is now marked as Borrowed.");
} else {
bookStatus[index] = "Available";
System.out.println("Book \"" + bookTitles[index] + "\" is now marked as Available.");
}
}

public static void showBooks() {
if (bookCount == 0) {
System.out.println("No books available in the library.");
return;
}
System.out.println("\n═════ LIST OF BOOKS ═════");
for (int i = 0; i < bookCount; i++) {
System.out.printf("%d. %s [%s]\n", i + 1, bookTitles[i], bookStatus[i]);
}
}

public static void generateReport() {
if (bookCount == 0) {
System.out.println("No books registered yet. Report cannot be generated.");
return;
}
int borrowed = 0, available = 0;
for (int i = 0; i < bookCount; i++) {
if (bookStatus[i].equals("Borrowed")) {
borrowed++;
} else {
available++;
}
}

System.out.println("\n===== SIMPLE BOOK REPORT =====");
System.out.println("Total number of Books: " + bookCount);
System.out.println("Total Number of Available Books: " + available);
System.out.println("Borrowed Books: " + borrowed);
}

public static boolean confirmExit(Scanner scanner) {
String response;
while (true) {
System.out.print("Are you sure you want to exit? (Y/N): ");
response = scanner.nextLine().trim().toUpperCase();

if (response.equals("Y")) {
System.out.println("\nThank you for using Feather & Scroll!");
System.out.println("Program has closed successfully.");
return true; 
} else if (response.equals("N")) {
System.out.println("Returning to main menu...");
return false; 
} else {
System.out.println("Your input is invalid. Please enter Y or N.");
            }
        }
    }
}

// Submitted by: Porteza Moris L. (BSCS-2D)

// AI Prompt:
// You are a Java developer at Campus Library Systems, a company that provides software solutions for schools.
// Your task is to develop a basic Library Book Management System in Java to track student book borrowing activities. 
// I will provide the seven functionalities one by one throughout our conversation. 
// Each time I mention a functionality, you must implement it properly in the code and update the existing program so that it grows feature by feature. 
// At the end of your response, provide a clear explanation not only about the functionality but also about the Java programming concepts applied.

// AI Model: GPT-5 (ChatGPT)

// Transaction ID: https://chatgpt.com/share/68c6e473-2550-8013-a25b-7e3c28124629
