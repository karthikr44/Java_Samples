interface Executable {
  int execute(int arg); 
}

class Runner {
  public void run(Executable e) {
    int val = e.execute(4);  
    System.out.println("The value is: "+ val); 
  }
}

public class MyClass {
  public static void main(String[] args) {
    
    int localvar = 10; //Local variables can be accessed only when there are final or effectively final. 
                       
    //Also lambda functions doesn't have its own scope. But anonymous classes have its own scope. 
    //So the same variable localvar cannot be defined again in lambda, but we can do that in anonymous class. 
    
    Runner r1 = new Runner(); 
    r1.run(new Executable() {
      public int execute(int arg) {
        System.out.println("Before Java 8, Lambda using Interface and Anonymous Class");
        return 8+arg;
      }
    });
    
    //Java 8
    r1.run((arg) -> {
      System.out.println("Java 8 lambda using Functional Interface"); 
      return 4+arg; 
    });
    
  }
}