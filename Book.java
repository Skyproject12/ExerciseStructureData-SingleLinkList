public class Book {

  String title;
  int publishedYear;

  public Book(String title, int publishedYear) {
    this.title = title;
    this.publishedYear = publishedYear;
  }

  public String toString() {
    String book = title + ":" + publishedYear;
    return book;
  }
  
}