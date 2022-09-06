import java.util.concurrent.atomic.AtomicInteger;
import java.lang.*;
import java.util.Scanner;

/**
 * CurrencyConverter
 */
public class HolaMundo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("💸----Currency-Converter----💸\n");

        System.out.printf("\nCurrent currency type: ");
        String uCurrencyType = sc.next();
        System.out.printf("\nQuantity: ");
        double uCurrencyAmount = sc.nextDouble();

        //out
        System.out.printf("%.2f %s >> USD = %.4f USD\n", uCurrencyAmount, uCurrencyType, toUSD(uCurrencyAmount, uCurrencyType));
    }

    public static double toUSD(double quantity, String fromCurrency) {
        switch (fromCurrency.toUpperCase()) { //MXN|COP|BOL
            case "MXN":
                quantity *= 0.046;
                break;
            case "COP":
                quantity *= 0.00026;
                break;
            case "BRL":
                quantity *= 0.18;
                break;
            default:
                System.err.printf("ERROR: this program only supports MXN|COP|BRL >> USD\ntry again with the aforementioned currencies\n");
                System.exit(1);
                break;
        }
        return quantity;
    }
}

