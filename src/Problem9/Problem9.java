package Problem9;

import static java.lang.StrictMath.sqrt;

public class Problem9 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c;
        for(int i =0; i==0;) {
            if( ((a*a) + (b*b)) % 1 == 0 && a + b + (sqrt((a*a) + (b*b))) == 1000 && a<b && b< sqrt((a*a) + (b*b))) {
                c = (int) sqrt((a*a) + (b*b));
                System.out.println(a*b*c);
                i++;

            }
            else if ((a + b + (sqrt((a*a) + (b*b))))>1000) {
                a++;
                b = 0;
            }
            else {
                b++;


            }


        }

    }
}
