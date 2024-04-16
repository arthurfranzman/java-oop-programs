public class Library {
    private Book[] books = new Book[10];
    private int bookCounter = 0;
    
    public Library() {
        System.out.println("Hello, I am a library, which can store up to 10 books!");
    }
    
    public void add(Book book) {
        if (bookCounter >= 10) {
            System.out.println("The library is full!");
        } else {
        String formattedString = String.format("I added the book %s!", book.toString());
        System.out.println(formattedString);
        books[0] = book;
        bookCounter++;
        }
    }
    
    public Book search(String title) {
        for (Book i: this.books) {
            if (i == null) {
                continue;
            } else if (title == i.toString()) {
                System.out.println(String.format("The book with the title %s exists in the library!", title));
                return i;
            }
        }
        System.out.println(String.format("The book with the title %s does not exist in the library!", title));
        return null;
    }
}