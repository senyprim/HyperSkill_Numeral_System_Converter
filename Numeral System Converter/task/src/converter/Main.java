package converter;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Number number = new Number();
        number.setNumber(scanner.nextLine(),10);
        String otherBase = number.getNumber(8);
        System.out.print(otherBase.substring(otherBase.length()-1));
    }
}
