package pl.globallogic.sessions.s11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigNumberExamples {
    public static void main(String[] args) {
        System.out.println("Long max value: " + Long.MAX_VALUE);
        System.out.println("Double max value: " + Double.MAX_VALUE);

        System.out.println(calculateFactorialBig(1000));

        BigInteger bigNUmber1 = new BigInteger("23482634982364324623469283462394892346982346237423478326487236487236487326487236847326847");

        BigInteger bigNumberFromByteArray = new BigInteger(
                new byte[] {64, 56, 34, 78, 90}
        );
        System.out.println(bigNumberFromByteArray);

        BigInteger bigIntegerFromInteger = BigInteger.valueOf(28358725478L);

        //  Overflow problem - add 1 to Long.MAX_VALUE
        //  Create BigInteger
        //  Arithmetic operations - add, divide, multiply
        BigInteger i = new BigInteger("45");
        BigInteger j = new BigInteger("63");
        System.out.println(i.gcd(j));  //  !! gcd - greatest common divisor
        System.out.println(i.multiply(j).mod(new BigInteger("4")));

        BigDecimal bigD1 = new BigDecimal("0.04");
        BigDecimal bigD2 = new BigDecimal("0.03");
        System.out.println(bigD1.subtract(bigD2));

        BigDecimal aLotOfSignsAfterComma = new BigDecimal("234234.1234567890987654321");
        MathContext context = new MathContext(3, RoundingMode.CEILING);
        System.out.println(aLotOfSignsAfterComma.abs(context));
    }

    private static BigInteger calculateFactorialBig(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private static long calculateFactorialNaive(int number) {
        long result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
