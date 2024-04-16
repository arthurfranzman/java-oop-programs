public class Book {
    public String title;
    public Book(String title) {
        this.title = title;
        String myStr = String.format("Book %s created.", title);
        System.out.println(myStr);
    }
    
    @Override
    public String toString() {
        return title;
    }
}