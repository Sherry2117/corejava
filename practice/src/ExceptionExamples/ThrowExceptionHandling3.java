package ExceptionExamples;

public class ThrowExceptionHandling3 {

//Problem without exception handling
    public static void main(String[] args) {
      try {
          int data = 100 / 0; //may throw exception
          System.out.println("Rest of the code 1");
      }catch (Exception e) {
          System.out.println( "Can't divide by Zero");
      }

    }
}
