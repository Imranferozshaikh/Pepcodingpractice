// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// class A{

//   abstract void print();
// }
import java.util.Scanner;

class imp{

public void OddEven(int n){
  if(n%2==0){
    System.out.println("Even");
  }
  else{
    System.out.println("Odd");
  }
}
  
  
}

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");


  // overridding void print(){
  //   System.out.println( " this is overriding implement here" );
  // } 
  //  a.print();
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }

// Odd and Even number 
    imp i = new imp();
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    i.OddEven(x);
     
 
    
 }



  
}