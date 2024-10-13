import java.util.Scanner;

public class Diamond {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = input.nextInt();

      if(num % 2 == 1) {

      for(int starspace = 1; starspace <= num; starspace++) {

          for(int diamondstar = 1; diamondstar <= (num - starspace)/2; diamondstar++) {
             System.out.print(" ");
          }
          for(int diamondstar = 0; diamondstar <= starspace; diamondstar++) {
             System.out.print("*");
          }
          System.out.println();
      }

      for(int starspace = num - 1; starspace >= 0; starspace--) {

          for(int diamondstar = 1; diamondstar <= (num - starspace)/2; diamondstar++) {
              System.out.print(" ");
          }
          for(int diamondstar = 1; diamondstar <= starspace; diamondstar++) {
              System.out.print("*");
          }
          System.out.println();
      }
   }
}
}
