class FibonacciRecur{  

static int n1= 0, n2= 1, n3= 0;  
  
 static void printFibonacci(int num){    
 
    if(num > 0) {    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;     
         
                  System.out.print(" " + n3);   
         
         printFibonacci (num-1);    
     }    
 }    
 public static void main(String args[]){    
 
  int num =10;   
   
  System.out.println("Fibonacci Series using Recursion: ");  
  System.out.print (n1 + " " + n2);
  printFibonacci (num-2);
   
  System.out.println(" ");  
  System.out.println(" ---------------------------------- ");  
  System.out.println("       KAYE BEARNEZA BSIT 2-B       "); 
  System.out.println(" ---------------------------------- ");  
 
 }  
}
