package com.platzi.javatests.romanNumerals;

public class RomanNumerals {

    public enum romanSymbols {
        I(1), V(5), X(10), L(50), C(100),D(500),M(1000);

        public final int value;

        romanSymbols(final int value) {
            this.value = value;
        }

        public static String getValue(int i) {
            for(romanSymbols e: romanSymbols.values()) {
                if(e.value == i) {
                    return e.toString();
                }
            }
            return null;
        }
    }

    public String arabicToRoman(int i) {
        String result = "";
        String number = String.valueOf(i);
        int digits = number.length();
        int rest = 1;
        for (int repeat = digits; repeat>0; repeat--){
            int decimal = Integer.valueOf("1"+"0".repeat(digits-rest));
            result+= calculateDecimals(Integer.valueOf(number.substring(rest-1,rest)), decimal);
            rest +=1;
        }
        return result;
    }
    private String calculateDecimals(int digit, int decimals) {
        if(digit>0&&digit<4){
            return romanSymbols.getValue(1*decimals).repeat(digit);
        } else if (digit==4) {
            return romanSymbols.getValue(1*decimals)+romanSymbols.getValue(5*decimals);
        } else if (digit==5) {
            return romanSymbols.getValue(5*decimals);
        } else if (digit>5 && digit<9) {
            return romanSymbols.getValue(5*decimals)+romanSymbols.getValue(1*decimals).repeat((digit-5));
        } else if(digit==9){
            return romanSymbols.getValue(1*decimals)+romanSymbols.getValue(10*decimals);
        } else {
            return "";
        }
    }
}

