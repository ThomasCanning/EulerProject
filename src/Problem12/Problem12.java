package Problem12;

public class Problem12 {
    private static int numberOfDivisors;
    private static long nextTriangleNumber;
    private static long triangleNumber;
    private static int i=1;

    static int NumberOfDivisors(long triangleNumber) {
        numberOfDivisors = 0;
        for(long i2 = 1; i2<=Math.sqrt(triangleNumber);i2++) {
            if(triangleNumber%i2 == 0) {
                if(i2==Math.sqrt(triangleNumber)) {
                    numberOfDivisors++;
                }
                else numberOfDivisors = numberOfDivisors+2;
            }
        }
        return numberOfDivisors;
    }
    static long NextTriangleNumber(long previousTriangleNumber) {
        nextTriangleNumber=previousTriangleNumber+i;
        i++;
        return nextTriangleNumber;
    }

    public static void main(String[] args) {
        while(NumberOfDivisors(triangleNumber)<=500) {
            triangleNumber = NextTriangleNumber(triangleNumber);
            System.out.println(triangleNumber);
        }
        System.out.println(NumberOfDivisors(triangleNumber));
    }
}
