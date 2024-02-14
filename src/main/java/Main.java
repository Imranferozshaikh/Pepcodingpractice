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

  public void Stresult(int Marks){
    if(Marks>=90){
      System.out.println("A");
    }
    else if(Marks>=80){
      System.out.println("B");
    }
    else if(Marks>=70){
      System.out.println("C");
    }
    else if(Marks>=60){
      System.out.println("D");
    }
    else{
      System.out.println("F");
    }
  }

  public void counting()
  {
    int i=1;
   while(i<=10){
     System.out.println(i);
     i++;
   }
  }

  public void isprime(int n){
    Scanner sc =new Scanner(System.in);
   

    for(int i=2;i<n;i++){
       int m=sc.nextInt();
      int count=0;
      

      
    }
        
      
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
    
    // Scanner sc = new Scanner(System.in);
    // //int x = sc.nextInt();
    // int m =sc.nextInt();
   // i.OddEven(x);
   // i.Stresult(m);
    i.counting();
     
 //*******************************************

    

    
    
 }



  
}