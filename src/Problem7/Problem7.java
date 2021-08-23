package Problem7;

public class Problem7 {
    //10001st prime, 18/03/2021
    private static boolean primeCheck(int integer) {  //Checks if something is prime
        boolean prime = true;
        if (integer == 1 || integer == 0) prime = false; //deals with 1 and 0
        for (int i = 2; i <= integer/2; i++) {
            if (integer % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

  public static void main(String[] args) {
      int n = 0;
      int i;
      int max = 10001;
      for(i =0; n < max; ) {// repeating times of array
          if (primeCheck(i)== true) {
              n++;
              i++;
          }
          else i++;
      }
      System.out.println(i-1);
        }
    }
