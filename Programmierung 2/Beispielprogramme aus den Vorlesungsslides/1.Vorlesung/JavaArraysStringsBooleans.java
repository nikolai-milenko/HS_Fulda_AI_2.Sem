class JavaArraysStringsBooleans {

  public static void main(String[] args) {

    // instamntiate and intiailize String via constructor
    String s = new String("Test") ;

    // instantiate and initialize String via literal
    String s2 = "Test" ;

    // print out length of string
    System.out.println("String has length "+s.length()) ;

    // string literal is an instance of string. print out length of string literal
    System.out.println("Test-String".length()) ;

    // show concatenation of string with sth else
    int intVar = 1 ;
    double doubleVar = 2.0 ;
    String concatString = "intVar=" + intVar + ", doubleVar=" + doubleVar ;
    System.out.println(concatString) ;

    // print out all characters of string
    for (int i = 0; i < s.length(); i++) {
      System.out.println("character " + i + " is: " + s.charAt(i)) ;
    }

    // create 1d array of ints, no init
    int [] arr1 = new int[4] ;

    // create and initialize with literal
    int [] arr2 = {1,2,3} ;

    // Array literals are instances --> print out length of array literal
    System.out.println(new int[]{1,2,3,4}.length) ;

    // print out all elements of array
    for (int i  = 0; i < arr1.length ; i++) {
      System.out.println("Element " + i + " is " + arr1[i]) ;
    }

    // create 2D array
    int [][] arr2D = new int [3][4] ;

    // create 2D array and initialize via literal
    int [][] arr2D_2 = new int[][]{{1,1},{2,2}, {3,3}} ;

    // show that 2D arrays are arrays of arrays
    System.out.println("nr of arr2D.rows=" + arr2D_2.length) ;
    System.out.println("elements of first row in arr2d=" + arr2D_2[0].length) ;
    System.out.println("elements of 2nd row in arr2d=" + arr2D_2[0].length) ;
    
    // booleans
    boolean flag = (1 == 2) ;
    if (flag == true)  {
      System.out.println("Flag is true") ;
    }
    
   int x = 0 ;
   while(x < 100) {
	   System.out.println("Itertion " + x ) ;
	   x++ ;
   } 


  }
}

