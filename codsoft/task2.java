import java.util.Random;
import java.util.Scanner;

public class task2 {
   public task2() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      byte var3 = 1;
      byte var4 = 100;
      byte var5 = 10;
      int var7 = 0;
      System.out.println("Welcome to the Number Guessing Game!");
      System.out.println("Guess the number between " + var3 + " and " + var4 + ".");

      String var10;
      do {
         int var6 = var2.nextInt(var4 - var3 + 1) + var3;
         int var8 = 0;

         while(var8 < var5) {
            System.out.print("Enter your guess: ");
            int var9 = var1.nextInt();
            ++var8;
            if (var9 < var6) {
               System.out.println("Too low! Try again.");
            } else {
               if (var9 <= var6) {
                  System.out.println("Congratulations! You guessed the number " + var6 + " in " + var8 + " attempts.");
                  ++var7;
                  break;
               }

               System.out.println("Too high! Try again.");
            }
         }

         if (var8 == var5) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The secret number was " + var6 + ".");
         }

         System.out.print("Do you want to play again? (yes/no): ");
         var10 = var1.next();
      } while(var10.equalsIgnoreCase("yes"));

      System.out.println("Thanks for playing! Your score: " + var7 + " rounds won.");
      var1.close();
   }
}
