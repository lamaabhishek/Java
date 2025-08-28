package Names;

class LibraryBook {
    // static variable (shared by all books)
    static String libraryName = "City Central Library";

    // non-static variables (different for each book)
    String bookTitle;
    String author;

    // constructor
    LibraryBook(String title, String writer) {
        this.bookTitle = title;
        this.author = writer;
    }

    // method to display book details
    void displayDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        // create 2 books from the same library
        LibraryBook b1 = new LibraryBook("The Alchemist", "Paulo Coelho");
        LibraryBook b2 = new LibraryBook("1984", "George Orwell");

        // print details before changing library name
        System.out.println("Before changing library name:");
        b1.displayDetails();
        b2.displayDetails();

        // change the static variable (affects all objects)
        LibraryBook.libraryName = "National Library";

        // print details after changing library name
        System.out.println("After changing library name:");
        b1.displayDetails();
        b2.displayDetails();
    }
}
