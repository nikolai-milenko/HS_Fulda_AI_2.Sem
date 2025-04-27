import java.util.Scanner ;
import java.lang.String ;

public class LargeJavaClass {

  static int globalIntVar = 1 ;

  public static String readString() {
    System.out.print("Enter string:") ;
    Scanner sc = new Scanner(System.in) ;
    return sc.nextLine() ;
  }

  public static int countX(String s) {
    int count = 0 ; 
    int i = 0 ;
    while (i < s.length()) {
      if (s.charAt(i++) == 'X') {
        count++ ;
      }      
    }
    return count ;
  }

  public static void main(String[] args) {
    String s  = readString() ;
    globalIntVar = countX(s) ;
    System.out.println("Number of X in the string: " + globalIntVar ) ;
  }
}

