package converter;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Number number = new Number();

        int base = Integer.parseInt(scanner.nextLine());
        number.setNumber(scanner.nextLine(),base);
        int newBase = Integer.parseInt(scanner.nextLine());
        String otherBase = number.getNumber(newBase);
        System.out.print(otherBase);
    }
}
