// class start {
//     public static void main(String args[]) {
//         System.out.println("hello joy");
//     }
// }

// class add {
//     public static void main(String args[]){
//        int num1 = 2, num2 = 4, sum;
//        sum = num1 + num2;
//        System.out.println(sum);
//     }
// }

import java.util.Scanner;

class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    /* If number is divisible by 2 then it's an even number
     * else odd number*/
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}

