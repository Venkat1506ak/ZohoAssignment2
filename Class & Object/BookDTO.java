class BookDTO{
    private String title;
    private String ISBN;
    private String author;
    private double price;

    public BookDTO(String title,String author,String ISBN,double price){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        
        this.price=price;
    }

    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args){
        BookDTO book1 = new BookDTO("Java Programming", "James Gosling", "1234567890", 499.99);
        BookDTO book2 = new BookDTO("Effective Java", "Joshua Bloch", "9876543210", 599.99);

        book2.displayBookInfo();
    }
}