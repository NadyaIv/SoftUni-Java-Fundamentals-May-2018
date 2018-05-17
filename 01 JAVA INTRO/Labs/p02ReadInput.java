package Lab;

        import java.util.Locale;
        import java.util.Scanner;

public class p02ReadInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String firstName=scanner.next();
        String lastName=scanner.next();
        int firstNumber=scanner.nextInt();
        int secondNumber=scanner.nextInt();
        int thirdNumber=scanner.nextInt();
        int sum=firstNumber+secondNumber+thirdNumber;
        scanner.nextLine();
        String end=scanner.nextLine();
        System.out.printf("%s %s %s %d",firstName,lastName,end,sum);

    }
}
