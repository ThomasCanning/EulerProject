package Problem19;

public class Problem19 {

    public static void main(String[] args) {
        int firstSundays = 0;
        int jan = 2;
        int feb = 5;
        int march = 5;
        int april = 1;
        int may = 3;
        int june = 6;
        int july = 1;
        int august = 4;
        int september = 6;
        int october = 2;
        int november = 5;
        int december = 6;
        int day = 2;
        for(int year = 1901;year <=2000;year++) {

            if (year%4==0) {
                switch (day) {
                    case 1:
                        firstSundays = firstSundays + 2;
                        break;
                    case 2:
                        firstSundays = firstSundays + 1;
                        break;
                    case 3:
                        firstSundays = firstSundays + 2;
                        break;
                    case 4:
                        firstSundays = firstSundays + 2;
                        break;
                    case 5:
                        firstSundays = firstSundays + 1;
                        break;
                    case 6:
                        firstSundays = firstSundays + 1;
                        break;
                    case 7:
                        firstSundays = firstSundays + 3;
                        break;
                }
                if (day <7) day++; else day = 1;
            }
            else {
                switch (day) {
                    case 1:
                        firstSundays = firstSundays + 2;
                        break;
                    case 2:
                        firstSundays = firstSundays + 2;
                        break;
                    case 3:
                        firstSundays = firstSundays + 1;
                        break;
                    case 4:
                        firstSundays = firstSundays + 3;
                        break;
                    case 5:
                        firstSundays = firstSundays + 1;
                        break;
                    case 6:
                        firstSundays = firstSundays + 1;
                        break;
                    case 7:
                        firstSundays = firstSundays + 2;
                        break;
                }
                if (day <7) day++; else day = 1;
            }
        }
        System.out.println(firstSundays);

    }
}
