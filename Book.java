public class Book {
        private String name, isbn, author, publisher;
    
        public Book(String name, String isbn, String author, String publisher) {
            this.name = name;
            this.isbn = isbn;
            this.author = author;
            this.publisher = publisher;
        }
    
        public String getBookInfo() {
            return "Book: " + name + ", ISBN: " + isbn + ", Author: " + author + ", Publisher: " + publisher;
        }
    
        public static void main(String[] args) {
            Book book = new Book("Java Basics", "123-456-789", "ShuaaR", "TechPublisher");
            System.out.println(book.getBookInfo());
        }
    }
    
    

