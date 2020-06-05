package converter;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Number number = new Number();
        number.setNumber(scanner.nextLine(),10);
        int base = Integer.parseInt(scanner.nextLine());
        String otherBase = number.getNumber(base);
        System.out.print(otherBase);
    }
}
