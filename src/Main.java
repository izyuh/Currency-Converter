import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = 0;
        String b = "";
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        NumberFormat eu = NumberFormat.getCurrencyInstance(new Locale("en","150"));
        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat jp = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat cad = NumberFormat.getCurrencyInstance(Locale.CANADA);
        NumberFormat yn = NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.println(eu);

        System.out.println("Please select the currency you wish to convert into from the list of options below \n");

        System.out.println(" 1 - Euro ");
        System.out.println(" 2 - English Pound ");
        System.out.println(" 3 - Japanese Yen ");
        System.out.println(" 4 - Canadian Dollar ");
        System.out.println(" 5 - Chinese Yuan ");
// sets the money to change to
        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();
// sets how much money is being changed
        System.out.println("How much U.S. currency do you wish to exchange?");
        double deposit = scanner.nextDouble();


        String c = null;
        double converted = 0;

        switch (selected) {
            case 1:
                 a = .94;
                 converted = a * deposit;
                 b = "Euro";
                 c = eu.format(converted);
                break;
            case 2:
                 a = .8;
                 converted = a * deposit;
                 b = "English Pounds";
                 c = uk.format(converted);
                break;
            case 3:
                 a = 139.67;
                 converted = a * deposit;
                 b = "Japanese Yen";
                 c = jp.format(converted);
                break;
            case 4:
                 a = 1.34;
                 converted = a * deposit;
                 b = "Canadian Dollars";
                 c = cad.format(converted);
                break;
            case 5:
                 a = 7.12;
                 converted = a * deposit;
                 b = "Chinese Yuan";
                 c = yn.format(converted);
                break;
        }

        String  z = nf.format(deposit);
        System.out.println(z + " dollars converted to " + b + " comes out to " + c + ".");

    }
}