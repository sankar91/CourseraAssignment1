import java.util.Scanner;

public class Stringrev {
    public static void main(String args[]){
        System.out.println("Enter a String");
        Scanner keyboard = new Scanner(System.in);
        String stringin;
        stringin = keyboard.nextLine();
        byte[] strAsByteArray = stringin.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println("Reversed String"+new String(result));
    }
    }

