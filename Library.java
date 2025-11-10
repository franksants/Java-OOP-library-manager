import java.util.Scanner;
public class Library implements LibraryInterface{
  final Scanner INPUT = new Scanner(System.in);
  void registerBook(){
    String autor, title;
    System.out.println("Autor: ");
    autor = INPUT.next();

    System.out.println("Title: ");
    title = INPUT.next();
  }
}
