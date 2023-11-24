import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        operation();
    }

    public static void operation()
    {
        String opDesicion;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the operation (encode/decode)");
        opDesicion = scan.nextLine();

        if (Objects.equals(opDesicion, "encode"))
        {
            encode();
        }
        else if (Objects.equals(opDesicion, "decode"))
        {
            decode();
        }
        else if (Objects.equals(opDesicion, "test"))
        {
            test();
        }
        else
        {
            System.out.println("Please enter a vaild operation.");
            operation();
        }
    }

    public static void encode()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter text to encode:");
        String encodeString = scan.nextLine();
        char []encodeChar = encodeString.toCharArray();
        System.out.print("Crypted: ");
        for (int j = 0; j < encodeChar.length; j++)
            if (encodeChar[j] < 'N')
            {
                System.out.print((char) (encodeString.codePointAt(j) +2));
            }
            else
            {
                System.out.print((char) (encodeString.codePointAt(j) -2));
            }

        System.out.println();
        operation();
    }

    public static void decode()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter text to decode:");
        String decodeString = scan.nextLine();
        char []decodeChar = decodeString.toCharArray();
        System.out.print("Decoded: ");
        for (int j = 0; j < decodeChar.length; j++)
            if (decodeChar[j] < 'N')
            {
                System.out.print((char) (decodeString.codePointAt(j) -2));
            }
            else
            {
                System.out.print((char) (decodeString.codePointAt(j) +2));
            }

        System.out.println();
        operation();
    }
    public static void test()
    {

    }
}