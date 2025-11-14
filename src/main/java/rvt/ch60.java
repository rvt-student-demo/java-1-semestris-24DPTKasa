package rvt;

public class ch60 {
  public static void main(String[] args) {
    
  }
    public static void ex1() {
      int[] val = {0, 1, 2, 3}; 
      int sum = 0;
      for (int i = 0; i < val.length; i++)
      sum = sum + val[i];
    System.out.println( "Sum of all numbers = " + sum );
    
  }

  public static void ex2() {

     int[] val = {13, -4, 82, 17}; 
    int[] twice = val;
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
   


 
    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );

  }

    
}
