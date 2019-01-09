package lekcje;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class BigIntegerMnozenie {
    public static void main(String[] args) {
        BigInteger a1;
        BigInteger a2;
        StringBuilder sb1=new StringBuilder("");
        StringBuilder sb2=new StringBuilder("");
        Random random=new Random();
        for (int i = 0; i < 1e6; i++) {
            sb1.append(random.nextInt(10));
            sb2.append(random.nextInt(10));
        }
        a1=new BigInteger(sb1.toString());
        a2=new BigInteger(sb1.toString());
        System.out.println(a1.multiply(a2));
        System.out.println(new BigDecimal("10.0").divide(new BigDecimal("3.0")).toString());

    }
}
