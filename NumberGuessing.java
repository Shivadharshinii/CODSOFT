import java.util.Scanner;
public class NumberGuessing {
 public static void guessing()
 {
  Scanner scan = new Scanner(System.in);
  int num = 1 + (int)(100 * Math.random());
  int limit = 5;
  int x, pick;
System.out.println( "A number to be found is chosen between 1 to 100. You got 5 picks only!");
for (x = 0; x < limit; x++) {
  System.out.println("pick the number:");
  pick =  scan.nextInt();
  if (num == pick) {
   System.out.println( "Congrats! You guessed the correct number.");
   break;
  }
 else if (num > pick ) {
        System.out.println("The num is greater than " + pick);
    }
 else if (num < pick) {
        System.out.println("The num is less than " + pick);
    }
 }
 if (x == limit) {
  System.out.println("You have exhausted the limit.");
  System.out.println("The num was " + num);
 }
}
 public static void main(String arg[])
 {
	 guessing();
 }
}