import java.util.Scanner;

public class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

    public Book() {}

    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nAuthor: " + getAuthor() + "\nPrice: " + getPrice() + "\nNum Pages: " + getNumPages();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Num Pages: ");
            int numPages = sc.nextInt();
            sc.nextLine(); 

            books[i] = new Book(name, author, price, numPages);
        }

        display(books);
        sc.close();
    }

    static void display(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.println(books[i].toString());
            System.out.println();
        }
    }
}
