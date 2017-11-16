import java.util.Scanner;
import java.util.stream.IntStream;

public class SimpleArraySum {

  static int simpleArraySum (int n, int[] ar){
    return IntStream.of( ar ).sum();
  }

  public static void main (String[] args){
    Scanner in = new Scanner( System.in );
    int n = in.nextInt();
    int[] ar = new int[n];
    for (int ar_i = 0; ar_i < n; ar_i++)
      ar[ar_i] = in.nextInt();
    int result = simpleArraySum( n, ar );
    System.out.println( result );
  }
}
