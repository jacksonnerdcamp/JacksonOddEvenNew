package com.company;

public class Main {

    public static void main(String[] args) {
        public static String evenFirstOddLast(String input)
        {
            int x = 0;
            String evenOut = "";
            String oddOut = "";
            while x < input.length()
            {
                evenOut = evenOut + input.substring(x,x + 1);
                x += 2
            }
            x = 1;
            while x < input.length()
            {
                oddOut = oddOut + input.substring(x,x + 1);
                x += 2
            }
            System.out.printIn(evenOut + oddOut);
        }
    }
    evenFirstOddLast(somethingsuspicious);
}

