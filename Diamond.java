import java.util.Scanner;

public class Diamond {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = input.nextInt();

      if(num % 2 == 1) { //for the odd diamond

      for(int starspace = 1; starspace < num; starspace+=2) {

          for(int diamondstar = 0; diamondstar < (num - starspace)/2; diamondstar++) {
             System.out.print(" ");
          }
          for(int diamondstar = 0; diamondstar < starspace; diamondstar++) {
             System.out.print("*");
          }
          System.out.println();
      }

      for(int starspace = num; starspace > 0; starspace-=2) {

          for(int diamondstar = 0; diamondstar < (num - starspace)/2; diamondstar++) {
              System.out.print(" ");
          }
          for(int diamondstar = 0; diamondstar < starspace; diamondstar++) {
              System.out.print("*");
          }
          System.out.println();
      }
} else {

      if(num % 2 == 0) { //for the even diamond

      for(int starspace = 1; starspace <= (num - 1); starspace++) {
         System.out.print(" ");
      }
      System.out.print("* ");
      System.out.println();

      for(int starspace = 1; starspace < num; starspace+=2) {

           for(int diamondstar = 0; diamondstar < (num - 1 - starspace); diamondstar++) {
              System.out.print(" ");
           }
           for(int diamondstar = 0; diamondstar <= starspace; diamondstar++) {
              System.out.print("* ");
           }
           System.out.println();
      }
      for(int starspace = num - 2; starspace > 0; starspace-=2) {

          for(int diamondstar = 0; diamondstar < (num - starspace); diamondstar++) {
           System.out.print(" ");
          }
          for(int diamondstar = 0; diamondstar < starspace; diamondstar++) {
           System.out.print("* ");
          }
          System.out.println();
        }
        for(int starspace = 1; starspace <= (num - 1); starspace++) {
           System.out.print(" ");
        }
        System.out.print("* ");
      }
    input.close();
   }
  }
}

