import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a;
        String b= null;
        int range = 0;
        String number;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);

        NumberFormat eu = NumberFormat.getCurrencyInstance(new Locale("en","150"));
        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat jp = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat cad = NumberFormat.getCurrencyInstance(Locale.CANADA);
        NumberFormat yn = NumberFormat.getCurrencyInstance(Locale.CHINA);

       System.out.println("Please select the currency you wish to convert into from the list of options below. \n");

        System.out.println(" 1 - Euro ");
        System.out.println(" 2 - English Pound ");
        System.out.println(" 3 - Japanese Yen ");
        System.out.println(" 4 - Canadian Dollar ");
        System.out.println(" 5 - Chinese Yuan ");


        while(true){

        number = scanner.nextLine();

        if (number.matches("[0-9]+")) {
            break;
        }else{
            System.out.println("Invalid number, please try again.");

        }
    }



         range = Integer.parseInt(number);

        while (range > 5 | range < 1){

                System.out.println("Please select one of the options listed above.");
                range = scanner.nextInt();

            }


       int selected = range;

// sets the money to change to


        // sets how much money is being changed
        System.out.println("How much U.S. currency do you wish to exchange?");
        String amount = scanner.next();


        while(true){

            amount = scanner.nextLine();

            if (amount.matches("[0-9]+")) {
                break;
            }else{
                System.out.println("Invalid entry, please try again.");

                continue;
            }
        }

        int convert = Integer.parseInt(amount);









        String c = null;
        double converted;

        switch (selected) {
            case 1 -> {
                a = .94;
                converted = a * convert;
                b = "Euro";
                c = eu.format(converted);
            }
            case 2 -> {
                a = .8;
                converted = a * convert;
                b = "English Pounds";
                c = uk.format(converted);
            }
            case 3 -> {
                a = 139.67;
                converted = a * convert;
                b = "Japanese Yen";
                c = jp.format(converted);
            }
            case 4 -> {
                a = 1.34;
                converted = a * convert;
                b = "Canadian Dollars";
                c = cad.format(converted);
            }
            case 5 -> {
                a = 7.12;
                converted = a * convert;
                b = "Chinese Yuan";
                c = yn.format(converted);
            }
        }

        String  z = nf.format(convert);
        System.out.println(z + " dollars converted to " + b + " comes out to " + c + ".");


    }
}