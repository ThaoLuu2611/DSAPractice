package JavaCode;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class DivideFraction {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0 || denominator == 0)
            return "0";
        StringBuilder str = new StringBuilder();
        if(numerator < 0 ^ denominator < 0)
            str.append("-");
        long dividend = Math.abs((long)numerator);
        long divisor = Math.abs((long)denominator);
        str.append(String.valueOf(dividend/divisor));
        long remainder = dividend%divisor;
        if(remainder == 0)
            return str.toString();
        str.append(".");
        HashMap<Long, Integer> map = new HashMap();
        while(remainder != 0){
            if(map.containsKey(remainder)){
                str.insert(map.get(remainder), "(");
                str.append(")");
                break;
            }
            map.put(remainder, str.length());
            remainder *= 10;
            str.append(String.valueOf(remainder/divisor));
            remainder %= divisor;
        }
        return str.toString();
    }
    public void printFraction(){
        System.out.print("Enter numerator ");
        Scanner scanner = new Scanner(System.in);
        int numerator = scanner.nextInt();
        System.out.print("Enter denominator ");
        int denominator = scanner.nextInt();
        System.out.println("Fraction to recurring decimal is "+fractionToDecimal(numerator, denominator));
    }
}
