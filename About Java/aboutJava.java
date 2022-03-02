import java.util.Scanner;

class start {
  public static void main(String args[]) {
    System.out.println("hello joy");
  }
}

// Sum two numbers
class add {
  public static void main(String args[]) {
    int num1 = 2, num2 = 4, sum;
    sum = num1 + num2;
    System.out.println(sum);
  }
}

// check even or odd
class CheckEvenOdd {
  public static void main(String args[]) {
    int num;
    System.out.println("Enter an Integer number:");

    // The input provided by user is stored in num
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    input.close();
    /*
     * If number is divisible by 2 then it's an even number
     * else odd number
     */
    if (num % 2 == 0)
      System.out.println("Entered number is even");
    else
      System.out.println("Entered number is odd");
  }
}

// multiply two integers
class multiply {
  public static void main(String args[]) {
    int num1, num2, mult;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter First number:");
    num1 = scan.nextInt();

    System.out.println("Enter Second number:");
    num2 = scan.nextInt();

    scan.close();
    mult = num1 * num2;
    System.out.println("Product is:" + mult);

  }
}

// multiplying two floating numbers
class product {
  public static void main(String args[]) {
    double n1;
    double n2;
    double pro;

    Scanner res = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    n1 = res.nextDouble();

    System.out.println("Enter the second number : ");
    n2 = res.nextDouble();
    res.close();
    pro = n1 * n2;
    System.out.println("Product is :"+pro);

  }
}
