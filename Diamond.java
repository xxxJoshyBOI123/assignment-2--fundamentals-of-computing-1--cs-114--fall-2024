import java.util.Scanner;

public class Diamond {
   public static void main(String[] args) {
      System.out.println("Enter a number: ");
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();

      int count = 1;
      for(int topspaces = 1; topspaces < num; topspaces++);{
        System.out.print(" ");

      }
      for(int topstars = 1; topstars < num; topstars++); {
        System.out.print("*");
      }

    System.out.println();

      for(int botspaces = 1; botspaces < num; botspaces++); {
        System.out.print(" ");
     }
     for(int botstars = 1; botstars < num; botstars++); {
        System.out.print("*");

     }
    System.out.println();
   }
}
