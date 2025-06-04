import java.util.ArrayList; 

public class BoxUnbox {

  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(1) ;
    Integer i2 = new Integer(3) ;
    // Unboxing: Wrapper --> primitiv
    
    // Unboxing for addition, Boxing for toString call
    int result = i1 + i2  ; // Unboxing 
    System.out.println(result) ; // Boxing
    
    // Boxing
    Integer i4 = 1 ; // = new Integer(1) ;
    
    int i5 = i4 ; // Unboxing = i4.intValue() ; 
    
    ArrayList<Integer> al1 = new ArrayList<Integer>() ;
    al1.add(5) ; // Boxing    
  }

}
