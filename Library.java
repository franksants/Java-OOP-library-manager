import java.util.Scanner;
public class Library implements LibraryInterface{
  final Scanner INPUT = new Scanner(System.in);
  public void registerBook(){
    String autor, title;
    System.out.println("Autor: ");
    autor = INPUT.next();

    System.out.println("Title: ");
    title = INPUT.next();
  }
}
