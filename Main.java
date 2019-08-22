import java.util.Scanner;

public class Main {
  static Scanner in = new Scanner(System.in);

  public static void println(String s) {
    System.out.println(s);
  }
  public static void print(String s) {
    System.out.print(s);
  }
  
  public static void main(String[] args) {
    LinkedBook<Book> books = new LinkedBook<>();

    boolean isRepeat = true;
    
    do {
      println("Open Library Tel-U");
      println("1. Tambah Buku");
      println("2. Hapus Buku");
      println("3. Tampilkan Buku");
      println("4. Exit");
      print("Menu > ");

      int menu = in.nextInt();
      
      switch (menu) {
        case 1:
          insertNewBook(books);
          break;
        case 2:
          deleteBook(books);
          break;
        case 3:
          showBooks(books);
          break;
        case 4:
          System.exit(0);
          break;
        default:
          println("----------------------------------");
          println("Input salah, silahkan input kembali.");
          println("----------------------------------\n");
          break;
      }

    } while (isRepeat);
  }

  public static void showBooks(LinkedBook<Book> books) {
    println("----------------------------------");
    println("Book List.");
    println("----------------------------------");
    books.show();
    println("\n");
  }

  public static void insertNewBook(LinkedBook<Book> books) {
    in.nextLine();
    print("Judul : ");
    String title = in.nextLine();
    print("Tahun Terbit : ");
    int year = in.nextInt();

    Book tempBook = new Book(title, year);

    if (year > 2010) 
      books.insertFirst(tempBook);
    else 
      books.insertLast(tempBook);
    
    println("Buku telah berhasil disimpan\n");
  }

  public static void deleteBook(LinkedBook<Book> books) {
    if (books.size() == 0) {
      println("----------------------------------\nData sedang kosong\n----------------------------------\n");
      return;
    }

    books.removeFirst();
    println("Buku telah berhasil dihapus\n");
  }
  
}