public class V1 {

  public int attribut ;

  public V1() {
	this.attribut = 0 ;    
    System.out.println("Standardkonstruktor") ;
  }

  public V1(int k) {
    this.attribut = k ;
    System.out.println("Param. konstruktor") ;    
  }

  public int getAttribut(){
    return this.attribut ;
  }

  public static void main(String[] args) {
     // constructor is called at instantiation time
    V1 ref1 = new V1() ;
    System.out.println("Attribut von ref1 = " + ref1.getAttribut()) ;
    
    // Modify references is possible at any time
    //ref1 = new V1() ;    
    V1 ref2 = new V1(5) ;
    System.out.println("Attribut von ref2 = " + ref2.getAttribut()) ;

    // Attributes can be changed at any time, no impact on other instances
    ref2.attribut = 10000 ;
    System.out.println("Attribut von ref1 = " + ref1.getAttribut()) ;    

    // access attributes directky, or by getter methods
    int ref1Attr = ref1.getAttribut() ;
    int ref2Attr = ref2.getAttribut() ;
        
  }
}
